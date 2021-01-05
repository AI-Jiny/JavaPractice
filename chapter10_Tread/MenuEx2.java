package window;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MenuEx2 extends JFrame {
	JLabel la;
	public MenuEx2() {

		setTitle("윈도우 창 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MyPanel p = new MyPanel();
		setContentPane(p);
		

		la = new JLabel("Click the menu", SwingConstants.CENTER);
		la.setFont(new Font("Arial", Font.BOLD, 20));
		p.add(la, BorderLayout.CENTER);
		
		
		

		setSize(500, 500);
		setVisible(true);

	}

	void creatMenu() {

		// 메뉴바, 메뉴 만들기
		JMenuBar jb = new JMenuBar();
		jb.setBackground(Color.PINK);
		JMenu[] jm = new JMenu[5];

		// 메뉴 아이템 만들기
		String[] strMenu = { "File", "Edit", "Refactor", "Navigate", "Search" };
		for (int i = 0; i < strMenu.length; i++) {

			jm[i] = new JMenu(strMenu[i]);
			jb.add(jm[i]);
		}

		JMenuItem[] ji = new JMenuItem[5];
		String [] strMenuItem = {"Color", "Font", "Top", "Bottom", "실행"};
		for(int i=0; i<strMenuItem.length; i++) {
			ji[i]=new JMenuItem(strMenuItem[i]);
			
			ji[i].addActionListener(new MyAction());
			
			jm[0].add(ji[i]);
			}
		

		setJMenuBar(jb);

	}
	
	class MyAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//선택된 아이템의 문자열 반환
			String cmd = e.getActionCommand();
			
			if(cmd.equals("Color")) {
				la.setForeground(Color.MAGENTA);
			}
			
			else if(cmd.equals("Font")) {
				la.setFont(new Font("고딕체", Font.ITALIC, 30));
			}
			
			else if(cmd.equals("Top")) {
				la.setVerticalAlignment(SwingConstants.TOP);
				
			}else if(cmd.equals("Bottom")){
				la.setVerticalAlignment(SwingConstants.BOTTOM);
				
			}else {
				
				new TargetGame();
			}
			
		}
		
	}
	
	class MyPanel extends JPanel {

		public MyPanel() {

			setLayout(new BorderLayout());
			setBackground(Color.white);

			creatMenu();
		}

	}

	public static void main(String[] args) {
		new MenuEx2();
	}
}
