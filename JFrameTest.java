package java08_swing;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameTest extends JFrame{
	JButton btn1 = new JButton("11111");
	JButton btn2 = new JButton("22222");
	JButton btn3 = new JButton("33333");
	JButton btn4 = new JButton("44444");
	JButton btn5 = new JButton("55555");
	
	JPanel pane = new JPanel();
		JButton btn6 = new JButton("66666");
		JButton btn7 = new JButton("77777");
		JButton btn8 = new JButton("88888");
	public JFrameTest() {
		//�������̳� ���� �⺻ ���̾ƿ��� �ִ�.
		// JFrame, JDailog : BorderLayout
		// JPanel : FlowLayout
		// GridLayout, CardLayout, GridbagLayout
		// BorderLayout: ��,��,��,��,��� 5�������� ������.
		// FlowLayout : �߰��ϴ� ���۳�Ʈ ������� ��ġ
		// GridLayout : �ٵ��ǽ����� ���μ��� �࿭ ũ�Ⱑ ����.
		
		add(btn1);
		add(BorderLayout.NORTH, btn2);   //  add("North", btn2);
		add("West", btn3);
		
		//FlowLayout�� GridLayout�� �����ϱ�
		pane.setLayout(new GridLayout(2, 0, 10, 5));
		pane.add(btn6);
		pane.add(btn7);
		pane.add(btn8);
		pane.add(new JButton("AAAA"));
		pane.add(new JButton("BBBB"));
		
		add(BorderLayout.EAST, pane);
		
		
		add("South", btn5);		
		
		setSize(500,500);
		setVisible(true);
		
		//�����̳ʰ� ����Ǹ� �ڿ������Ѵ�.
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JFrameTest();
	}
}
