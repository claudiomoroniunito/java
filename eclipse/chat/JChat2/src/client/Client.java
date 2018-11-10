package client;

import java.io.IOException;
import java.net.*;

public class Client implements Runnable {
	public Thread ClientThread;
	private int ClientPort = 107;
	private InetAddress ClientInetAddress;
	private DatagramSocket ClientDatagramSocket;
	private DatagramPacket ClientDatagramPacket;
	private String ServerIP = "2.39.29.61";
	public  InetAddress ServerInetAddress;

	public Client () {
		this.ClientThread = new Thread(this, "ClientThread");
		try {
			this.ClientInetAddress = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			this.ClientDatagramSocket = new DatagramSocket(ClientPort, ClientInetAddress);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ClientThread.start();
	}

	private void Send() {
		String msg = "Eccomi!";
		byte[] msgByte = msg.getBytes();
		try {
			ClientDatagramPacket = new DatagramPacket(msgByte, msgByte.length, InetAddress.getByName("192.168.0.30"), 100 );
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ClientDatagramSocket.send(ClientDatagramPacket);
			System.out.println("msg sent");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ClientDatagramSocket.close();



	}

	public void run() {
		Send();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client();
	}

}
