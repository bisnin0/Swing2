package java08_swing;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClock extends JFrame{
	JLabel lbl = new JLabel("11:50:10");
	Font fnt = new Font("Arial", Font.BOLD, 100); 
	public DigitalClock() {
		super("Clock");
		//setTitle("Clock");
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image icon = kit.getImage("img/2.png");
		setIconImage(icon);

		lbl.setHorizontalAlignment(JLabel.CENTER);//JLabel 문자열 가운데 정렬
		lbl.setFont(fnt);
		add(lbl);
		
		pack();//컨텐츠 내용만큼 창의 크기가 정해짐 // setSize(400, 200);// setBounds(x,y,w,h);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		setTime();
	}
	//시간 설정
	public void setTime() {
		do {
			Calendar now = Calendar.getInstance();//현재시간
			//문자열 11:50:10
			SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss");
			String nowStr = fmt.format(now.getTime());
			//라벨에 셋팅
			lbl.setText(nowStr);
			//일시정지
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}while(true);
	}
	public static void main(String[] args) {
		new DigitalClock();
	}
}













