package component;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JRadioButtonEx2 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	JLabel la = new JLabel();
	Container c = getContentPane();
	String[] name = { "바나나", "키위", "배" };
	JRadioButton[] fruits = new JRadioButton[3];
	ImageIcon[] img = { new ImageIcon(".\\IMG\\banana.jpg"), 
						new ImageIcon(".\\IMG\\kiwi.jpg"),
						new ImageIcon(".\\IMG\\pear.jpg") };

	
	public JRadioButtonEx2() {

		setTitle("JRadioButton Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		c.setBackground(Color.WHITE);

		JPanel p = new JPanel();
		setContentPane(c);
		setLayout(new BorderLayout());
		p.setBackground(Color.GREEN);

		// ButtonGroup 생성
		ButtonGroup br = new ButtonGroup();

		// 라디오 버튼 생성
		for (int i = 0; i < fruits.length; i++) {
			fruits[i] = new JRadioButton(name[i]);

			// 등록
			br.add(fruits[i]);

			// 컨텐트팬에 부착
			p.add(fruits[i]);

			fruits[i].addItemListener(new MyCheck());

		}

		fruits[0].setSelected(true); // 선택설정은 반드시 JRB이 만들어진 다음에 설정해야함.

		// 이미지를 붙일 라벨 생성
		la.setBackground(Color.magenta);
		la.setHorizontalAlignment(SwingConstants.CENTER);
		la.setVerticalAlignment(SwingConstants.CENTER);

		// 화면 구성
		c.add(p, BorderLayout.NORTH);
		c.add(la, BorderLayout.CENTER);

		setSize(300, 300);
		setVisible(true);

	}

	class MyCheck implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {

			if (e.getItem() == fruits[0]) {
				la.setIcon(img[0]);

			} else if (fruits[1].isSelected()) {
				la.setIcon(img[1]);

			} else {
				la.setIcon(img[2]);
			}

		}

	}

	public static void main(String[] args) {

		new JRadioButtonEx2();

	}

}
