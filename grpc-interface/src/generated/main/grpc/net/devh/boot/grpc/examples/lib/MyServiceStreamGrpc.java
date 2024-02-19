package net.devh.boot.grpc.examples.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: grpc.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MyServiceStreamGrpc {

  private MyServiceStreamGrpc() {}

  public static final java.lang.String SERVICE_NAME = "net.devh.boot.grpc.example.MyServiceStream";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.devh.boot.grpc.examples.lib.HelloRequest,
      net.devh.boot.grpc.examples.lib.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = net.devh.boot.grpc.examples.lib.HelloRequest.class,
      responseType = net.devh.boot.grpc.examples.lib.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<net.devh.boot.grpc.examples.lib.HelloRequest,
      net.devh.boot.grpc.examples.lib.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<net.devh.boot.grpc.examples.lib.HelloRequest, net.devh.boot.grpc.examples.lib.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = MyServiceStreamGrpc.getSayHelloMethod) == null) {
      synchronized (MyServiceStreamGrpc.class) {
        if ((getSayHelloMethod = MyServiceStreamGrpc.getSayHelloMethod) == null) {
          MyServiceStreamGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<net.devh.boot.grpc.examples.lib.HelloRequest, net.devh.boot.grpc.examples.lib.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.devh.boot.grpc.examples.lib.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.devh.boot.grpc.examples.lib.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new MyServiceStreamMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MyServiceStreamStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyServiceStreamStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyServiceStreamStub>() {
        @java.lang.Override
        public MyServiceStreamStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyServiceStreamStub(channel, callOptions);
        }
      };
    return MyServiceStreamStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MyServiceStreamBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyServiceStreamBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyServiceStreamBlockingStub>() {
        @java.lang.Override
        public MyServiceStreamBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyServiceStreamBlockingStub(channel, callOptions);
        }
      };
    return MyServiceStreamBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MyServiceStreamFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyServiceStreamFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MyServiceStreamFutureStub>() {
        @java.lang.Override
        public MyServiceStreamFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MyServiceStreamFutureStub(channel, callOptions);
        }
      };
    return MyServiceStreamFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    default io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.HelloRequest> sayHello(
        io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.HelloReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSayHelloMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MyServiceStream.
   */
  public static abstract class MyServiceStreamImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MyServiceStreamGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MyServiceStream.
   */
  public static final class MyServiceStreamStub
      extends io.grpc.stub.AbstractAsyncStub<MyServiceStreamStub> {
    private MyServiceStreamStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyServiceStreamStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyServiceStreamStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.HelloRequest> sayHello(
        io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.HelloReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MyServiceStream.
   */
  public static final class MyServiceStreamBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MyServiceStreamBlockingStub> {
    private MyServiceStreamBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyServiceStreamBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyServiceStreamBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MyServiceStream.
   */
  public static final class MyServiceStreamFutureStub
      extends io.grpc.stub.AbstractFutureStub<MyServiceStreamFutureStub> {
    private MyServiceStreamFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyServiceStreamFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyServiceStreamFutureStub(channel, callOptions);
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
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sayHello(
              (io.grpc.stub.StreamObserver<net.devh.boot.grpc.examples.lib.HelloReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSayHelloMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              net.devh.boot.grpc.examples.lib.HelloRequest,
              net.devh.boot.grpc.examples.lib.HelloReply>(
                service, METHODID_SAY_HELLO)))
        .build();
  }

  private static abstract class MyServiceStreamBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MyServiceStreamBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.devh.boot.grpc.examples.lib.HelloWorldProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MyServiceStream");
    }
  }

  private static final class MyServiceStreamFileDescriptorSupplier
      extends MyServiceStreamBaseDescriptorSupplier {
    MyServiceStreamFileDescriptorSupplier() {}
  }

  private static final class MyServiceStreamMethodDescriptorSupplier
      extends MyServiceStreamBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MyServiceStreamMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MyServiceStreamGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MyServiceStreamFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
