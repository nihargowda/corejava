package eg3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import eg.Creditcard;

public class Deserialize {

	public static void main(String[] args) {
		try(FileInputStream fis= new FileInputStream("cc.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);){
			Creditcard cc = (Creditcard)ois.readObject();
			System.out.println(cc);
		
		}
catch(FileNotFoundException | ClassNotFoundException r) {}
catch(IOException e) {}		
	}

}
