package com.session.service;

import com.session.*;
import com.session.entity.Student;
import com.session.exception.GrpcExceptionHandler;
import com.session.exception.GrpcStudentNotFoundException;
import com.session.repo.StudentRepository;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.springframework.grpc.server.service.GrpcService;

import java.util.List;
import java.util.Optional;

@GrpcService
@RequiredArgsConstructor
public class StudentServiceImpl extends StudentServiceGrpc.StudentServiceImplBase {

    private final StudentRepository studentRepository;

    @Override
    public void createStudent(StudentRequest request, StreamObserver<StudentResponse> responseObserver) {

        // Build a new Student entity using the data from the gRPC request.
        // The builder pattern is used here for creating the Student object.
        Student student = Student.builder()
                .name(request.getName()) // Set the student's name from the request.
                .email(request.getEmail()) // Set the student's email from the request.
                .build();

        // Save the newly created Student entity to the database.
        // The save method returns the saved entity, including the generated ID.
        student = studentRepository.save(student);

        // Build a StudentResponse object to send back to the client.
        // This response includes the student's ID, name, and email.
        StudentResponse studentResponse = StudentResponse.newBuilder()
                .setId(student.getId()) // Set the student's ID in the response.
                .setName(student.getName()) // Set the student's name in the response.
                .setEmail(student.getEmail()) // Set the student's email in the response.
                .build();

        // Send the response back to the client.
        responseObserver.onNext(studentResponse);

        // Mark the gRPC call as completed.
        responseObserver.onCompleted();
    }

    @Override
    public void getStudentById(StudentIdRequest request, StreamObserver<StudentResponse> responseObserver) {

        try {
            // Retrieve the student from the database using the provided ID.
            // The result is wrapped in an Optional to handle cases where the student might not exist.
            Optional<Student> studentOptional = studentRepository.findById(request.getId());

            // Process the Optional result.
            studentOptional.ifPresentOrElse(
                    student -> {
                        // If the student is found, build a StudentResponse object with the student's details.
                        StudentResponse response = StudentResponse.newBuilder()
                                .setId(student.getId()) // Set the student's ID in the response.
                                .setName(student.getName()) // Set the student's name in the response.
                                .setEmail(student.getEmail()) // Set the student's email in the response.
                                .build();

                        // Send the response back to the client.
                        responseObserver.onNext(response);

                        // Mark the gRPC call as completed.
                        responseObserver.onCompleted();
                    },
                    () -> {
                        // If the student is not found, throw a custom exception with an appropriate error message.
                        throw new GrpcStudentNotFoundException("Student not found with id: " + request.getId());
                    }
            );
        } catch (Exception e) {
            // Handle any exceptions that occur during the process.
            // Use a custom exception handler to send an error response back to the client.
            responseObserver.onError(GrpcExceptionHandler.handleException(e));
        }
    }

    @Override
    public void getAllStudents(Empty request, StreamObserver<StudentList> responseObserver) {
        // Retrieve all students from the database.
        // The findAll() method fetches all records from the Student table.
        List<Student> allStudents = studentRepository.findAll();

        // Convert the list of Student entities to a list of StudentResponse objects.
        // This is done using the stream API and mapping each Student entity to a StudentResponse.
        List<StudentResponse> studentResponse = allStudents.stream()
                .map(student -> {
                    // Build a StudentResponse object for each Student entity.
                    return StudentResponse.newBuilder()
                            .setId(student.getId()) // Set the student's ID in the response.
                            .setName(student.getName()) // Set the student's name in the response.
                            .setEmail(student.getEmail()) // Set the student's email in the response.
                            .build();
                }).toList();

        // Build a StudentList object containing all the StudentResponse objects.
        // This object will be sent back to the client as the response.
        StudentList allStudentResponse = StudentList.newBuilder()
                .addAllStudents(studentResponse) // Add all StudentResponse objects to the StudentList.
                .build();

        // Send the StudentList response back to the client.
        responseObserver.onNext(allStudentResponse);

        // Mark the gRPC call as completed.
        responseObserver.onCompleted();
    }

    @Override
    public void deleteStudentById(StudentIdRequest request, StreamObserver<DeleteStudentResponse> responseObserver) {
        // Delete the student record from the database using the provided ID.
        // The deleteById method removes the record with the matching ID from the Student table.
        // check the student existence
        studentRepository.deleteById(request.getId());

        // Build a DeleteStudentResponse object to send a confirmation message back to the client.
        // The response includes a message indicating the successful deletion of the student.
        DeleteStudentResponse deleteResponse = DeleteStudentResponse.newBuilder()
                .setMessage("Deleted student with id: " + request.getId()) // Set the confirmation message.
                .build();

        // Send the response back to the client.
        responseObserver.onNext(deleteResponse);

        // Mark the gRPC call as completed.
        responseObserver.onCompleted();
    }

    @Override
    public void updateStudentById(StudentRequest request, StreamObserver<StudentResponse> responseObserver) {
        try {
            // Retrieve the student from the database using the provided ID.
            // The result is wrapped in an Optional to handle cases where the student might not exist.
            Optional<Student> studentOptional = studentRepository.findById(request.getId());

            // Process the Optional result.
            studentOptional.ifPresentOrElse(
                    student -> {
                        // If the student is found, update the student's name and email with the new values from the request.
                        student.setName(request.getName());
                        student.setEmail(request.getEmail());

                        // Save the updated student entity back to the database.
                        student = studentRepository.save(student);

                        // Build a StudentResponse object with the updated student's details.
                        StudentResponse response = StudentResponse.newBuilder()
                                .setId(student.getId()) // Set the student's ID in the response.
                                .setName(student.getName()) // Set the updated name in the response.
                                .setEmail(student.getEmail()) // Set the updated email in the response.
                                .build();

                        // Send the response back to the client.
                        responseObserver.onNext(response);

                        // Mark the gRPC call as completed.
                        responseObserver.onCompleted();
                    },
                    () -> {
                        // If the student is not found, throw a custom exception with an appropriate error message.
                        throw new GrpcStudentNotFoundException("Student not found with id: " + request.getId());
                    }
            );
        } catch (Exception e) {
            // Handle any exceptions that occur during the process.
            // Use a custom exception handler to send an error response back to the client.
            responseObserver.onError(GrpcExceptionHandler.handleException(e));
        }
    }
}
