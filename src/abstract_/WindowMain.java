package abstract_;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;

public class WindowMain extends Frame {
	private Button initBtn,leftBtn,upBtn,downBtn,rightBtn;
	
	public WindowMain() {

		initBtn = new Button("초기화");
		leftBtn = new Button("왼쪽");
		upBtn = new Button("위");
		downBtn = new Button("아래");
		rightBtn = new Button("오른쪽");
		
		Panel p = new Panel();
		p.setLayout(new GridLayout(1,5,5,5));
		p.add(initBtn);
		p.add(leftBtn);
		p.add(upBtn);
		p.add(downBtn);
		p.add(rightBtn);
		
		add("North",p);
		
		
		
		
		
		setTitle("이미지");
		setBounds(500,150,500,500); // 창의 위치와 크기
		setVisible(true); // true창을 띄우는것  false 창을 없애는것
		
	}
	
		
		
		
	
	@Override
	public void paint(Graphics g) {
		g.drawString("페페 이미지", 50, 80);
		
		Toolkit t = Toolkit.getDefaultToolkit();
		
		//이미지 불러오기
		Image img = t.getImage("sadpepe.gif");
		
		//이미지 그리기
		//g.drawImage(img,30,120,this); // 이미지 저장된곳, 가로 , 세로 
		
		//이미지 작게
		//g.drawImage(img,30,120,300,300,
			//			0,0,450,400,this );
		
		
		//뒤집기
		g.drawImage(img,30,120,300,300,
				450,400,0,0,this );

	}
	
	
	
	

	public static void main(String[] args) {

		new WindowMain();

	}

}
