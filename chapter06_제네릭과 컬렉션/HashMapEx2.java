package Collection;

import java.util.HashMap;
import java.util.Scanner;

class StudentIdCard {

	private int id;
	private String name;
	private int age;

	public StudentIdCard(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "학번 : " + id + ", 이름 : " + name + ", 나이 : " + age;
	}

}

public class HashMapEx2 {
	public static void main(String[] args) {

		HashMap<Integer, StudentIdCard> card = new HashMap<>();

		card.put(1, new StudentIdCard(1001, "홍예훈", 26));
		card.put(2, new StudentIdCard(1002, "김효진", 24));
		card.put(3, new StudentIdCard(1003, "박유정", 28));

		// 검색하기
		Scanner sc = new Scanner(System.in);

		// exit가 입력될때까지 계속 검색
		// id, 이름, 나이를 출력하시오.

		System.out.println("찾고싶은 학생 순서를 입력해주세요. 0를 입력하면 프로그램이 종료됩니다.");

		while (true) {

			int ifm = sc.nextInt();

			if (ifm == 0) {

				System.out.println("프로그램을 종료합니다.");
				break;

			}

			StudentIdCard id = card.get(ifm);

			if (id == null) {
				System.out.println("해당 정보가 없습니다.");
			} else {
				System.out.println(id);
			}

		}
		sc.close();

//		System.out.println(card.get(1).getName());

	}
}
