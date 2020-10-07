package filehandling;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileinputByte {

	public static void main(String[] args) {
		try (
			FileInputStream fis= new FileInputStream("byte.txt");
			BufferedInputStream bis= new BufferedInputStream(fis);)
			{System.out.println("bytes available before read "+ bis.available());
				StringBuilder sb = new StringBuilder();
				while(bis.available()!=0) {
					sb.append((char)bis.read());
		}
				System.out.println("bytes available after read");
				System.out.println(bis.available());
				System.out.println(sb.toString());
				}
	catch(FileNotFoundException e) {}
		catch(IOException r) {}
	}

	
	

	}


