package corejava.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerializeIt {

	public DeSerializeIt() {
	}

	public static void main(String args[]) throws Exception {
        File file = new File("d:\\temp.ser");
       
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        TestSUID readSUID = (TestSUID) ois.readObject();
        System.out.println("someId : " + readSUID.getSomeId());
        ois.close();
    }
}
