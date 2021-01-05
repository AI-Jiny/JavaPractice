/*
	Dialog	:	대화상자
		* 입력을 받고 출력을 해주는 창
		* JFrame과 동일한 형식으로 생성한다.
		* Modal : 다이얼로그가 오픈되면 다이얼로그를 닫기전까지 다른 작업을 할 수 없다.
		* Modaless	:	다이얼로그창과 다른 창이 각각 개별적으로 작동한다.
		* getInput()	:	텍스트필드 컴포넌트에 사용자가 입력한 문자열을 리턴한다.
*/
package window;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class DialogEx extends JFrame {

	MyDialog jb = new MyDialog(this, "Dialog made by myself", false);
	
	public DialogEx() {

		setTitle("Dialog 학습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn = new JButton("Dialog Open");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				jb.setVisible(true);
				
			}
		});

		add(btn);
		
		
		setSize(500, 500);
		setLocation(500, 150);
		setVisible(true);

	}

	class MyDialog extends JDialog {

		public MyDialog(JFrame frame, String title, boolean modal) {

			super(frame, title, modal);
//			setTitle("Dialog made by myself");
//			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			c.setBackground(Color.BLACK);
			
			
			JTextField tf = new JTextField(10);
			JButton btn = new JButton("OK");
			
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					
				}
			});
			
			c.add(tf);
			c.add(btn);
			
			setSize(200,100);
			setLocation(600,150);
			setVisible(false);
		}

	}

	public static void main(String[] args) {

		new DialogEx();
	}

}
