/*
		배열
			-자료형이 동일한 여러개의 값을 연이어 저장할 수 있도록 하는 저장공간의 집합체
			
			1. 선언방식
					데이터타입[] 배열명 = new 데이터타입[방의 갯수];
			
			2. 초기화 : 배열은 초기화 하지 않아도 자바에서 자동으로 초기화 해준다.

*/

package c1_array;

public class Array1 {

	public static void main(String[] args) {
					 			  // a[0] a[1] a[2] a[3] a[4]
		int[] a = new int[5]; // a = [정수][정수][정수][정수][정수] 주소값, 인덱스를 가짐
		// 길이를 구해주는 메소드 a.length();=5

		a[0] = 7;
		a[1] = 8;
		a[2] = 34;
		a[3] = 6;
		a[4] = 234;
		// a[5]=200; 컴파일 에러

		int b[] = new int[] { 1, 2, 3, 4, 5 };
		//int [] b;
		//b= new int[]{1,2,3,4,5};
		int c[] = { 1, 2, 3, 4, 5 };
		
		System.out.println(b[3]);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("a["+i+"]="+a[i]+"  ");
			
		}
		

	}

}
