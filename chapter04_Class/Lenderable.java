package step8_추상과인터페이스;

public interface Lenderable {

	int BORROW = 1;
	int NORMAL = 0;

	void checkOut(String borrower, String date);

	void chechIn();

}

class SeperateVolume implements Lenderable {
	String title;
	String date;
	String borrower;
	int status;

	public SeperateVolume(String title) {
		this.title = title;
	}

	@Override
	public void checkOut(String borrower, String date) {
		if (status != NORMAL) {
			return;
		}

		this.date = date;
		this.borrower = borrower;
		status = BORROW;
		System.out.println(borrower + "가" + date + "일에" + title + "을 대여했습니다.");
	}

	@Override
	public void chechIn() {
		if (status != BORROW) {
			return;
		}
		System.out.println(borrower + "가" + title + "을 반납하였습니다.");
		title = null;
		borrower = null;
		status = NORMAL;
	}

}
