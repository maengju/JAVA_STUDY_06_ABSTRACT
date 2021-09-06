package abstract_;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberMain {

	public static void main(String[] args) {
		//3�ڸ����� ,�� ��� �Ҽ����� 3°�ڸ����� 
		//NumberFormat nf = new NumberFormat(); -error �߻� �żҵ��̱⶧���� new�� ���ҷ���
		NumberFormat nf = new DecimalFormat();
		System.out.println(nf.format(1234567.12375));
		System.out.println(nf.format(123124245));
		System.out.println();
		
		//��ȿ���ڰ� �ƴѰ��� ǥ������ �ʴ´�.
		NumberFormat nf2 = new DecimalFormat("#,###.##��"); // ����Ŭ�� �����Ǽ��ڸ� 9,999�� ǥ��
		System.out.println(nf2.format(1234567.12775));
		System.out.println(nf2.format(123124245));
		System.out.println();
		

		NumberFormat nf3 = new DecimalFormat("#,###.00��"); // �Ҽ����� ������ ������ 0���� ǥ��
		System.out.println(nf3.format(1234567.12775));
		System.out.println(nf3.format(123124245));
		System.out.println();
		
		
		//�߻�Ŭ������ �޼ҵ带 �̿��Ͽ� ����
		//3�ڸ����� ���, �Ҽ����� 3°�ڸ�
		
		//NumberFormat nf4 = NumberFormat.getInstance();
		NumberFormat nf4 = NumberFormat.getCurrencyInstance();
		System.out.println(nf4.format(1234567.12775));
		System.out.println(nf4.format(123124245));
		System.out.println();
		
		NumberFormat nf5 = NumberFormat.getInstance();
		nf5.setMaximumFractionDigits(2); // �Ҽ� ���� *°�ڸ����� ���Ѵ�.
		nf5.setMinimumFractionDigits(2);//������ 0�� ǥ��
		System.out.println(nf5.format(1234567.12775));
		System.out.println(nf5.format(123124245));
		System.out.println();
		
		//NumberFormat nf6 = NumberFormat.getInstance(Locale.KOREA);
		NumberFormat nf6 = NumberFormat.getCurrencyInstance(Locale.US);
		nf5.setMaximumFractionDigits(2); // �Ҽ� ���� *°�ڸ����� ���Ѵ�.
		nf5.setMinimumFractionDigits(2);//������ 0�� ǥ��
		System.out.println(nf6.format(1234567.12775));
		System.out.println(nf6.format(123124245));
		System.out.println();
		
		
		
		
	}

}
