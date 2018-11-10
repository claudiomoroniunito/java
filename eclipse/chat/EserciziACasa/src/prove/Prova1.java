package prove;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Prova1 {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		/*InetAddress in = InetAddress.getLocalHost();
				System.out.println(in);
				int ciao[] = new int[3];
				for (int i  = 0; i < ciao.length;i ++) {
					System.out.println(ciao[i]);
				}
				*/byte Address[] = InetAddress.getLocalHost().toString().getBytes();
			int length = Address.length;
			System.out.println(InetAddress.getLocalHost());
	}

}
