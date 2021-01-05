package step5_Method;

class Account1 {

	String accNo, name;
	int bal;

	public Account1(String an, String n, int b) {
		accNo = an;
		name = n;
		bal = b;
	}

	void withdraw(int atm) {
		if (bal > atm) {
			bal -= atm;
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}

	void deposit() {
		bal += 1000;
	}

	int getBal() {
		return bal;

	}

}

public class M3_AccountEx {

	public static void main(String[] args) {

		Account1 ac1 = new Account1("111", "임유진", 1000);
		Account1 ac2 = new Account1("222", "김효진", 2000);
		Account1 ac3 = new Account1("333", "박유정", 3000);

		ac1.withdraw(500);
		System.out.println(ac1.bal);
		/*System.out.println(ac1.name + "님의 잔액은 " + ac1.getBal() + "원 입니다.");
*/
	}

}
