package step4_objarr;

class ArrMethod {

	int num;

	
	int[] getScore() {
		int[] score = new int[10];

		for (int i = 0; i < 10; i++) {
			score[i] = i + 1;
			System.out.println(score[i]);
		}
		return score;
	}
	
	
	
}

public class ArrMethodEx {

	public static void main(String[] args) {

		ArrMethod arr = new ArrMethod();
		arr.getScore();

	}

}
