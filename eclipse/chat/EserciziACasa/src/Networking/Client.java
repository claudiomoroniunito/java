package Networking;

import java.io.IOException;
import java.net.*;

public class Client implements Runnable {
	final int ClientPort = 101;
	DatagramSocket ClientDatagramSocket;
	final InetAddress ClientIP;
	DatagramPacket ClientDatagramPacketOut;
	DatagramPacket ClientDatagramPacketIn;
	final private String ServerIP = "192.168.56.1" ;
	final int ServerIPByteLength = ServerIP.getBytes().length;
	private byte ServerIPByte[] = ServerIP.getBytes().clone();
	public Thread ClientThread;

	public Client() throws SocketException, UnknownHostException   {
		ClientThread = new Thread(this, "ClientThread");
		this.ClientIP = InetAddress.getLocalHost();
		this.ClientDatagramSocket = new DatagramSocket(ClientPort, ClientIP);
		ClientThread.start();
		
	}

	public void connect() throws IOException {
		int length = ClientIP.toString().getBytes().length + 1;
		byte Address[] = new byte[length];
		Address[0] = ClientPort;

		for (int i = 1; i < Address.length; i++) {
			Address[i] = ClientIP.toString().getBytes()[i-1];
		}

		/*for (int i = 0; i < Address.length; i++) {
			System.out.println(i +" : " + Address[i] + "\n");

		}
		*/this.ClientDatagramPacketOut = new DatagramPacket(Address, length, InetAddress.getByName(ServerIP), 997);
		ClientDatagramSocket.send(ClientDatagramPacketOut);
		ClientDatagramSocket.close();
	}

	public void write() {

	} 

public void run() {
	try {
		connect();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
