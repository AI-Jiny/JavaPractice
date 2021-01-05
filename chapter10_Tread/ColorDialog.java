package window;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class ColorDialog extends JFrame {
	JLabel la;
	
	public ColorDialog() {
		
		setTitle("컬러 판넬 생성하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		la = new JLabel("자바가 제일 재미있다!");
		la.setHorizontalAlignment(SwingConstants.CENTER);
		la.setFont(new Font("이탤릭", Font.ITALIC, 30));
		c.add(la, BorderLayout.CENTER);
		
		creatMenu();
		
		setSize(500,500);
		setVisible(true);
		
		}
	
	void creatMenu() {
		
		JMenuBar jb = new JMenuBar();
		JMenu jm = new JMenu("Text");
		JMenuItem ji = new JMenuItem("Color");
		
		ji.addActionListener(new MenuListener());
		
		jm.add(ji);
		jb.add(jm);
		setJMenuBar(jb);
		
	}
	
	class MenuListener implements ActionListener{

		// 1. 컬러다이얼로그 생성
		JColorChooser cc = new JColorChooser();
		
		@Override
		public void actionPerformed(ActionEvent e) {
		
			// 2. 메뉴아이템의 이름 가져오기
			String cmd = e.getActionCommand();	//문자열 반환 메소드
			
			// 3. 메뉴아이템 선택 시 해야할 일들
			if(cmd.equals("Color")) {
				
				// 4. 선택한 색지정
				Color selectedColor = cc.showDialog(null, "ColorDialog", Color.PINK);
				
				// 5. 취소버튼을 선택 또는 그냥 창을 닫을 경우	: null일 경우
				if(selectedColor != null) {
					la.setForeground(selectedColor);
					
				}
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		new ColorDialog();
	}

}
