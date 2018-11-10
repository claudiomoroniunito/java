package Input0utput1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EditorTesto1 {
public static void main(String[] args) throws IOException {
	  
	String s[] = new String[100];
	int i =0;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	do {
		s[i] = br.readLine();
		i++;
	}while(!s[i-1].equals("stop"));
	
	for (int j = 0; j < i; j++) {
		System.out.println(s[j]);
		
	}
}
}
