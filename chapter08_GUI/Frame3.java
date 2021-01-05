package GUI_Swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame3 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setTitle("또 다른 프레임");

		Container contentPane = f.getContentPane();

		JButton btn = new JButton("click!"); // 컴포넌트 : 컨테이너에 담겨야 보인다

		contentPane.add(btn);

		f.setSize(500, 300);
		f.setVisible(true);

	}

}
