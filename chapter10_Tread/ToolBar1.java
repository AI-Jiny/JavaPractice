/*
	툴바	:	Bar모양으로 다양한 스윙 컴포넌트를 담을 수 있는 컨테이너
			BorderLayout 배치관리자를 가진 컨테이너에만 부착
*/
package window;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;


public class ToolBar1 extends JFrame {

	public ToolBar1() {
		
		setTitle("툴바 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		//메소드 호출
		creatToolBar();
		
		
		
		setSize(500,500);
		setLocation(450,200);
		setVisible(true);

	}
	
	void creatToolBar() {
		
		JToolBar jt = new JToolBar("연습 툴바");
		jt.setBackground(Color.LIGHT_GRAY);
	
		JButton btn1 = new JButton("New");
		JButton btn2 = new JButton(new ImageIcon(".\\IMG\\PlusFile.jpg"));	//이미지 버튼
		JButton btn3 = new JButton(new ImageIcon(".\\IMG\\File.jpg"));	//이미지 버튼
		
		//레이블, 텍스트 필드
		JLabel la = new JLabel("찾기");
		JTextField tx = new JTextField("검색할 단어를 입력해주세요");
		tx.setForeground(Color.LIGHT_GRAY);
		
		//콤보박스
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItem("사격 게임");//값 추가
		comboBox.addItem("클리핑 게임");
		
		//콤보박스에 리스너 부착
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox jb = (JComboBox)e.getSource();
				
				if(jb.getSelectedIndex()==0) {
					new TargetGame();
				}else if(jb.getSelectedIndex()==1) {
					new ClippingGame();
				}
			}
		});
		
		//툴바에 부착
		jt.add(btn1);
		jt.add(btn2);
		jt.add(btn3);
		jt.add(la);
		jt.add(tx);
		jt.add(comboBox);
		
		//툴바를 부착
		add(jt, BorderLayout.NORTH);
		
	}

	public static void main(String[] args) {
		new ToolBar1();
	}

}
