package Thread;

class Test2 extends Thread { // 스레드 클래스 상속

	int n = 0;

	@Override
	public void run() { // public void run() 메소드 재정의

		// 스레드 코드 작성
		while (true) {

			System.out.print(n+" ");
			n++;

			try {
				// sleep동안에는 언제든 예외가 발생할 수 있다. 따라서 예외처리가 필수이다.
				sleep(100);
				
			} catch (InterruptedException e) {
				
				return;
			}

		}

	}

}

public class ThreadEx2 {

	public static void main(String[] args) {

		Test2 t = new Test2();
		
		t.start(); 	//JVM에 스레드처리를 요청한다.

	}

}
