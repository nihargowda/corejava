package eg12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import eg.Creditcard;
public class Serialize {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("cc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos); ){
			Creditcard cc = new Creditcard(12345l,"nihar",123);
			oos.writeObject(cc);
			System.out.println(cc);
		}
		catch(IOException e) {}
	}}