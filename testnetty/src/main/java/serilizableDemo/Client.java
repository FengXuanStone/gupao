package serilizableDemo;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 * User: 65135
 * Date: 2020/2/22
 * Time: 12:45
 * Description: No Description
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);

            User user = new User();
            user.setAge(18);
            user.setName("haha");

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            objectOutputStream.writeObject(user);

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
