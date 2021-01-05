package 직렬화;

import java.io.*;

class Parr implements Serializable {

	private static final long serialVersionUID = -2261449786581744847L;

	Person2[] arr;

	Parr() {
		arr = new Person2[5];
	}

}

class Person2 implements Serializable {

	private static final long serialVersionUID = 7172543330650633892L;

	private String name;
	private String age;
	private String add;

	public Person2() {

	}

	public Person2(String name, String age, String add) {
		this.name = name;
		this.age = age;
		this.add = add;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

}

public class SerializationEx3 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// 도면클래스 객체생성
		Person2 p1 = new Person2();
		p1.setName("김효진");
		p1.setAge("24");
		p1.setAdd("인천");

		Person2 p2 = new Person2("홍예훈", "26", "서울");
		Person2 p3 = new Person2("박유정", "28", "서울");

		Parr p = new Parr();// Person2를 저장하는 5칸짜리 배열 생성
		p.arr[0] = p1;
		p.arr[1] = p2;
		p.arr[2] = p3;
		p.arr[3] = new Person2("김유진", "22", "인천");
		p.arr[4] = new Person2("김진", "19", "인천");

		// 직렬화
		try {

			FileOutputStream fos = new FileOutputStream(".\\File\\serialization3.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(p);
			System.out.println("정상적으로 저장 되었습니다.");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
