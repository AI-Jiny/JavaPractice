package chapter09;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ImageEx1 extends JFrame{
	
	public ImageEx1() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
	
		MyPanel panel = new MyPanel();
		c.add(panel);
		
		setSize(600,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ImageEx1();
	}
	
	
	class MyPanel extends JPanel{
		
		ImageIcon img;
		Image im;
		
		public MyPanel() {
		
			setLayout(new FlowLayout());
			setBackground(Color.orange);
			
			JButton bt = new JButton("Background 1");
			
			//리스너 부착
			bt.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
				
					JButton btn = (JButton)e.getSource();
					
					
					if(btn.getText()=="Background 1") {
						btn.setText("Background 2");
						img = new ImageIcon(".\\Img\\Flower.jpg");
						im = img.getImage();
						
					}
					
					else {
						btn.setText("Background 1");
						img = new ImageIcon(".\\Img\\pg.jpg");
						im = img.getImage();
						
					}
					
				}
			});
			
			add(bt);
			
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			
			g.drawImage(im, 0, 0, getWidth(), getHeight(), this);
			
			repaint();
			
		}
	
	}

	
}
