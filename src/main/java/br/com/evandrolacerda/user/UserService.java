package br.com.evandrolacerda.user;

import br.com.evandrolacerda.grpc.grpc.*;

import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

public class UserService extends userGrpc.userImplBase {

    @Override
    public void login(br.com.evandrolacerda.grpc.grpc.User.LoginRequest request,
                      io.grpc.stub.StreamObserver<br.com.evandrolacerda.grpc.grpc.User.ApiResponse> responseObserver) {

        String username = request.getUsername();
        String password = request.getPassword();

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        if( username.equals("evandro") && password.equals("123") ){
            User.ApiResponse.Builder response = User.ApiResponse.newBuilder()
                    .setResponseCode(0)
                    .setResponseMessage("Login realizado com sucesso!");

            responseObserver.onNext(response.build());
            responseObserver.onCompleted();

        }else{
            User.ApiResponse.Builder response = User.ApiResponse.newBuilder()
                    .setResponseCode(100)
                    .setResponseMessage("Usuário ou senha inválidos!");

            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        }


    }

    /**
     */
    @Override
    public void logout(br.com.evandrolacerda.grpc.grpc.User.Empty request,
                       io.grpc.stub.StreamObserver<br.com.evandrolacerda.grpc.grpc.User.ApiResponse> responseObserver) {

    }

}
