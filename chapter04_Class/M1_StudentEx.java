package step5_Method;

import java.util.Scanner;

class Student {

	String name;
	double kor, eng, math, sum, avg;
	// 멤버변수 = 전역변수

	public Student(String name, double kor, double eng, double math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

	}

	// 총점구하기
	double sum() {
		sum = kor + eng + math;
		return sum;

	}

	// 평균구하기
	double avg() {
		avg = sum / 3;
		return avg;

	}

	// 출력해주기
	void print() {
		System.out.println("이름 : " + name + ", 성적 총점 : " + sum() + ", 성적 평균 : " + avg() + ", sum메소드의 결과값 : " + sum());
	}
}

public class M1_StudentEx {

	public static void main(String[] args) {

		// 배열 만들기
		Student[] st = new Student[10];

		Student st1 = new Student("김효진", 100, 100, 100);
		st[0] = st1;

		Student st2 = new Student("김유진", 97, 87, 98); // 객체변수 생성해서 저장
		st[1] = st2;

		st[2] = new Student("김은경", 80, 80, 80); // 객체 생성해서 직접 저장
		
		
		st[2].print();
/*
		System.out.println("이름, 국어, 영어, 수학 점수를 입력해주세요>>");
		Scanner sc = new Scanner(System.in);

		String name = sc.next();
		int k = sc.nextInt();
		int e = sc.nextInt();
		int m = sc.nextInt();
		st[3] = new Student("이효리", 70, 70, 70); // 입력 받아서 저장
*/
		/*
		 * st[4]=new Student("김진", 80, 80, 80); System.out.println(st[0].print());
		 */

		// 배열속에 Student객체를 넣기
		// st[i]=new Student(name, kor, eng, math);
		/*sc.close();*/
	}

}
