package filehandling;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDemo {

	public static void main(String[] args) {
		FileOutputStream fos= null;
		BufferedOutputStream bos = null;
		try {
			fos= new FileOutputStream("byte.txt");
			bos=new BufferedOutputStream(fos);
			String message = "i am nihar";
			byte b[]= message.getBytes();
			bos.write(b);
			System.out.println("mesage written");
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		catch(IOException r) {
			System.out.println(r);
			
		}
finally {
	try {
		bos.flush();
		bos.close();
		fos.close();
	}
	catch(IOException p) {
		System.out.println(p);
	}
}
	}

}
