package Wrapper;

public class W2_Integer {
	
	public static void main(String[] args) {
		
		System.out.println("***parseInt()***");
		
		
		int j = Integer.parseInt("123");		//문자열 숫자를 정수숫자로 전환
		System.out.println(j);
		
		
		boolean b = Boolean.parseBoolean("j");	//문자값이면 true
		System.out.println(b);
			
		
		float f = Float.parseFloat("3.14");
		System.out.println(f);
		
		System.out.println("***toString***");
		
		
		String s1 = Integer.toString(123);		//문자로 변환 되는 과정
		System.out.println(s1+999);
		
		String s2 = Integer.toHexString(123);
		System.out.println(s2);
		
		String s3 = Float.toString(3.14f);
		System.out.println(s3+9999);
		
		String s4 = Character.toString('a');
		System.out.println(s4+9999);
		
		String s5 = Boolean.toString(true);
		System.out.println(s5);
		
	}

}
