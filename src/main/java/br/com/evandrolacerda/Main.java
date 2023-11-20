package br.com.evandrolacerda;

import br.com.evandrolacerda.user.UserService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class Main {
    public static void main(String[] args) {
        try{
            Server server = ServerBuilder.forPort(9090)
                    .addService(new UserService())
                    .build();

            server.start();

            System.out.println("Servidor iniciado na porta: " + server.getPort() );

            server.awaitTermination();
        }catch (Exception e )
        {
            System.out.println("Erro ao iniciar o servidor: " + e.getMessage() );
        }
    }
}