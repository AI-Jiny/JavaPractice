package window;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class CDialog extends JDialog {

}

public class ConfirmDialog extends JFrame {

	public ConfirmDialog() {

		setTitle("ConfirmDialog");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JButton btn = new JButton("Confirm");
		JTextField tf = new JTextField(20);

		c.add(btn);
		c.add(tf);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int result = JOptionPane.showConfirmDialog(getParent(), "확인하시겠습니까?", "ConfirmDialog",
						JOptionPane.YES_NO_CANCEL_OPTION);
				
				if(result==JOptionPane.YES_OPTION) {
					tf.setText("Yes");
				}else if(result==JOptionPane.NO_OPTION) {
					tf.setText("NO");
				}else if(result==JOptionPane.CANCEL_OPTION) {
					tf.setText("Cancel");
				}

			}
		});

		setSize(500,500);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new ConfirmDialog();
	}

}
