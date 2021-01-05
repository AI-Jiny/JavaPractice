package Thread;

class Th4 implements Runnable{

	@Override
	public void run() {
		
		for(int i = 0; i<=100; i++) {
			System.out.println(Thread.currentThread().getName()+"\t");

			if(i%10==0) System.out.println();
			
		}
		
	}
	
}

public class RunnableEx1{
	
	public static void main(String[] args) {
	
		Th4 t1 = new Th4();
		Th4 t2 = new Th4();
	
		//스레드 객체에 대입
		Thread th1 = new Thread(t1, "첫번째");
		Thread th2 = new Thread(t2, "두번째");
		
		th1.start();
		th2.start();
			
	}
	
}
