package br.com.evandrolacerda.grpc.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: cep.proto")
public final class cepGrpc {

  private cepGrpc() {}

  public static final String SERVICE_NAME = "cep";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.evandrolacerda.grpc.grpc.Cep.CepRequest,
      br.com.evandrolacerda.grpc.grpc.Cep.CepResponse> getGetCepMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCep",
      requestType = br.com.evandrolacerda.grpc.grpc.Cep.CepRequest.class,
      responseType = br.com.evandrolacerda.grpc.grpc.Cep.CepResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.evandrolacerda.grpc.grpc.Cep.CepRequest,
      br.com.evandrolacerda.grpc.grpc.Cep.CepResponse> getGetCepMethod() {
    io.grpc.MethodDescriptor<br.com.evandrolacerda.grpc.grpc.Cep.CepRequest, br.com.evandrolacerda.grpc.grpc.Cep.CepResponse> getGetCepMethod;
    if ((getGetCepMethod = cepGrpc.getGetCepMethod) == null) {
      synchronized (cepGrpc.class) {
        if ((getGetCepMethod = cepGrpc.getGetCepMethod) == null) {
          cepGrpc.getGetCepMethod = getGetCepMethod = 
              io.grpc.MethodDescriptor.<br.com.evandrolacerda.grpc.grpc.Cep.CepRequest, br.com.evandrolacerda.grpc.grpc.Cep.CepResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cep", "GetCep"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.evandrolacerda.grpc.grpc.Cep.CepRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.evandrolacerda.grpc.grpc.Cep.CepResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new cepMethodDescriptorSupplier("GetCep"))
                  .build();
          }
        }
     }
     return getGetCepMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static cepStub newStub(io.grpc.Channel channel) {
    return new cepStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static cepBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new cepBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static cepFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new cepFutureStub(channel);
  }

  /**
   */
  public static abstract class cepImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCep(br.com.evandrolacerda.grpc.grpc.Cep.CepRequest request,
        io.grpc.stub.StreamObserver<br.com.evandrolacerda.grpc.grpc.Cep.CepResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCepMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCepMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.evandrolacerda.grpc.grpc.Cep.CepRequest,
                br.com.evandrolacerda.grpc.grpc.Cep.CepResponse>(
                  this, METHODID_GET_CEP)))
          .build();
    }
  }

  /**
   */
  public static final class cepStub extends io.grpc.stub.AbstractStub<cepStub> {
    private cepStub(io.grpc.Channel channel) {
      super(channel);
    }

    private cepStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected cepStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new cepStub(channel, callOptions);
    }

    /**
     */
    public void getCep(br.com.evandrolacerda.grpc.grpc.Cep.CepRequest request,
        io.grpc.stub.StreamObserver<br.com.evandrolacerda.grpc.grpc.Cep.CepResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCepMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class cepBlockingStub extends io.grpc.stub.AbstractStub<cepBlockingStub> {
    private cepBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private cepBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected cepBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new cepBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.evandrolacerda.grpc.grpc.Cep.CepResponse getCep(br.com.evandrolacerda.grpc.grpc.Cep.CepRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCepMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class cepFutureStub extends io.grpc.stub.AbstractStub<cepFutureStub> {
    private cepFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private cepFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected cepFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new cepFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.evandrolacerda.grpc.grpc.Cep.CepResponse> getCep(
        br.com.evandrolacerda.grpc.grpc.Cep.CepRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCepMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CEP = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final cepImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(cepImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CEP:
          serviceImpl.getCep((br.com.evandrolacerda.grpc.grpc.Cep.CepRequest) request,
              (io.grpc.stub.StreamObserver<br.com.evandrolacerda.grpc.grpc.Cep.CepResponse>) responseObserver);
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

  private static abstract class cepBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    cepBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.evandrolacerda.grpc.grpc.Cep.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("cep");
    }
  }

  private static final class cepFileDescriptorSupplier
      extends cepBaseDescriptorSupplier {
    cepFileDescriptorSupplier() {}
  }

  private static final class cepMethodDescriptorSupplier
      extends cepBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    cepMethodDescriptorSupplier(String methodName) {
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
      synchronized (cepGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new cepFileDescriptorSupplier())
              .addMethod(getGetCepMethod())
              .build();
        }
      }
    }
    return result;
  }
}
