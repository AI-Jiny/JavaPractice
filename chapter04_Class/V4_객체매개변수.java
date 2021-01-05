package step2_Variable;

//도면 클래스
class Data {
	int kor;
	int eng;
			// 주소값이 들어있음
	void add(Data d1, Data d2) { // 클래스 or 배열 덩어리를 변수로 선언 : 객체 매개 변수, 레퍼런스 변수(참조변수)
		d1.kor = d2.eng;
		System.out.println("d1 : " + d1);
	}
}

public class V4_객체매개변수 {

	public static void main(String[] args) {

		Data d1 = new Data();
		Data d2 = new Data();
		Data d3 = new Data();

		d1.kor = 70;
		d2.eng = 80;
		d3.add(d1, d2);	//d1과 d2는 객체의 주소값을 가지고 있다.
		
		System.out.println(d1.kor);
		System.out.println(d2.eng);

		System.out.println("d3값은 : "+d3);
		System.out.println("실행블록의 국어점수 : "+d1.kor);

		
	}
}
