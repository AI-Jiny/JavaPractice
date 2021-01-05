/*
	겜블링 게임 개발
	
		* "시작합니다"레이블을 붙이고 세개의 숫자가 같으면 "축하합니다", 다르면 "아쉽군요"
		* 레이블 세개를 붙여놓고 엔터를 누르면 1-9까지 숫자중 임의의 숫자가 각 레이블에 설정된다.

			7		7		7
			
				시작합니다(변경)
				
				
				
		* 키 이벤트의 프레스를 활용, 엔터키를 입력했다면 '\n'
*/
package listener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class 겜블링게임 extends JFrame {

	JPanel c = new JPanel();
	JLabel la1, la2, la3, text;

	public 겜블링게임() {

		setTitle("겜블링 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setContentPane(c);
		c.setLayout(new BorderLayout());
		c.setBackground(Color.WHITE);
		
		
		Center cen = new Center();
		cen.setBackground(Color.black);
		c.add(cen, BorderLayout.CENTER);
		

		South s = new South();
		s.setBackground(Color.PINK);
		c.add(s, BorderLayout.SOUTH);

		c.addKeyListener(new MyKeyListener());
		text.addKeyListener(new MyKeyListener());
		la1.addKeyListener(new MyKeyListener());
		la2.addKeyListener(new MyKeyListener());
		la3.addKeyListener(new MyKeyListener());
		
		
		setSize(500, 500);
		setVisible(true);

		c.setFocusable(true);
		c.requestFocus();

	}

	class Center extends JPanel {

		public Center() {

			setLayout(new GridLayout(1, 3));

			la1 = new JLabel("0", JLabel.CENTER);
			la1.setForeground(Color.WHITE);
			la1.setFont(new Font("고딕체", Font.BOLD, 20));
			
			la2 = new JLabel("0", JLabel.CENTER);
			la2.setForeground(Color.WHITE);
			la2.setFont(new Font("고딕체", Font.BOLD, 20));
				
			la3 = new JLabel("0", JLabel.CENTER);
			la3.setForeground(Color.WHITE);
			la3.setFont(new Font("고딕체", Font.BOLD, 20));
			
			add(la1);
			add(la2);
			add(la3);

		}

	}

	class South extends JPanel {

		public South() {

			setLayout(new FlowLayout());
			text = new JLabel("시작합니다.", JLabel.CENTER);
			text.setFont(new Font("고딕체", Font.BOLD, 20));
			add(text);

		}

	}

	class MyKeyListener extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			
			if(e.getKeyChar()=='\n') {
				int x = (int)(Math.random()*10);
				int y = (int)(Math.random()*10);
				int z = (int)(Math.random()*10);
				
				la1.setText(Integer.toString(x));
				la2.setText(Integer.toString(y));
				la3.setText(Integer.toString(z));
					
				if((x==y)&&(y==z)) {
					text.setText("축하합니다");
				}else {
					text.setText("아쉽군요");
				}
			}
		
		}

	}

	public static void main(String[] args) {
		new 겜블링게임();
	}

}
