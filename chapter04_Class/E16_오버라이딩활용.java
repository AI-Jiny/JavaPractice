package step7_Extends;

class Person2 {
	private String name;
	private int age;

	Person2(String name, int age) {
		this.name = name;
		this.age = age;
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

			public void print() {
				System.out.println("----------------");
				System.out.println("이름 : " + name);
				System.out.println("나이  : " + age);
	}

}

class Student2 extends Person2 {
	private String std;

	public Student2(String name, int age, String std) {
		super(name, age);
		this.std = std;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("학번 : " + std);
	}

}

class Teacher2 extends Person2 {

	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Teacher2(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public void print() {
		super.print();
		System.out.println("과목 : " + subject);
	}
}

class Manager2 extends Person2 {
	private String part;

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public Manager2(String name, int age, String part) {
		super(name, age);
		this.part = part;

	}

	public void print() {
		super.print();
		System.out.println("담당 : " + part);
	}

}

public class E16_오버라이딩활용 {

	public static void main(String[] args) {

		Person2[] ps = new Person2[5];
		ps[0] = new Student2("박유정", 10, "1111");
		ps[1] = new Teacher2("홍예훈", 20, "JAVA");
		ps[2] = new Manager2("김효진", 30, "사장님");
		ps[3] = new Student2("김유진", 40, "4444");
		ps[4] = new Student2("김진", 50, "5555");
		
		for(Person2 p : ps) {
			p.print();		//부모 메소드 실행
			
			if(p instanceof Manager2) {
				Manager2 m = (Manager2)p;
				m.getPart();
				
				
				
			}
			
		}

	}

}
