package socketDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 * User: 65135
 * Date: 2020/2/21
 * Time: 17:00
 * Description: No Description
 */
public class ClientSocketDemo {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);

            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            pw.println("hello 123");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
