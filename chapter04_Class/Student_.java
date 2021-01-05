package step5_Method;

public class Student_ {

	private String name;
	private int age;
	private String ban;
	// 필드 블록 지정 후 -source탭 - Generate Getter and Setter - part뒤로 위치 설정 후 적용
	//생성자 사용시, 값이 고정된 채 바꿀 수 없다. 따라서 get/set메소드를 사용해준다.

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

	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}

	void printSt() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("반  : " + ban);
		System.out.println("*****************");
	}

}
