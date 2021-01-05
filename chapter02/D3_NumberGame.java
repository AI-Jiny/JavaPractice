/*
	임의의 숫자 난수를 발생시키고
	그 값을 몇번만에 맞췄는지 보는 게임을 구현해보자.

*/
package c4_while;

import java.util.Scanner;

public class D3_NumberGame {
	
	public static void main(String[] args) {
		
		System.out.println("컴퓨터가 1~100까지 중 임의의 숫자를 생각하고 있습니다.");
		
		//컴퓨터가  생각하고 있는 값(랜덤)
		int answer = (int)(Math.random()*100+1);			//0<random<1
		
		Scanner sc = new Scanner(System.in);
		int num;	//몇번째에 맞추는지
		int count=0;
		
		System.out.println("어떤 수 일까요?");
		
		do {

			num=sc.nextInt();
			if(answer==num) {
				System.out.println(count+"번에 맞추셨습니다. 축하드립니다~");
				break;
			}else if(answer>=num){
				System.out.println("더 큰 수를 입력해보세요.");
			}else {
				System.out.println("더 작은 수를 입력해보세요.");
			}
			count++;
			
		}while(true);
		
		sc.close();
		
		
	}

}
