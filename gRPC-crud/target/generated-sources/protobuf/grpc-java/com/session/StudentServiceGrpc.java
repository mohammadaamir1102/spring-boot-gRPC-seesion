package com.session;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class StudentServiceGrpc {

  private StudentServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "StudentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.session.StudentRequest,
      com.session.StudentResponse> getCreateStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createStudent",
      requestType = com.session.StudentRequest.class,
      responseType = com.session.StudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.session.StudentRequest,
      com.session.StudentResponse> getCreateStudentMethod() {
    io.grpc.MethodDescriptor<com.session.StudentRequest, com.session.StudentResponse> getCreateStudentMethod;
    if ((getCreateStudentMethod = StudentServiceGrpc.getCreateStudentMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getCreateStudentMethod = StudentServiceGrpc.getCreateStudentMethod) == null) {
          StudentServiceGrpc.getCreateStudentMethod = getCreateStudentMethod =
              io.grpc.MethodDescriptor.<com.session.StudentRequest, com.session.StudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.session.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.session.StudentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("createStudent"))
              .build();
        }
      }
    }
    return getCreateStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.session.StudentIdRequest,
      com.session.StudentResponse> getGetStudentByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStudentById",
      requestType = com.session.StudentIdRequest.class,
      responseType = com.session.StudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.session.StudentIdRequest,
      com.session.StudentResponse> getGetStudentByIdMethod() {
    io.grpc.MethodDescriptor<com.session.StudentIdRequest, com.session.StudentResponse> getGetStudentByIdMethod;
    if ((getGetStudentByIdMethod = StudentServiceGrpc.getGetStudentByIdMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetStudentByIdMethod = StudentServiceGrpc.getGetStudentByIdMethod) == null) {
          StudentServiceGrpc.getGetStudentByIdMethod = getGetStudentByIdMethod =
              io.grpc.MethodDescriptor.<com.session.StudentIdRequest, com.session.StudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getStudentById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.session.StudentIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.session.StudentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("getStudentById"))
              .build();
        }
      }
    }
    return getGetStudentByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.session.Empty,
      com.session.StudentList> getGetAllStudentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllStudents",
      requestType = com.session.Empty.class,
      responseType = com.session.StudentList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.session.Empty,
      com.session.StudentList> getGetAllStudentsMethod() {
    io.grpc.MethodDescriptor<com.session.Empty, com.session.StudentList> getGetAllStudentsMethod;
    if ((getGetAllStudentsMethod = StudentServiceGrpc.getGetAllStudentsMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetAllStudentsMethod = StudentServiceGrpc.getGetAllStudentsMethod) == null) {
          StudentServiceGrpc.getGetAllStudentsMethod = getGetAllStudentsMethod =
              io.grpc.MethodDescriptor.<com.session.Empty, com.session.StudentList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllStudents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.session.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.session.StudentList.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("getAllStudents"))
              .build();
        }
      }
    }
    return getGetAllStudentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.session.StudentIdRequest,
      com.session.DeleteStudentResponse> getDeleteStudentByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteStudentById",
      requestType = com.session.StudentIdRequest.class,
      responseType = com.session.DeleteStudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.session.StudentIdRequest,
      com.session.DeleteStudentResponse> getDeleteStudentByIdMethod() {
    io.grpc.MethodDescriptor<com.session.StudentIdRequest, com.session.DeleteStudentResponse> getDeleteStudentByIdMethod;
    if ((getDeleteStudentByIdMethod = StudentServiceGrpc.getDeleteStudentByIdMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getDeleteStudentByIdMethod = StudentServiceGrpc.getDeleteStudentByIdMethod) == null) {
          StudentServiceGrpc.getDeleteStudentByIdMethod = getDeleteStudentByIdMethod =
              io.grpc.MethodDescriptor.<com.session.StudentIdRequest, com.session.DeleteStudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteStudentById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.session.StudentIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.session.DeleteStudentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("deleteStudentById"))
              .build();
        }
      }
    }
    return getDeleteStudentByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.session.StudentRequest,
      com.session.StudentResponse> getUpdateStudentByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateStudentById",
      requestType = com.session.StudentRequest.class,
      responseType = com.session.StudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.session.StudentRequest,
      com.session.StudentResponse> getUpdateStudentByIdMethod() {
    io.grpc.MethodDescriptor<com.session.StudentRequest, com.session.StudentResponse> getUpdateStudentByIdMethod;
    if ((getUpdateStudentByIdMethod = StudentServiceGrpc.getUpdateStudentByIdMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getUpdateStudentByIdMethod = StudentServiceGrpc.getUpdateStudentByIdMethod) == null) {
          StudentServiceGrpc.getUpdateStudentByIdMethod = getUpdateStudentByIdMethod =
              io.grpc.MethodDescriptor.<com.session.StudentRequest, com.session.StudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateStudentById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.session.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.session.StudentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("updateStudentById"))
              .build();
        }
      }
    }
    return getUpdateStudentByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StudentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentServiceStub>() {
        @java.lang.Override
        public StudentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentServiceStub(channel, callOptions);
        }
      };
    return StudentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static StudentServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentServiceBlockingV2Stub>() {
        @java.lang.Override
        public StudentServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return StudentServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StudentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentServiceBlockingStub>() {
        @java.lang.Override
        public StudentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentServiceBlockingStub(channel, callOptions);
        }
      };
    return StudentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StudentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentServiceFutureStub>() {
        @java.lang.Override
        public StudentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentServiceFutureStub(channel, callOptions);
        }
      };
    return StudentServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createStudent(com.session.StudentRequest request,
        io.grpc.stub.StreamObserver<com.session.StudentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateStudentMethod(), responseObserver);
    }

    /**
     */
    default void getStudentById(com.session.StudentIdRequest request,
        io.grpc.stub.StreamObserver<com.session.StudentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStudentByIdMethod(), responseObserver);
    }

    /**
     */
    default void getAllStudents(com.session.Empty request,
        io.grpc.stub.StreamObserver<com.session.StudentList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllStudentsMethod(), responseObserver);
    }

    /**
     */
    default void deleteStudentById(com.session.StudentIdRequest request,
        io.grpc.stub.StreamObserver<com.session.DeleteStudentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteStudentByIdMethod(), responseObserver);
    }

    /**
     */
    default void updateStudentById(com.session.StudentRequest request,
        io.grpc.stub.StreamObserver<com.session.StudentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateStudentByIdMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service StudentService.
   */
  public static abstract class StudentServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return StudentServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service StudentService.
   */
  public static final class StudentServiceStub
      extends io.grpc.stub.AbstractAsyncStub<StudentServiceStub> {
    private StudentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentServiceStub(channel, callOptions);
    }

    /**
     */
    public void createStudent(com.session.StudentRequest request,
        io.grpc.stub.StreamObserver<com.session.StudentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStudentById(com.session.StudentIdRequest request,
        io.grpc.stub.StreamObserver<com.session.StudentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStudentByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllStudents(com.session.Empty request,
        io.grpc.stub.StreamObserver<com.session.StudentList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllStudentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteStudentById(com.session.StudentIdRequest request,
        io.grpc.stub.StreamObserver<com.session.DeleteStudentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteStudentByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateStudentById(com.session.StudentRequest request,
        io.grpc.stub.StreamObserver<com.session.StudentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateStudentByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service StudentService.
   */
  public static final class StudentServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<StudentServiceBlockingV2Stub> {
    private StudentServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.session.StudentResponse createStudent(com.session.StudentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.session.StudentResponse getStudentById(com.session.StudentIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStudentByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.session.StudentList getAllStudents(com.session.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllStudentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.session.DeleteStudentResponse deleteStudentById(com.session.StudentIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteStudentByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.session.StudentResponse updateStudentById(com.session.StudentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateStudentByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service StudentService.
   */
  public static final class StudentServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<StudentServiceBlockingStub> {
    private StudentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.session.StudentResponse createStudent(com.session.StudentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.session.StudentResponse getStudentById(com.session.StudentIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStudentByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.session.StudentList getAllStudents(com.session.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllStudentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.session.DeleteStudentResponse deleteStudentById(com.session.StudentIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteStudentByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.session.StudentResponse updateStudentById(com.session.StudentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateStudentByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service StudentService.
   */
  public static final class StudentServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<StudentServiceFutureStub> {
    private StudentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.session.StudentResponse> createStudent(
        com.session.StudentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateStudentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.session.StudentResponse> getStudentById(
        com.session.StudentIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStudentByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.session.StudentList> getAllStudents(
        com.session.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllStudentsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.session.DeleteStudentResponse> deleteStudentById(
        com.session.StudentIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteStudentByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.session.StudentResponse> updateStudentById(
        com.session.StudentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateStudentByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_STUDENT = 0;
  private static final int METHODID_GET_STUDENT_BY_ID = 1;
  private static final int METHODID_GET_ALL_STUDENTS = 2;
  private static final int METHODID_DELETE_STUDENT_BY_ID = 3;
  private static final int METHODID_UPDATE_STUDENT_BY_ID = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_STUDENT:
          serviceImpl.createStudent((com.session.StudentRequest) request,
              (io.grpc.stub.StreamObserver<com.session.StudentResponse>) responseObserver);
          break;
        case METHODID_GET_STUDENT_BY_ID:
          serviceImpl.getStudentById((com.session.StudentIdRequest) request,
              (io.grpc.stub.StreamObserver<com.session.StudentResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_STUDENTS:
          serviceImpl.getAllStudents((com.session.Empty) request,
              (io.grpc.stub.StreamObserver<com.session.StudentList>) responseObserver);
          break;
        case METHODID_DELETE_STUDENT_BY_ID:
          serviceImpl.deleteStudentById((com.session.StudentIdRequest) request,
              (io.grpc.stub.StreamObserver<com.session.DeleteStudentResponse>) responseObserver);
          break;
        case METHODID_UPDATE_STUDENT_BY_ID:
          serviceImpl.updateStudentById((com.session.StudentRequest) request,
              (io.grpc.stub.StreamObserver<com.session.StudentResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateStudentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.session.StudentRequest,
              com.session.StudentResponse>(
                service, METHODID_CREATE_STUDENT)))
        .addMethod(
          getGetStudentByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.session.StudentIdRequest,
              com.session.StudentResponse>(
                service, METHODID_GET_STUDENT_BY_ID)))
        .addMethod(
          getGetAllStudentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.session.Empty,
              com.session.StudentList>(
                service, METHODID_GET_ALL_STUDENTS)))
        .addMethod(
          getDeleteStudentByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.session.StudentIdRequest,
              com.session.DeleteStudentResponse>(
                service, METHODID_DELETE_STUDENT_BY_ID)))
        .addMethod(
          getUpdateStudentByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.session.StudentRequest,
              com.session.StudentResponse>(
                service, METHODID_UPDATE_STUDENT_BY_ID)))
        .build();
  }

  private static abstract class StudentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StudentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.session.StudentProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StudentService");
    }
  }

  private static final class StudentServiceFileDescriptorSupplier
      extends StudentServiceBaseDescriptorSupplier {
    StudentServiceFileDescriptorSupplier() {}
  }

  private static final class StudentServiceMethodDescriptorSupplier
      extends StudentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    StudentServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StudentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StudentServiceFileDescriptorSupplier())
              .addMethod(getCreateStudentMethod())
              .addMethod(getGetStudentByIdMethod())
              .addMethod(getGetAllStudentsMethod())
              .addMethod(getDeleteStudentByIdMethod())
              .addMethod(getUpdateStudentByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
