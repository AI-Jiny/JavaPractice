package step8_추상과인터페이스;

abstract class DObject {
	public DObject next;

	public DObject() {
		next = null;
		System.out.println(next);

	}

	public abstract void draw();
}

abstract class Person extends DObject {
	public String name;

	public Person(String name) {
		this.name = name;
		System.out.println(name);
	}

	public String getName() {
		return name;

	}

	@Override
	public void draw() {
		System.out.println("오버라이딩시에 구현되는 메서드의 접근지정자는 범위가 더 넓어야 한다.");

	}

	// 추상메소드 추가
	abstract public void print();

}

class Superman extends Person {
	public Superman(String name) {
		super(name);

	}

	@Override
	public void print() {
		System.out
				.println(super.name + " : DOject의 추상메소드는 Person에서 구현했고," + "\n" + "Person의 추상메소드는 Superman에서 구현했습니다.");

	}

}

public class Ab3_AbstractEx {

	public static void main(String[] args) {
		// 참조변수 선언
		DObject obj;

		Person p;
		p = new Superman("홍길동"); // 자식의 객체를 부모타입으로 업캐스팅, 부모것에만 접근 가능
		p.draw(); 		// 부모메소드
		p.print(); 		// 동적 바인딩(업캐스팅으로 인한) : 추상메소드는 실행 불가능 따라서 오버라이딩 한 자식메소드가 실행됨

		obj = new Superman("김효진");
		obj.draw();

		
	}

}
