package excercice3;

public class ChatApp {

    public static void main(String[] args) {
        
        Sender send = new Sender() ;
        Receiver receiver = new Receiver() ;

        send.start();
        receiver.start();
    }
    
}
