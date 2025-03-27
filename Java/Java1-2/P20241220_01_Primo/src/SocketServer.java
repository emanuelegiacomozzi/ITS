import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    public void Server(int port) {
        // int port = 12345; // Port number

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            // Create the server socket and start listening
            System.out.println("Server is listening on port " + port);

            // Wait for a client to connect
            Socket socket = serverSocket.accept();
            System.out.println("New client connected");

            // Handle the client in a separate try-with-resources block
            try (
                // Extract input stream to receive data from the client
                InputStream input = socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));

                // Extract output stream to send data to the client
                OutputStream output = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(output, true)
            ) {
                // Read and write until the client sends the "bye" message
                String text;
                while ((text = reader.readLine()) != null) {
                    System.out.println("Received: " + text);

                    // Echo the received message back to the client
                    writer.println("Server: " + text);

                    // Exit condition if "bye" is received
                    if ("bye".equalsIgnoreCase(text)) {
                        System.out.println("Client disconnected");
                        break;
                    }
                }
            } catch (IOException ex) {
                System.out.println("Server exception: " + ex.getMessage());
                ex.printStackTrace();
            }

        } catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
