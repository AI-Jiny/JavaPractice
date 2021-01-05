package listener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseListener4 extends JFrame {

	JLabel la;
	JPanel c;

	public MouseListener4() {

		setTitle("Mouse Event");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		c = new JPanel();
		setContentPane(c);
		c.setLayout(new BorderLayout());
		
		
		////////////////////////////////////////////////////
		
		la=new JLabel("COLOR", JLabel.CENTER);
		la.setFont(new Font("Arial", Font.BOLD, 30));
		
		c.add(la);
		
		c.addMouseListener(new MouseListener());

		///////////////////////////////////////////////////
		
		
		
		setSize(800, 600);
		setVisible(true);

		
		
	}

	class MouseListener extends MouseAdapter {

		public void mouseClicked(MouseEvent e) {
			
			int r = (int) (Math.random() * 255 + 1);
			int g = (int) (Math.random() * 255 + 1);
			int b = (int) (Math.random() * 255 + 1);

			if (e.getClickCount() == 2) {

				c.setBackground(new Color(r, g, b));

				la.setText("Color : "+r+", "+g+", "+b);
			}
			
			

		}

	}

	public static void main(String[] args) {
		new MouseListener4();

	}
}
