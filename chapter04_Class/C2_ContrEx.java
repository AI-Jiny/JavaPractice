package step3_constructor;

class Sonata{
	
	public Sonata() {
	System.out.println("난 기본생성자야.");
	}
	public Sonata(int a) {
		System.out.println("자동차 도어 수는 "+a+"개 입니다.");
		}
		
	public Sonata(String str) {
		System.out.println("자동차 옵션은 "+str+"입니다.");
		}
		
}



public class C2_ContrEx {

	public static void main(String[] args) {
		
		Sonata s1 = new Sonata();
		Sonata s2 = new Sonata(4);
		Sonata s3 = new Sonata("자동주행");
		

		
	}
	
}
