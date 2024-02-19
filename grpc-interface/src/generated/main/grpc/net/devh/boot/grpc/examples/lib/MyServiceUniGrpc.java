package net.devh.boot.grpc.examples.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: grpc.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MyServiceUniGrpc {

  private MyServiceUniGrpc() {}

  public static final java.lang.String SERVICE_NAME = "net.devh.boot.grpc.example.MyServiceUni";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.devh.boot.grpc.examples.lib.HelloRequest,
      net.devh.boot.grpc.examples.lib.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = net.devh.boot.grpc.examples.lib.HelloRequest.class,
      responseType = net.devh.boot.grpc.examples.lib.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<net.devh.boot.grpc.examples.lib.HelloRequest,
      net.devh.boot.grpc.examples.lib.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<net.devh.boot.grpc.examples.lib.HelloRequest, net.devh.boot.grpc.examples.lib.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = MyServiceUniGrpc.getSayHelloMethod) == null) {
      synchronized (MyServiceUniGrpc.class) {
        if ((getSayHelloMethod = MyServiceUniGrpc.getSayHelloMethod) == null) {
          MyServiceUniGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<net.devh.boot.grpc.examples.lib.HelloRequest, net.devh.boot.grpc.examples.lib.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.devh.boot.grpc.examples.lib.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.devh.boot.grpc.examples.lib.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new MyServiceUniMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MyServiceUniStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyServiceUniStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyServiceUniStub>() {
        @java.lang.Override
        public MyServiceUniStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyServiceUniStub(channel, callOptions);
        }
      };
    return MyServiceUniStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MyServiceUniBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyServiceUniBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyServiceUniBlockingStub>() {
        @java.lang.Override
        public MyServiceUniBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyServiceUniBlockingStub(channel, callOptions);
        }
      };
    return MyServiceUniBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MyServiceUniFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyServiceUniFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyServiceUniFutureStub>() {
        @java.lang.Override
        public MyServiceUniFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyServiceUniFutureStub(channel, callOptions);
        }
      };
    return MyServiceUniFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    default void sayHello(net.devh.boot.grpc.examples.lib.HelloRequest request,
        io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MyServiceUni.
   */
  public static abstract class MyServiceUniImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MyServiceUniGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MyServiceUni.
   */
  public static final class MyServiceUniStub
      extends io.grpc.stub.AbstractAsyncStub<MyServiceUniStub> {
    private MyServiceUniStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyServiceUniStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyServiceUniStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(net.devh.boot.grpc.examples.lib.HelloRequest request,
        io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MyServiceUni.
   */
  public static final class MyServiceUniBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MyServiceUniBlockingStub> {
    private MyServiceUniBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyServiceUniBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyServiceUniBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public java.util.Iterator<net.devh.boot.grpc.examples.lib.HelloReply> sayHello(
        net.devh.boot.grpc.examples.lib.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MyServiceUni.
   */
  public static final class MyServiceUniFutureStub
      extends io.grpc.stub.AbstractFutureStub<MyServiceUniFutureStub> {
    private MyServiceUniFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyServiceUniFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyServiceUniFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

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
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((net.devh.boot.grpc.examples.lib.HelloRequest) request,
              (io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.HelloReply>) responseObserver);
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
          getSayHelloMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              net.devh.boot.grpc.examples.lib.HelloRequest,
              net.devh.boot.grpc.examples.lib.HelloReply>(
                service, METHODID_SAY_HELLO)))
        .build();
  }

  private static abstract class MyServiceUniBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MyServiceUniBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.devh.boot.grpc.examples.lib.HelloWorldProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MyServiceUni");
    }
  }

  private static final class MyServiceUniFileDescriptorSupplier
      extends MyServiceUniBaseDescriptorSupplier {
    MyServiceUniFileDescriptorSupplier() {}
  }

  private static final class MyServiceUniMethodDescriptorSupplier
      extends MyServiceUniBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MyServiceUniMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MyServiceUniGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MyServiceUniFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
