import java.io.*;
import java.nio.channels.ServerSocketChannel;

public class Main {
    public static void main(String[] args) {
        System.out.println("test ");

        try {
            StringBuffer str = new StringBuffer();
            char[] buf = new char[1024];
            FileReader f = new FileReader("file");
            while(f.read(buf)>0){
                str.append(buf);
            }
            str.toString();
        } catch (IOException e) {}
    }
}
