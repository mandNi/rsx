package excercice3;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Receiver extends Thread {

    @Override
    public void run () {
        try {
        MulticastSocket msocket ;
        InetAddress ip ;
        int port ;
        byte[] buffer ;
        String msg = "";
        DatagramPacket dPacket ;

        ip = InetAddress.getByName("224.0.0.1");
        port = 7654 ;
        msocket = new MulticastSocket(port);
        msocket.joinGroup(ip);
        buffer = new byte[1024];
        dPacket = new DatagramPacket(buffer, buffer.length);

        while(!msg.equals("exit")) {
            msocket.receive(dPacket);
            msg = new String(buffer,0,dPacket.getLength());
            System.out.println(dPacket.getAddress()+" : "+msg);
            dPacket.setLength(buffer.length);
        }
	System.out.println("l'utilisateur "+dPacket.getAddress()+" a quitté le chat");
        msocket.close();
        } catch (Exception e){}
    }
    
}
