package step7_Extends;

class Parent {
	int x = 100;

	public Parent() {
		this(200);
		System.out.println("실행 1 : 이때 x의 값은? " + x);		//200
	}

	Parent(int x) {
		System.out.println("실행 2 : 이때 x의 값은? " + this.x);	//100
		this.x = x;
		System.out.println("실행 3 : 이때 x의 값은? " + this.x);	//200
	}

	int getX() {
		return x; // 이때 x의 값은? 200
	}

}

class Child extends Parent{
	int x = 3000;

	public Child() {
		this(1000);
		System.out.println("실행 4 : 이때 x의 값은? " + x);		//1000
	}

	Child(int x) {
//		super(x);
		System.out.println("실행 5 : 이때 x의 값은? " + this.x);	//3000
		this.x = x;
		System.out.println("실행 6 : 이때 x의 값은? " + this.x);	//1000
	}

	int getY() {
		return x; // 이때 x의 값은?1000
	}

}

public class E7_SuperTest {
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		System.out.println("x = "+c.getX());
		System.out.println("x = "+c.getY());
			
	}

}
