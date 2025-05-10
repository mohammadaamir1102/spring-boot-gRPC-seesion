package com.session.exception;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;

/**
 * The GrpcExceptionHandler class provides a centralized mechanism for handling exceptions
 * in a gRPC-based application. It converts Java exceptions into gRPC-specific exceptions
 * (StatusRuntimeException) that can be sent back to the client with appropriate error codes
 * and descriptions.
 */
public class GrpcExceptionHandler {

    /**
     * Handles exceptions and maps them to gRPC StatusRuntimeException.
     *
     * @param e The exception to be handled.
     * @return A StatusRuntimeException that represents the gRPC error status.
     *
     * <p>This method checks the type of the exception and maps it to a specific gRPC status.
     * For example:
     * - If the exception is an instance of GrpcStudentNotFoundException, it maps to a NOT_FOUND status.
     * - For all other exceptions, it defaults to a NOT_FOUND status with the exception's message.
     *
     * <p>The returned StatusRuntimeException can be sent back to the gRPC client, providing
     * a clear and standardized error response.
     */
    public static StatusRuntimeException handleException(Exception e) {
        if (e instanceof GrpcStudentNotFoundException) {
            // Maps GrpcStudentNotFoundException to a NOT_FOUND gRPC status with a description.
            return Status.NOT_FOUND
                    .withDescription(e.getMessage())
                    .asRuntimeException();
        } else {
            // Default case: Maps all other exceptions to a NOT_FOUND gRPC status with a description.
            return Status.INTERNAL
                    .withDescription(e.getMessage())
                    .asRuntimeException();
        }
    }
}