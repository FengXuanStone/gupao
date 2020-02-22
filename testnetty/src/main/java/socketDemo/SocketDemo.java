package socketDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 * User: 65135
 * Date: 2020/2/21
 * Time: 16:57
 * Description: No Description
 */
public class SocketDemo {
    public static void main(String[] args) {
        ServerSocket socket = null;
        try {
            socket = new ServerSocket(8080);

            Socket socket1 = socket.accept();

            BufferedReader bf = new BufferedReader(new InputStreamReader(socket1.getInputStream()));
            System.out.println(bf.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
