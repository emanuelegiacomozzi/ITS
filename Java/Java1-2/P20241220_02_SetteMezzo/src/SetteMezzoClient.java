import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class SetteMezzoClient {
	private static String hostname = "localhost";
    private static int port = 12347;
    
	public static void main(String[] args) {
		try (Socket socket = new Socket(hostname, port);
			InputStream input = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
			
			String response = reader.readLine();
			System.out.println("Messaggio dal server: "+ response);
		}catch (IOException ex) {
			System.out.println("Errore nel client: "+ ex.getMessage());
		}
		

	}

}
