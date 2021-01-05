/*
	int i = 10;
	Integer i = new Integer(10);
	
	
	<<Wrapper Class>>

*/
package Wrapper;

public class W1_Integer {
	public static void main(String[] args) {

		Integer i = new Integer(10);
//		int ii = i.intValue(); // intValue(); 언박싱, 즉 객체를 값으로저장
		int ii = i;
		Integer.valueOf(ii); // 박싱

		System.out.println(i);
		System.out.println(ii);

		Character c = new Character('c');
//		char cc = c.charValue(); // 언박싱
		char cc = c; // 자동언박싱
		Character.valueOf(cc); // 박싱, 다시 객체 생성

		System.out.println(c);
		System.out.println(cc);

		Float f = new Float(3.14);
		float ff = f.floatValue();
		System.out.println(f);
		System.out.println(ff);

		Boolean b = new Boolean(true);
		boolean bb = b.booleanValue();

	}

}
