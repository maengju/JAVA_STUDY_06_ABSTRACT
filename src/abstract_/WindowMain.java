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

		initBtn = new Button("�ʱ�ȭ");
		leftBtn = new Button("����");
		upBtn = new Button("��");
		downBtn = new Button("�Ʒ�");
		rightBtn = new Button("������");
		
		Panel p = new Panel();
		p.setLayout(new GridLayout(1,5,5,5));
		p.add(initBtn);
		p.add(leftBtn);
		p.add(upBtn);
		p.add(downBtn);
		p.add(rightBtn);
		
		add("North",p);
		
		
		
		
		
		setTitle("�̹���");
		setBounds(500,150,500,500); // â�� ��ġ�� ũ��
		setVisible(true); // trueâ�� ���°�  false â�� ���ִ°�
		
	}
	
		
		
		
	
	@Override
	public void paint(Graphics g) {
		g.drawString("���� �̹���", 50, 80);
		
		Toolkit t = Toolkit.getDefaultToolkit();
		
		//�̹��� �ҷ�����
		Image img = t.getImage("sadpepe.gif");
		
		//�̹��� �׸���
		//g.drawImage(img,30,120,this); // �̹��� ����Ȱ�, ���� , ���� 
		
		//�̹��� �۰�
		//g.drawImage(img,30,120,300,300,
			//			0,0,450,400,this );
		
		
		//������
		g.drawImage(img,30,120,300,300,
				450,400,0,0,this );

	}
	
	
	
	

	public static void main(String[] args) {

		new WindowMain();

	}

}
