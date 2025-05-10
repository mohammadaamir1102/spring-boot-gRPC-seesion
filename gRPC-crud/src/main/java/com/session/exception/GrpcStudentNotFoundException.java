package com.session.exception;

/**
 * Custom exception class for handling cases where a student is not found.
 * This exception extends the RuntimeException, allowing it to be thrown
 * without being explicitly declared in the method signature.
 */
public class GrpcStudentNotFoundException extends RuntimeException {

    /**
     * Constructor for the GrpcStudentNotFoundException.
     *
     * @param message The error message describing the exception.
     */
    public GrpcStudentNotFoundException(String message) {
        super(message);
    }
}