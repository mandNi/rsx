package exercice1;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Client {
    private final Socket socket;

    public Client(String host, int port) throws IOException {
        this.socket = new Socket(host, port);
    }

    public static void main(String[] args) throws IOException {
        String message;

        Client client = new Client("0.0.0.0", 2022);
        
        try(InputStream in = client.socket.getInputStream()){
            message = new String(in.readAllBytes());
        }
        System.out.println(message);
        client.socket.close();
    }
}
