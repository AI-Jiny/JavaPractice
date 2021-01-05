/*
	이순신 홍길동 강감찬
	박유정 홍예훈 김효진
	김형주 인정빈 임택균
	
	
	a b c d e 
	f g h i j
	
	1.0 2.2 3.1
	2.1 2.2 3.9 //실수타입
	
	
	Class Color[][]	=	new Color[2][3];
		color1	color2	color3
		color4	color5	color6
*/
package c1_array;

public class Array7 {

	public static void main(String args[]) {

		String[][] name = { { "이순신", "홍길동", "강감찬" }, { "박유정", "홍예훈", "김효진" }, { "김형주", "인정빈", "임택균" } };

		for (int i = 0; i < name.length; i++) {
			for (int k = 0; k < name[i].length; k++) {
				System.out.print("[" + name[i][k] + "] ");
			}
			System.out.println();
		}
		
		
		System.out.println("----------------------");
		

		char[][] c = { { 'a', 'b', 'c', 'd', 'e' }, { 'f', 'g', 'h', 'i', 'j' } };

		for (int i = 0; i < c.length; i++) {
			for (int k = 0; k < c[i].length; k++) {
				System.out.print("[" + c[i][k] + "] ");
			}
			System.out.println();
		}
	}
}
