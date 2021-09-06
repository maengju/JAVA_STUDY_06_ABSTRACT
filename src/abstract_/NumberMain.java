package abstract_;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberMain {

	public static void main(String[] args) {
		//3자리마다 ,를 찍고 소수이하 3째자리까지 
		//NumberFormat nf = new NumberFormat(); -error 추상 매소드이기때문에 new로 못불러옴
		NumberFormat nf = new DecimalFormat();
		System.out.println(nf.format(1234567.12375));
		System.out.println(nf.format(123124245));
		System.out.println();
		
		//유효숫자가 아닌것은 표현하지 않는다.
		NumberFormat nf2 = new DecimalFormat("#,###.##원"); // 오라클은 임의의숫자를 9,999로 표시
		System.out.println(nf2.format(1234567.12775));
		System.out.println(nf2.format(123124245));
		System.out.println();
		

		NumberFormat nf3 = new DecimalFormat("#,###.00원"); // 소수점이 없더라도 강제로 0으로 표시
		System.out.println(nf3.format(1234567.12775));
		System.out.println(nf3.format(123124245));
		System.out.println();
		
		
		//추상클래스를 메소드를 이용하여 생성
		//3자리마다 찍고, 소수이하 3째자리
		
		//NumberFormat nf4 = NumberFormat.getInstance();
		NumberFormat nf4 = NumberFormat.getCurrencyInstance();
		System.out.println(nf4.format(1234567.12775));
		System.out.println(nf4.format(123124245));
		System.out.println();
		
		NumberFormat nf5 = NumberFormat.getInstance();
		nf5.setMaximumFractionDigits(2); // 소수 이하 *째자리까지 원한다.
		nf5.setMinimumFractionDigits(2);//강제로 0을 표시
		System.out.println(nf5.format(1234567.12775));
		System.out.println(nf5.format(123124245));
		System.out.println();
		
		//NumberFormat nf6 = NumberFormat.getInstance(Locale.KOREA);
		NumberFormat nf6 = NumberFormat.getCurrencyInstance(Locale.US);
		nf5.setMaximumFractionDigits(2); // 소수 이하 *째자리까지 원한다.
		nf5.setMinimumFractionDigits(2);//강제로 0을 표시
		System.out.println(nf6.format(1234567.12775));
		System.out.println(nf6.format(123124245));
		System.out.println();
		
		
		
		
	}

}
