package GUI_Swing;

import java.awt.*;

import javax.swing.*;

public class Frame19_Calculator extends JFrame {

	public Frame19_Calculator() {

		setTitle("***Calculator***");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.setBackground(Color.BLACK);
		
		//////////////////////////////////////////////
		
		SouthP s = new SouthP();
		c.add(s, BorderLayout.SOUTH);
		s.setBackground(Color.magenta);
		
		CenterP cen = new CenterP();
		c.add(cen, BorderLayout.CENTER);
		
		NorthP n = new NorthP();
		c.add(n, BorderLayout.NORTH);
		n.setBackground(Color.PINK);


		/////////////////////////////////////////////
		
		setSize(700, 700);
		setVisible(true);
		

	}

	// 계산결과 입력창
	class SouthP extends JPanel {

		public SouthP() {

			setLayout(new GridLayout(1, 1));
			
			JLabel la1 = new JLabel("계산 결과", JLabel.CENTER);
			
			add(la1);
			add(new JTextField(30));
		}

	}

	// 입력버튼 4*4
	class CenterP extends JPanel {

		public CenterP() {

			setLayout(new GridLayout(4, 4));
			
				JButton [] bt = new JButton[16];
			String [] Num = {"1", "2", "3", "4", "5", "6", "7", "8", " ", "9", "0", " ", "+", "-", "*", "/"
			};
			
			for(int i = 0; i<bt.length; i++) {
				
				bt[i]= new JButton(Num[i]);
				bt[i].setBackground(Color.WHITE);
				add(bt[i]);			
			}
			
		}

	}

	// 계산 입력창
	class NorthP extends JPanel {

		public NorthP() {

			setLayout(new GridLayout(1, 1));
			JLabel la3 = new JLabel("계산 입력창", JLabel.CENTER);
			add(la3);
			add(new JTextField(30));

		}

	}

	public static void main(String[] args) {

		new Frame19_Calculator();

	}

}
