package excercice2;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ChatServer {
  // Liste des clients connectés
  private List<Socket> clients = new ArrayList<>();

  public static void main(String[] args) throws Exception {
    new ChatServer().run();
  }

  public void run() throws Exception {
    // Création du socket du serveur
    ServerSocket server = new ServerSocket(2022);

    while (true) {
      // Acceptation d'une nouvelle connexion d'un client
      Socket client = server.accept();

      // Ajout du client à la liste des clients connectés
      clients.add(client);

      // Création d'un thread pour gérer la communication avec le client
      ClientHandler handler = new ClientHandler(client);
      handler.start();
    }
  }

  // Thread gérant la communication avec un client
  private class ClientHandler extends Thread {
    
    private Socket client;
    private String ipAddress;

    public ClientHandler(Socket client) {
      this.client = client;
      this.ipAddress = client.getInetAddress().getHostAddress();
    }

    public void run() {
      try {
        // Flux d'écriture vers le client
        PrintWriter writer = new PrintWriter(client.getOutputStream());

        // Flux de lecture depuis le client
        BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));

        // Envoi d'un message de notification à tous les clients connectés
        // pour informer qu'un nouveau client s'est connecté
        for (Socket otherClient : clients) {
          PrintWriter otherWriter = new PrintWriter(otherClient.getOutputStream());
          otherWriter.println("Un nouveau client "+ipAddress+" s'est connecté.");
          otherWriter.flush();
        }

        // Boucle de réception et diffusion des messages du client
        while (true) {
          // Réception d'un message du client
          String message = reader.readLine();

          // Diffusion du message à tous les clients connectés
          for (Socket otherClient : clients) {
            PrintWriter otherWriter = new PrintWriter(otherClient.getOutputStream());
            otherWriter.println(ipAddress+" : "+message);
            otherWriter.flush();
          }
        }
      } catch (Exception e) {
        // Si une exception est levée, on supprime le client de la liste des
        // clients connectés et on arrête le thread
        clients.remove(client);
        return;
      }
    }
  }
}
