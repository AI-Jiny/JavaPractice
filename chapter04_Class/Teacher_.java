package step5_Method;

public class Teacher_ {

	private String name;
	private int age;
	private String subject;

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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	void printTc() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("반  : " + subject);
		System.out.println("*****************");
	}

}
