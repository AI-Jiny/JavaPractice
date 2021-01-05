package step3_constructor;

class Score {
	// 이름, 국어, 영어, 수학, 점수
	// 필드
	private	String name;
	private	double kor, eng, math;

	// 생성자
	public Score(String name, double kor, double eng, double math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

	}

	// print메소드 : 총점을 계산한다. 평균을 계산한다. 국어,영어,수학,총점,평균을 출력한다.
	void sum() {
		double sum;
		sum=kor+eng+math;
		System.out.println("총점 : "+sum);
	}
	
	void avg() {
		double avg;
		avg=((kor+eng+math)/3);
		System.out.printf("평균 : %.1f"+"\n", avg);
	}
	
	void print() {
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		
	}

}

public class C5_ScoreEx {

	public static void main(String[] args) {

		// 홍길동의 78, 88, 97점 객체 sc1을 생성한다.
		Score sc1 = new Score("홍길동", 78, 88, 97);
		// 이순신의 88, 98, 96점 객체 sc2를 생성한다.
		Score sc2 = new Score("이순신", 88, 98, 96);
		// sc1과 sc2의 성적내역을 출력한다.
		
		sc1.print();
		sc1.sum();
		sc1.avg();
		System.out.println("----------------------");
		sc2.print();
		sc2.sum();
		sc2.avg();

	}

}
