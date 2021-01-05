package step7_Extends;

class Person1 {

}

class Student1 extends Person1 {

}

class Researcher extends Person1 {

}

class Professor extends Researcher {

}

public class E12_계층적업다운캐스팅 {

	public static void main(String[] args) {

		Person1 lee = new Person1();
		Person1 kim = new Student1();
		Person1 jee = new Researcher();
		Person1 park = new Professor();

		if (lee instanceof Person1) {
			System.out.println("lee는 Person타입으로 true입니다.");
		}
		if (kim instanceof Student1) {
			System.out.println("kim는 Student타입으로 true입니다.");
		}
		if (jee instanceof Researcher) {
			System.out.println("jee는 Researcher타입으로 true입니다.");
		}
		if (park instanceof Professor) {
			System.out.println("park은 Professor타입으로 true입니다.");
		}

	}

}
