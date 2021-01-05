package step5_Method;

class Account {
	String accountNo;
	String ownerName;
	int balance;

	// 예금
	void deposit() {
		balance += 1000;
	}

	// 출금
	void withdraw() {
		balance -= 1000;
	}

	// 잔액
	int getBal() {
		return balance;
	}

}

public class M2_입출금 {

	public static void main(String[] args) {

		Account ac = new Account();
		ac.accountNo = "1111";
		ac.ownerName = "홍길동";
		ac.balance = 5000;
		System.out.println("처음 잔고 : " + ac.getBal());

		for (int i = 0; i < 3; i++) {
			ac.deposit();
		}

		System.out.println("현재 잔고 : " + ac.balance);

		for (int i = 0; i < 3; i++) {
			ac.withdraw();
		}

		System.out.println("예금주 : " + ac.ownerName + ", 계좌번호 : " + ac.accountNo);
		System.out.println("최종 잔고 : " + ac.balance);

	}

}
