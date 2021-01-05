package window;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileDialogEx1 extends JFrame {

	JLabel imgLa;
	Container c;
	
	public FileDialogEx1() {

		setTitle("메뉴에 연결해서 파일열기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		c = getContentPane();
		imgLa = new JLabel();
		
		// 메소드 호출
		creatMenu();

		setSize(500, 500);
		setVisible(true);

	}
	
	
	void creatMenu() {
		
		JMenuBar jb = new JMenuBar();
		JMenu jm = new JMenu("File");
		JMenuItem ji = new JMenuItem("Open");
		
		jm.add(ji);
		jb.add(jm);
		setJMenuBar(jb);
		
		
		
		//리스너 생성
		ji.addActionListener(new OpenListener());
		
		
	}
	
	class OpenListener implements ActionListener{

		JFileChooser jc;
		
		//연결시키기 위해서
		public OpenListener() {
			
			
		// 1. 파일탐색창 생성
			jc = new JFileChooser();	//파일 탐색기
			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
		// 2. 필터를 활용해서 파일의 종류내용 설정
			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF 이미지", "jpg", "gif");
			
		// 3. 파일탐색창에 필터부착
			jc.setFileFilter(filter);
			
		// 4. 파일창열기
			int ret = jc.showOpenDialog(null);
			
		// 5. 비정상처리
			if(ret != JFileChooser.APPROVE_OPTION) {
				
				JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				
				return;
			}
			
		// 6. 정상종료
			String filePath = jc.getSelectedFile().getPath();	//파일 경로 가져오기
			imgLa.setIcon(new ImageIcon(filePath));				//선택파일 이미지 레이블에 출력
			System.out.println(filePath);
			pack();	//이미지에 맞춰서 프레임크기 조절
			
		}
	}

	public static void main(String[] args) {
		new FileDialogEx1();
	}

}
