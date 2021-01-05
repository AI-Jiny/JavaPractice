/*
	외부에서 입력받은 숫자들의 평균을 구하시오.
	단, 0을 입력하면 입력상태를 빠져나오고 평균결과를 출력하시오.

*/
package c4_while;

import java.util.Scanner;

public class While_Avg {

	public static void main(String[] args) {

		System.out.println("평균을 구하고 싶은 숫자들을 입력해주세요>>\n(중단하고 싶을 경우 0을 입력하세요)");

		Scanner sc = new Scanner(System.in);

		int n = 0, i = 0;
		double sum = 0;
		
		while((i=sc.nextInt())!=0) {
			sum=sum+i;
			n++;
		}
		System.out.println("입력된 수의 개수는 "+n+"개이며, 평균은 "+sum/(float)n+"입니다.");
	
		sc.close();
		
	}

}
