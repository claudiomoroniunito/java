package ThreadPackage;

public class RunnableThread implements Runnable {

	public Thread RT;

	public RunnableThread() {
		RT = new Thread(this, "RunnableThread");
		System.out.println("RunnableThread created, it is called  " + RT.getName());
		RT.start();
	}



	@Override
	public void run() {

		for (int i = 5; i > 0; i--) {
			System.out.println("RunnableThread" + i);

			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("Fine del thread RunnableThread");

	}

}
