package test.grpc.server.service;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.examples.lib.HelloReply;
import net.devh.boot.grpc.examples.lib.HelloRequest;
import net.devh.boot.grpc.examples.lib.MyServiceStreamGrpc;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class MyServiceStreamImpl extends MyServiceStreamGrpc.MyServiceStreamImplBase {

  @Override
  public StreamObserver<HelloRequest> sayHello(StreamObserver<HelloReply> responseObserver) {
    return new StreamObserver<HelloRequest>() {
      @Override
      public void onNext(HelloRequest value) {
        HelloReply reply = HelloReply.newBuilder()
                .setMessage("Hello ==> " + value.getName())
                .build();
        responseObserver.onNext(reply);
      }

      @Override
      public void onError(Throwable t) {

      }

      @Override
      public void onCompleted() {
        responseObserver.onCompleted();
      }
    };
  }
}
