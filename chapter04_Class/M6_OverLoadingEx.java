package step5_Method;

class Num{
	
	//다형성
	void print() {
		System.out.println("매개변수가 없는 메소드");
	}
	
	void print(int a) {
		System.out.println("매개 변수가 1개 : "+a);
	}
	
	void print(String x) {
		System.out.println("매개 변수가 1개 : "+x);
	}
	
	void print(int a, String x) {
		System.out.println("매개 변수가 2개 : "+a+", "+x);
	}
	
}



public class M6_OverLoadingEx {

	
	public static void main(String[] args) {
		
		Num n = new Num();
		n.print();
		n.print(7);
		n.print("오늘은 비가 올까요?");
		n.print(17, "비가 안옵니다.");
		
	}
}
