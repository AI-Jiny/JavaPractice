package c4_package;

public class D2_Char {
	
	public static void main(String[] args) {
		
		char c1 = 'A';				//그냥 문자
		char c2 = 65;				//숫자-이진수-아스키코드-A
		char c3 = '\u0061';			//유니코드
									//0000 0000 0100 0001 (16진수) --> 0000000001000001(2진수) 
									//0	   0	4	 1						 65
									//(char)65-->A
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		char c4 ='가';
		char c5 = 44032;
		char c6 = '\uac00';			//1010 1100 0000 0000 -> 10101100000000000 -> 44,032
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		
	}

}
