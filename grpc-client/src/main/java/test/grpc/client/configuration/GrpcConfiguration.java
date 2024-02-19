package test.grpc.client.configuration;

import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.client.inject.GrpcClientBean;
import net.devh.boot.grpc.examples.lib.MyServiceGrpc.MyServiceBlockingStub;
import org.springframework.context.annotation.Configuration;

@Configuration
@GrpcClientBean(
        clazz = MyServiceBlockingStub.class,
        beanName = "blockingStub",
        client = @GrpcClient("myService")
)
public class GrpcConfiguration {
}
