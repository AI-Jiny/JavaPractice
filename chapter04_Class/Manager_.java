package step5_Method;

public class Manager_ {

	private String name;
	private int age;
	private String part;
	// private는 밖에서 가져다 쓸 수 없음, 그래서 set/get메소드를 사용해야한다.
	// source탭 - Generate Getter and Setter

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

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	void printMg() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("과목  : " + part);
		System.out.println("*****************");
	}

}
