package window;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AudioEx extends JFrame {

	Clip clip = null;
	AudioInputStream audioStream = null;
	JLabel msgLabel;

	public AudioEx() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		msgLabel = new JLabel("");
		msgLabel.setFont(new Font("Gothic", Font.PLAIN, 15));
		c.add(msgLabel);

		playAudio(".\\IMG\\hiphop.wav");	//경로설정
		msgLabel.setText("오디오 연주중");
		
		
		c.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseExited(MouseEvent e) {
				msgLabel.setText("연주 일시 정지");
				clip.stop();
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				msgLabel.setText("연주 계속");
				clip.start();
			}
		});
		
		setSize(300, 300);
		setVisible(true);
		
	}

	private void playAudio(String path) {

		try {
			File audioFile = new File(path); // 오디오 경로
			audioStream = AudioSystem.getAudioInputStream(audioFile); // 오디오 파일

			clip = AudioSystem.getClip(); // 오디오 클립 만들고
			clip.open(audioStream); // 실행할 오디오 스트림 열고
			clip.start();

		} catch (LineUnavailableException e) {
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new AudioEx();
	}
}
