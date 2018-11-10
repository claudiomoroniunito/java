package Input0utput1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream FIS = null;
		int i=0;
		
		try {
			FIS = new FileInputStream("TCF/JavaProg/EserciziACasa/InputOutput1/prova1");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("non si apre");
			e.printStackTrace();
		}
		try {
		do {
			
				i= FIS.read();
			
			System.out.println((char) i);}
			
		while(i != -1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		try {
			FIS.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
