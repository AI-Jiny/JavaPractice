package step1_클래스와객체;

class P {

	String name;
	String job;
	int age;
	String gender;
	String blood;

	public P(String n, String j, int a, String g, String b) {

		name = n;
		job = j;
		age = a;
		gender = g;
		blood = b;

	}
	
	void print() {
		System.out.println("이름 : "+name+", 직업 : "+job+", 나이 : "+age+", 성별 : "+gender+", 혈액형 : "+blood);
	}
	
	void sleep() {
		System.out.println("잠을 잡니다.");
	}
	
	void wake() {
		System.out.println("일어납니다.");
	}

}

class C2_PersonEx {

	public static void main(String[] args) {

		P p1 = new P("최승희", "의사", 45, "여", "A");
		P p2 = new P("이미녀", "골프선수", 28, "여", "O");
		P p3 = new P("김미남", "교수", 47, "남", "AB");
		
		String f1 = p1.name;
		String f2 = p1.job;
		int f3 = p1.age;
		String f4 = p1.gender;
		String f5 = p1.blood;
		System.out.println(f1+", "+f2+", "+f3+", "+f4+", "+f5);
		
		
		System.out.println("-------------------------------------------------");
		
		p1.print();
		p2.print();
		p3.print();
		
		System.out.println("-------------------------------------------------");
		
		
		p1.sleep();
		p1.wake();
		
		
		

	}

}
