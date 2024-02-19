package test.grpc.client.service;

import jakarta.annotation.PostConstruct;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.examples.lib.HelloRequest;
import net.devh.boot.grpc.examples.lib.MyServiceGrpc.MyServiceBlockingStub;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClientServiceImpl implements CommandLineRunner {

  @GrpcClient("myService")
  MyServiceBlockingStub myServiceStub;

  public void receiveGreeting(String name) {
    HelloRequest request = HelloRequest.newBuilder()
            .setName(name)
            .build();
    System.out.println(myServiceStub.sayHello(request).getMessage());
  }

//  @PostConstruct
//  public void method() {
//    receiveGreeting("Jeblan");
//  }

  @Override
  public void run(String... args) throws Exception {
    receiveGreeting("Jeblan");
  }
}
