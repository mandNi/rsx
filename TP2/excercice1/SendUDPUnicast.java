package excercice1 ;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendUDPUnicast {

    public static void main(String[] args) throws IOException {
        if (args.length < 3) System.out.println("Missing one or more parameters");
        else {
            InetAddress ip ;
            int port ;
            byte[] msg ;
            DatagramSocket socket ;
            DatagramPacket packet ;

            ip = InetAddress.getByName(args[0]);
            port = Integer.parseInt(args[1]);
            socket = new DatagramSocket();
            msg = args[2].getBytes();
            packet = new DatagramPacket(msg, msg.length,ip,port);
            socket.send(packet);
            socket.close();
        }
    }
}
