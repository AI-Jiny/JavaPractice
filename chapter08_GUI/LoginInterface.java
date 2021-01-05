package component;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LoginInterface extends JFrame {

	Container c = getContentPane();
	
	public LoginInterface() {
	
		c.setLayout(null);	//위치 지정 꼭 해줘야함
		
		JPanel textId = new JPanel();
		JPanel textPw = new JPanel();
		
		JPanel loginTap = new JPanel();
		
		JPanel safe = new JPanel();	// 클릭 시 ON/OFF변경
		JPanel temp = new JPanel();	// 일회용 로그인
		
	
	}
	
	
	
	
	public static void main(String[] args) {
		
		new LoginInterface();	
	}
	
}
