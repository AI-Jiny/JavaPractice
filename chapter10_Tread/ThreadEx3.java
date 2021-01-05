package Thread;

class Test3 extends Thread{
	
	public Test3(String str) {
	
		super(str);
		
	}
	
	//스레드 코드 구현
	public void run() {
		for(int i=0; i<=100; i++) {
	
			System.out.print(getName()+"\t"); //getName() : 이름을 반환

			if(i%10==0) {
				System.out.println();
			}
			
		}
		
	}
	
}

public class ThreadEx3 {
	
	
	
	public static void main(String[] args) {

		Test3 t1 = new Test3("A");
		Test3 t2 = new Test3("B");
		
		t1.start();
		t2.start();
		
		
		
	}

}
