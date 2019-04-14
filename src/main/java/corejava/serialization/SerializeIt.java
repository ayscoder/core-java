package corejava.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeIt {

	public SerializeIt() {
	}

	public static void main(String args[]) throws Exception {
        File file = new File("d:\\temp.ser");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        TestSUID writeSUID = new TestSUID(1);
        oos.writeObject(writeSUID);
        oos.close();

    }
}
