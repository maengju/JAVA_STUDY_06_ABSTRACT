package abstract_;


//POJO형식(Plain Old Java Object) 단순한 형식으로 잡힌 것 
public abstract class AbstractTest {

		String name;

		public String getName() {
			return name;
		}

		public abstract void setName(String name); // 추상 메소드 반드시 (Override)구현해주어야 한다
		
		
}
/*
 * 클래스
 * -extend Object
 *
 */
