package server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Server implements Runnable {
	public Thread ServerThread;
	int ServerPort = 100;
	private InetAddress ServerInetAddress;
	private DatagramSocket ServerDatagramSocket;
	private DatagramPacket ServerDatagramPacket;
public String LocalIP = "192.168.0.30";
public String ExternalIP = "2.39.29.61";


	public Server() throws UnknownHostException {
		ServerThread = new Thread(this, "ServerThread");
		//this.ServerInetAddress = InetAddress.getByName(LocalIP);
		this.ServerInetAddress = InetAddress.getLocalHost();
		
			//this.ServerDatagramSocket = new DatagramSocket(ServerPort,ServerInetAddress);
			try {
			ServerDatagramSocket = new DatagramSocket(ServerPort, ServerInetAddress);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println("ServerDatagramSocket started, listening on port " + ServerPort);
		
		System.out.println(ServerDatagramSocket.getPort());
		ServerThread.start();
	}

	private void ListenForJoin() {
		
			byte[] JoinData = new byte[1024];
			this.ServerDatagramPacket = new DatagramPacket(JoinData, JoinData.length);
			try {
				System.out.println("Waiting for ClientDatagramPacket");
				ServerDatagramSocket.receive(ServerDatagramPacket);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("ClientDatagramPacket received");
		ServerDatagramSocket.close();
	}


	@Override
	public void run() {
		ListenForJoin();

	}

	public static void main(String[] args) {
try {
	Server server = new Server();
} catch (UnknownHostException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
