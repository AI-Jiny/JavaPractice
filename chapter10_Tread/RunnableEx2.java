package Thread;

class Timer1 implements Runnable {

	int n = 0;

	@Override
	public void run() {

		while (true) {
			n++;
			
			if (n % 2 == 0) {
				System.out.println(n);

				try {
					Thread.sleep(1000);

				} catch (Exception e) {
					return;
				}
			}

		}

	}

}

public class RunnableEx2 {

	public static void main(String[] args) {

		Timer1 t = new Timer1();
		Thread th = new Thread(t);
		th.start();
		
	}

}
