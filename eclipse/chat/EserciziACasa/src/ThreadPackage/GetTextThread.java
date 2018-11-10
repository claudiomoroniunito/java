package ThreadPackage;

import java.util.Scanner;

public class GetTextThread extends Thread {

	static Scanner scanner = new Scanner(System.in);

	public GetTextThread() {
		start();
	}

	public void GetText() {
		System.out.println(scanner.next());
		GetText();
	}

	@Override
	public void run() {
		GetText();
	}




}
