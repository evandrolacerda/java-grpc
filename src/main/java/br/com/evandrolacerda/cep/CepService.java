package br.com.evandrolacerda.cep;

import br.com.evandrolacerda.grpc.grpc.Cep;
import br.com.evandrolacerda.grpc.grpc.cepGrpc;
import br.com.evandrolacerda.grpc.grpc.cepGrpc.cepImplBase;

import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

public class CepService extends cepImplBase{

    public void getCep(br.com.evandrolacerda.grpc.grpc.Cep.CepRequest request,
                       io.grpc.stub.StreamObserver<br.com.evandrolacerda.grpc.grpc.Cep.CepResponse> responseObserver) {

        String cep = request.getCep();

        Cep.CepResponse.Builder response = Cep.CepResponse.newBuilder();

        if( cep.equals("83010-070")){
            response.setCep("83010-070");
            response.setLogradouro("Rua Adrianópolis");
            response.setBairro("Cruzeiro");
            response.setLocalidade("São José dos Pinhais");
            response.setUf("PR");
            response.setIbge("4125506");
            response.setGia("6578");

            responseObserver.onNext(response.build());
            responseObserver.onCompleted();


        }
        //not found
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }
}
