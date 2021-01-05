package listener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;



import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Reverse extends JFrame {

	public Reverse() {

		setTitle("Reverse");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel c = new JPanel();
		setContentPane(c);
		c.setLayout(new BorderLayout());
		c.setBackground(Color.PINK);

		
		JLabel la = new JLabel(" SHIN ♥ KIM ", JLabel.CENTER);
		la.setFont(new Font("Arial", Font.BOLD, 40));
		la.setSize(50, 50);
		
		
		
		//익명객체 생성해서 바로 만들기//////////////////////////////////////
		
		la.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				
				//회전하는 글씨 만드는 메소드///////////////////////////////

				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					
					JLabel la = (JLabel) e.getSource();
					
					String s = la.getText();
					String a = s.substring(0, 1); // 첫 한글자
					String b = s.substring(1); // 두번쨰부터 나머지

					la.setText(b.concat(a));
					
					
				} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					
					JLabel la = (JLabel) e.getSource();
					
					String s = la.getText();
					String a = s.substring(11, 12); // 맨 끝글자
					String b = s.substring(0, 11); // 처음부터 끝에서 앞까지
					
					la.setText(a.concat(b));
				}

			}
		});

		c.add(la);

		setSize(500, 500);
		setVisible(true);

		la.setFocusable(true);
		la.requestFocus();

	}

	public static void main(String[] args) {

		new Reverse();

	}

}
