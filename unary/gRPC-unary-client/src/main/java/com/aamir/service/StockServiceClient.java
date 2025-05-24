package com.aamir.service;

import com.aamir.StockRequest;
import com.aamir.StockResponse;
import com.aamir.StockTradingServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

// This class is a gRPC client that communicates with the StockTradingService
@Service
public class StockServiceClient {


    // This annotation injects the gRPC client stub for the StockTradingService
    @GrpcClient("stock-trading-service")
    private StockTradingServiceGrpc.StockTradingServiceBlockingStub stockTradingServiceBlockingStub;

    public StockResponse getStockPrice(String stockSymbol){

        // Create a StockRequest object with the stock symbol
        StockRequest request = StockRequest.newBuilder()
                .setStockSymbol(stockSymbol)
                .build();

        // Call the gRPC service method to get the stock price
        return stockTradingServiceBlockingStub.getStockPrice(request);
    }

}
