/*
	형변환
		-컴퓨터는 정수 +실수 이렇게 다른 타입의 연산을 못한다. 그래서 같은 타입으로 바꿔줘야 한다.
		-이렇게 타입을 변환하는 것을 형변환이라고 하는데 자동으로 해주는 묵시적 형변환과 직접해주는 명시적 형변환이 있다.
		
	묵시적 형변환 : 자동형변환
		. 작은것 -> 큰것으로 변환
		. 덜 세밀(정수) -> 더 세밀(실수)로 변환
		. byte(1) >> short/char(2) >> int/float(4) >> long/double(8)

*/
package c4_package;

public class D7_TypeCasting {
	
	public static void main(String[] args) {
		
		byte b =127;		//1byte	00000000
		int i = 100;		//4byte	0000000000000000
		//묵시적인 형변환
		System.out.println("b+i = "+(b+i));
		System.out.println("10/4 = "+(10/4));		//기본 데이터타입 int에 저장된다.
		System.out.println("10.0/4 = "+(10.0/4));	//실수로 자동 타입변환
		
		
		//명시적 형변환
		System.out.println("(char)0x12340041 = "+((char)0x12340041));
		System.out.println("(byte)(b+i) = "+(byte)(b+i));		//1바이트 + 4바이트 ->1바이트

	}

}
