package test.grpc.server.exception.handler;

import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.StatusException;
import net.devh.boot.grpc.server.advice.GrpcAdvice;
import net.devh.boot.grpc.server.advice.GrpcExceptionHandler;
import org.jetbrains.annotations.NotNull;

@GrpcAdvice
public class GrpcExceptionAdvice {

  @GrpcExceptionHandler(RuntimeException.class)
  public StatusException handleInvalidArgument(@NotNull RuntimeException e) {
    Metadata metadata = new Metadata();
    metadata.put(Metadata.Key.of("key", Metadata.ASCII_STRING_MARSHALLER), "value");
    return Status.INVALID_ARGUMENT.withDescription(e.getMessage()).withCause(e).asException(metadata);
  }

  @GrpcExceptionHandler(Exception.class)
  public Status handleInvalidArgument(@NotNull Exception e) {
    return Status.INVALID_ARGUMENT.withDescription(e.getMessage()).withCause(e);
  }
}
