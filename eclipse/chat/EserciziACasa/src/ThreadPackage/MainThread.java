package ThreadPackage;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*System.out.println("-------MainThread-------");
		Thread t = Thread.currentThread();
		System.out.println("Adesso il thread si chiama" + t);
		t.setName("pippo");

		System.out.println("adesso il thread s chiama" + t);

		try {
			t.sleep(2000);
			System.out.println("ho atteso due secondi prima di stampare questo");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("thread interotto");
		}

		System.out.println("--------RunnableThread---------");

		new RunnableThread();

		for (int i = 5; i > 0; i--) {
			System.out.println("Main Thread" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		System.out.println("Fine del for del Main Thread");

		System.out.println("-------ExtendinThread, Get Input--------");

		new GetTextThread();
		new Intermezzo();
		 */
		System.out.println("------join-------");

		Classe classe = new Classe("Classe");
		classe.StampaNome();
		
		RunnableThread RT1 = new RunnableThread();
		Intermezzo IT1 = new Intermezzo();
	try {
		RT1.RT.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Ho joinato");

	}

}
