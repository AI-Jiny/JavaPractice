package step2_Variable;

public class V9_Parking {
	
	//멤버변수
	String name;
	int inTime;
	int outTime;
	
	final int AMTPERTIME = 3000;
	
	//생성자
	
	public V9_Parking(String name, int inTime, int outTime) {
		this.name=name;
		this.inTime=inTime;
		this.outTime=outTime;
	}
	
	//메소드
	
	void print() {
		int fee = (outTime - inTime)*AMTPERTIME;
		
		System.out.println("차종 : "+name);
		System.out.println("입고시간 : "+inTime);
		System.out.println("출고시간 : "+outTime);
		System.out.println("주차요금 : "+fee);
		System.out.println("__________________"+"\n");
		
	}
}
