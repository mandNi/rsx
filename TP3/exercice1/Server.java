package exercice1;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class Server {

    public Server(int port) throws IOException {

        this.serverSocket = new ServerSocket(port);
    }
    public static void main(String[] args) throws IOException {

        Server server = new Server(2022);
        server.run();
    }

    private final ServerSocket serverSocket;

    public void run() throws IOException {
        System.out.println(this.serverSocket.getLocalSocketAddress());

        final String message = "Bienvenue dans mon serveur et au revoir !\n";
        
        try(this.serverSocket){

            while(true) {

                final Socket socket = serverSocket.accept();
                final OutputStream out = socket.getOutputStream();

                final String ip = socket.getLocalSocketAddress().toString();
                final LocalDateTime now = LocalDateTime.now();
                System.out.println("Socket from " + ip +" accepted at :" + now);

                System.out.println(message);

                out.close();
                socket.close();
            }
        }
    }
}


