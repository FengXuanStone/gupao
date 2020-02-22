package serilizableDemo;

import lombok.Data;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: 65135
 * Date: 2020/2/22
 * Time: 12:43
 * Description: No Description
 */
@Data
public class User implements Serializable {
    private String name;
    private transient Integer age;

    private void writeObject(ObjectOutputStream s) throws IOException {
        s.defaultWriteObject();
        s.writeObject(age);
    }

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        s.defaultReadObject();
        s.readObject();
    }
}
