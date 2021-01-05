package window;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx1 extends JFrame {

	public MenuEx1() {

		setTitle("윈도우 창 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		creatMenu();

		setSize(250, 200);
		setVisible(true);

	}

////////////////////////////////////////////////////////////////////	
	void creatMenu() {

		JMenuBar jb = new JMenuBar();
		JMenu jm = new JMenu("File");

		JMenuItem[] jmi = { new JMenuItem("New"), new JMenuItem("Open File..."), 
							new JMenuItem("Close"),new JMenuItem("Save"), 
							new JMenuItem("Refresh"), new JMenuItem("Run") };

		for (int i = 0; i < jmi.length; i++) {

			jm.add(jmi[i]);

		}
		
		jb.add(jm);
		setJMenuBar(jb);

	}
///////////////////////////////////////////////////////////////////	

	public static void main(String[] args) {
		new MenuEx1();
	}

}
