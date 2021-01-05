package step2_Variable;

class Score{
	
	void add(int k, int e) {	//매개변수는 변수명은 상관없고, 데이터 타입과 개수, 순서만 같으면 된다.
		k=e;
		System.out.println("국어점수 : "+k);
	}
	
}

public class V3_매개변수 {
	
	public static void main(String[] args) {
		
		int kor=70;
		int eng=80;
		Score sc = new Score();
		sc.add(kor, eng);
		//call by value방식 : 매개 변수에 맞는 타입으로 순서대로 들어간다.
		System.out.println("실행블록 국어 점수 : "+kor);
		
	}
	
	
	
	

}
