package step5_Method;


public class PersonEx {
	
	public static void main(String[] args) {
		
		Student_ st1 = new Student_();
		st1.setName("수지");
		st1.setAge(21);
		st1.setBan("1");
		System.out.println("학생이름 : "+st1.getName());

		Teacher_ tc1 = new Teacher_();
		tc1.setName("홍길동");
		tc1.setAge(35);
		tc1.setSubject("JAVA");
		
		Manager_ mg1 = new Manager_();
		mg1.setName("원빈");
		mg1.setAge(30);
		mg1.setPart("화장실 청소");
		mg1.printMg();
		
	}

}
