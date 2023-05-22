package excercice1;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveUDPUnicast {
    
    public static void main(String[] args) throws IOException {
        if (args.length < 1) throw new IOException();
        else {
            int port ;
            DatagramSocket socket ;
            DatagramPacket packet ;
            byte[] buffer ;
            String msg ;

            port = Integer.parseInt(args[0]);
            buffer = new byte[1024];
            socket = new DatagramSocket(port);
            packet = new DatagramPacket(buffer, buffer.length);

            while(true) {
                socket.receive(packet);
                msg = new String(buffer,0,packet.getLength());
                System.out.println(packet.getAddress()+" : "+msg);
                packet.setLength(buffer.length);
            }
        }
    }
}
