package Thread;

import javax.swing.JOptionPane;

public class ThreadEx5 {

	public static void main(String[] args) throws InterruptedException {

		for (int i = 0; i <= 100; i++) {

			System.out.print(i + " ");

			if (i % 10 == 0) {
				System.out.println();
				Thread.sleep(100);
			}
			

		}

		
		//팝업창으로 데이터 받기
		String nameAsk = JOptionPane.showInputDialog("What's ur name?");
		System.out.println(nameAsk);
		Thread.interrupted();
		
	}

}
