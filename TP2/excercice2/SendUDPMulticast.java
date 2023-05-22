package excercice2;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class SendUDPMulticast {
    
    public static void main(String[] args)throws Exception {
        if (args.length < 1) throw new Exception("message missing");
        InetAddress ip ;
        int port ;
        MulticastSocket msocket ;
        byte[] buffer ;
        DatagramPacket dpacket ;

        ip = InetAddress.getByName("224.0.0.1");
        port = 7654 ;
        msocket = new MulticastSocket(port);
        msocket.joinGroup(ip);
        buffer = args[0].getBytes();
        dpacket = new DatagramPacket(buffer, buffer.length,ip,port);
        msocket.send(dpacket);
        msocket.close();
    
    }

}
