package com.aamir.service;

import com.aamir.StockRequest;
import com.aamir.StockResponse;
import com.aamir.StockTradingServiceGrpc;
import com.aamir.entity.Stock;
import com.aamir.repo.StockRepository;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.grpc.server.service.GrpcService;

// This class implements the gRPC service for stock trading
@GrpcService
public class StockTradingServiceImpl extends StockTradingServiceGrpc.StockTradingServiceImplBase {

    @Autowired
    private StockRepository stockRepository;

    // This method handles the gRPC request to get the stock price
    @Override
    public void getStockPrice(StockRequest request, StreamObserver<StockResponse> responseObserver) {

        // Extract the stock symbol from the request
        String stockSymbol = request.getStockSymbol();

        // Fetch the stock data from the repository using the stock symbol
        Stock stockData = stockRepository.findByStockSymbol(stockSymbol);

        // Build the StockResponse using the data fetched from the Stock entity
        StockResponse stockResponse = StockResponse.newBuilder()
                .setStockSymbol(stockData.getStockSymbol())
                .setTimestamp(stockData.getLastUpdated().toString())
                .setPrice(stockData.getPrice()).build();

        // Send the response back to the client
        responseObserver.onNext(stockResponse);

        // Indicate that the response is complete
        responseObserver.onCompleted();

    }
}
