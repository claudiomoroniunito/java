package Input0utput1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReader1 {
	public static void main(String[] args) throws IOException {
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("scrivi, q per chiudere");
		do {
			c = (char) br.read();
			System.out.println(c);
		}while(c != 'q');
	}

}
