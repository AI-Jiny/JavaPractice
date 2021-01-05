/*
	스레드 생명주기
	
		1. 	스레드 생성		:	new
				|start()
		2. 	Runnable	:	실행준비
	yield()|		|run()			
		3. 	Runnable	:	실행
		4. 	Waiting		:	대기
			Timed_waiting	:	시간대기
			Block		:	봉쇄
		5.	Terminated	:	스레드가 종료한 상태

	스레드 우선순위
		* Max_Priority = 10 최댓값
		* Max_Priority = 5 중간값
		* Max_Priority = 1 최소값


*/
package Thread;

public class ThreadLife {
	
	public static void main(String[] args) {
		
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
//		Thread.State s = ThreadLife;
		
		System.out.println(name);
		System.out.println(id);
		System.out.println(priority);
		
		
		
	}

}
