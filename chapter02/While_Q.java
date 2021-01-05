package c4_while;

public class While_Q {

	public static void main(String[] args) {
		int i = 1, j = 1;

		while (i <= 9) {// 단
			while (j <= 9) {// 수
				
				System.out.println(i + "*" + j + "=" + (i * j));
				
				j++;
			}
			System.out.println();
			j=1;		//값 초기화
			i=i+1;		//단 수 올리기
			
		}

	}

}
