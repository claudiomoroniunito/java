package ThreadPackage;

public class Intermezzo implements Runnable {
	Thread IT;
	
	public Intermezzo() {
		IT = new Thread(this, "Intermezzo");
		IT.start();

	}

	public void CiSono() {
		for (int i = 5; i >0; i--) {


			System.out.println("Ci sono anch'io");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


	public void run(){
		CiSono();


	}
}
