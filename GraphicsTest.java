package java08_swing;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class GraphicsTest extends JFrame{
	
	public GraphicsTest() {
		super("그림그리기");
		
		MyCanvas canvas = new MyCanvas();
		add(canvas);
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	
	class MyCanvas extends Canvas{
		public void paint(Graphics g) {
			//문자열그리기                          x,   y
			g.drawString("문자열 그리기", 100, 100);
			//직선그리기
			g.drawLine(50,  50, 300, 300);
			//사각형 그리기  - 선만
			g.drawRect(100, 50, 300, 100);
			//사각형 그리기 - 채워진
			g.setColor(Color.YELLOW);//그림색상 설정
			g.fillRect(100, 200, 300, 100);
			
			g.setColor(Color.BLUE);
			//원그리기
			g.drawOval(50, 50, 300, 200);
			g.fillOval(50, 250, 200,  100);
			//둥근사각형
			g.setColor(Color.RED);
			g.fillRoundRect(10,  10,  300,  300, 150, 50);
			//다각형
			g.setColor(Color.green);
			int x[] = {160, 340, 270, 120, 85};
			int y[] = {55, 150, 300, 277, 155};
			g.drawPolygon(x, y, x.length );			
		}
	}
	
	public static void main(String[] args) {
		new GraphicsTest();
	}
}
