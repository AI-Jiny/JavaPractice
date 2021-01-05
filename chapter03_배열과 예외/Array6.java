package c1_array;

public class Array6 {

	public static void main(String[] args) {

		// 정방형 이차원배열

		int[][] a = new int[2][3]; 		// [][][]
										// [][][]

			a[0][0] = 7;	a[0][1] = 23;	a[0][2] = 11;	 // [7][23][11]
			a[1][0] = 27;	a[1][1] = 2;	a[1][2] = 13;	 // [27][2][13]

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------");
		//아래와 같은 정방형 배열을 생성하고 출력하시오.
		//[1][2][3][4]
		//[5][6][7][8]

		int[][] b = {{1,2,3,4},{5,6,7,8}};
		
		
		for(int i=0;i<b.length;i++) {
			for(int j=0; j<b[i].length;j++) {
				System.out.print("["+b[i][j]+"] ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
