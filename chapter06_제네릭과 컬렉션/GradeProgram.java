package Collection;

import java.util.HashMap;
import java.util.Scanner;

class Grade {
	public int id;
	public String name;
	private int kor, eng, math;

	public Grade(int id, String name, int kor, int eng, int math) {
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// 과목 성적 설정하기 void set과목()
	// 과목 성적 가져오기 int get과목()
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	// 학생별 성적 출력하기 void print
	public void print() {

		System.out.println("학번 : " + id + "\n" + "이름 : " + name + "\n" + "국어점수 : " + kor + " , 영어점수 : " + eng
				+ " , 수학점수 : " + math);
	}

	// 총점 구하기 int getTotal()
	public int getTotal() {
		return kor + eng + math;
	}

	// 평균 구하기 float getAvg()

	public float getAvg() {
		return (float) (kor + eng + math) / 3;
	}

}

public class GradeProgram {

	public static void main(String[] args) {

		HashMap<String, Grade> myGrade = new HashMap<>();

		Scanner sc = new Scanner(System.in);

//		Grade my = myGrade.get(idNum);
		myGrade.put("김효진", new Grade(1001, "김효진", 100, 100, 100));
		myGrade.put("박유정", new Grade(1002, "박유정", 100, 100, 100));
		myGrade.put("홍예훈", new Grade(1003, "홍예훈", 100, 100, 100));

		Grade my;

		my = myGrade.get("김효진");
		my.print();

		System.out.println("등록된 학생의 수 : " + myGrade.size());

		System.out.println("*********************************");

		while (true) {
			System.out.println("등록, 검색, 삭제 중 하고싶은 작업을 입력해주세요>>" + "\n" + "(종료 : exit)");
			String c = sc.next();

			if (c.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			if (c.equals("등록")) {

				System.out.println("등록할 학생 정보를 입력해주세요");
				System.out.println("당신의 학번을 입력하세요>>");
				int idNum = sc.nextInt();
				System.out.println("당신의 이름을 입력하세요>>");
				String name = sc.next();
				System.out.println("국어 점수를 입력하세요>>");
				int korS = sc.nextInt();
				System.out.println("영어 점수를 입력하세요>>");
				int engS = sc.nextInt();
				System.out.println("수학 점수를 입력하세요>>");
				int mathS = sc.nextInt();

				myGrade.put(name, new Grade(idNum, name, korS, engS, mathS));

			} else if (c.equals("검색")) {

				System.out.println("검색할 학생 이름을 입력해주세요>>");
				String findName = sc.next();

				// 무조건 검색은 키로 키로야함

				if (myGrade.get(findName) == null) {

					System.out.println("등록된 학생이 없습니다.");

				} else {
					my = myGrade.get(findName);
					my.print();
				}

			} else if (c.equals("삭제")) {

				System.out.println("삭제할 학생 이름을 입력해주세요>>");
				String delName = sc.next();

				if (myGrade.get(delName) == null) {

					System.out.println("해당 이름을 찾을 수 없습니다.");

				} else {
					my = myGrade.remove(delName);

				}

			}
			System.out.println("*********************************");

		}
//		
//		//학생 모두 삭제
//		
//		myGrade.clear();
//		
//		
//		//학생 모두 출력
//		for(int i = 0; i<myGrade.size();i++) {
//			
//			my.print();
//		}
//		
//
		sc.close();
	}

}
