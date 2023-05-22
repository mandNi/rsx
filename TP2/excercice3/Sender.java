package excercice3;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class Sender extends Thread {

    @Override
    public void run() {
        try {
        InetAddress ip ;
        int port ;
        MulticastSocket msocket ;
        byte[] buffer ;
        DatagramPacket dpacket ;
        String msg = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("\nVeuillez taper votre message :\n ");
        
        ip = InetAddress.getByName("224.0.0.1");
        port = 7654 ;
        msocket = new MulticastSocket(port);
        msocket.joinGroup(ip);

        while(!msg.equals("exit")){
        msg = sc.nextLine();
        buffer = msg.getBytes();
        dpacket = new DatagramPacket(buffer, buffer.length,ip,port);
        msocket.send(dpacket);
        }
        msocket.close();
        sc.close();
        } catch(Exception e) {} 
    }
}
