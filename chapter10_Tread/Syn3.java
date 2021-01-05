package syn;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class GamePanel extends JPanel {
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.fillRect(0, 0, 50, 50);
		
	}
	
	public GamePanel() {
		
	//배경 이미지 
		
		
		
		
	//비행기 이미지 라벨
	ImageIcon target = new ImageIcon(".\\IMG\\AirCraft.png");
	JLabel targetla = new JLabel(target);
	targetla.setSize(50,50);
	
	//총대 이미지 라벨
	
	
	
	
	
	
	
	
		
	}
	
}

public class Syn3 {
	
	public Syn3() {
	
	}
	
	public static void main(String[] args) {
		new Syn3();
	}
	
	
	

}
