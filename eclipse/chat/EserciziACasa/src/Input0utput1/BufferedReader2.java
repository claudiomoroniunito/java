package Input0utput1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String s;
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		 do {
			 s= br.readLine();
			 System.out.println(s);
			 
		 }while(! s.equals("stop"));
	}

}
