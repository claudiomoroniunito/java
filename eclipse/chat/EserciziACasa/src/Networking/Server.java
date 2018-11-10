package Networking;

import java.io.IOException;
import java.net.*;


public class Server implements Runnable {
	final private int ServerPort = 997;
	final private InetAddress ServerIP; //la classe inetaddress ha un data member l'indirizzo ip
	int ClientPort;
	private DatagramSocket ServerDatagramSocket;
	private DatagramPacket ServerDatagramPacket;
	private byte ClientAddress[] = new byte[26];
	Thread ServerThread;

	public Server() throws SocketException, UnknownHostException {
		ServerThread = new Thread(this, "ServerThread");
		this.ServerIP = InetAddress.getLocalHost();
		this.ServerDatagramSocket = new DatagramSocket(ServerPort, ServerIP); 
		ServerThread.start();
	}

	public void ListenForJoin() throws IOException {
		//while(true) {
			ServerDatagramPacket = new DatagramPacket(ClientAddress, 26);
			ServerDatagramSocket.receive(ServerDatagramPacket);
			ClientPort = ServerDatagramPacket.getData()[0];
			System.out.println("Client Connesso al Server, la sua porta è: " + ClientPort);
		//}
			ServerDatagramSocket.close();
	}
public void run() {
	try {
		ListenForJoin();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


}
