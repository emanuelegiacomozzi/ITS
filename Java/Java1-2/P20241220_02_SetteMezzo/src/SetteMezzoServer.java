import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SetteMezzoServer {
	private static int port = 12347;
	
	public static void main(String[] args) {
		System.out.println("Server in ascolto sulla porta: " + port);
		try (ServerSocket serverSocket = new ServerSocket(port)){
			Socket socket = serverSocket.accept();
			System.out.println("Nuovo giocatore connesso");
			
			try(
				OutputStream output = socket.getOutputStream();
				PrintWriter writer = new PrintWriter(output, true)
			){
				writer.println("Benvenuto al gioco di Sette e Mezzo!");
			}
			catch (IOException ex) {
				System.out.println("Server exception: " + ex.getMessage());
			}
			
		}
	catch (IOException ex) {
		System.out.println("Server exception: " + ex.getMessage());
	}
	}
}
