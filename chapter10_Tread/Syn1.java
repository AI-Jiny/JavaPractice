/*
	동기화(Synchronized)를 걸어준다는 의미
		* 여러 스레드가 Synchronized로 설정한 부분을 동시에 호출할때
		* 먼저 호출한 것이 끝날때까지 나머지는 대기하게 만드는 것을 말한다.
		
	멀티스레드의 주의점
		* 동시접근 시 충돌이 발생하지 않게 처리해야함
	
	구현방법
		* 메소드 전체를 Synchronized로 처리한다.
		* 필요한 임의의 코드블럭을 임계영역으로 지정처리한다.
	
	동기화 동작
		* 들어갈때 Lock, 나올때 UnLock동작이 자동으로 이루어진다.
*/
package syn;

class Cal {
	int sum = 0;
	int n;

	synchronized void add() {
		n = sum;
		
		//다른스레드에 양보하는 메소드
//		Thread.yield();
		
		n = n + 10;
		sum = n;

		System.out.println(Thread.currentThread().getName() + "sum : " + sum);

	}

}

class Student extends Thread {

	Cal c;

	public Student(String name, Cal c) {
		super(name);
		this.c = c;

	}

	public void run() {

		int i = 0;

		while (i < 10) {

			c.add();
			i++;

			try {

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}

public class Syn1 {

	public static void main(String[] args) {

		Cal c = new Cal();
		
		
		Student s1 = new Student("홍길동", c);
		Student s2 = new Student("이순신", c);
		
		
		s1.start();
		s2.start();
		
		
		
		
		
		
		
	}

}
