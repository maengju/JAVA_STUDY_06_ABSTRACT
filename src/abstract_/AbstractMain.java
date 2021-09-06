package abstract_;

public class AbstractMain extends AbstractTest{

	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	
	public static void main(String[] args) {

		//AbstractTest at = new AbstractTest(); //추상클래스일 경우 new 로 생성 불가
		AbstractTest at = new AbstractMain();// 부모 = 자식
		
		at.setName("홍길동");
		System.out.println(at.getName());

	}

}
