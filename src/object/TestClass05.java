package object;

public class TestClass05 {
	public int sumFunc(int nnn) {
		int sum = 0;
		for (int i = 1; i <= nnn; i++) {
			sum += i;
		}
		return sum; //return 
			   		//- 값을 돌려주면서 해당 메소드를 종료
			   		//- 값이 없으면 해당 메소드만 종료
			   		//- return으로 값을 돌려줄 경우 하나만 가능하다.
					//- 돌려주는 값(자료형과 반환타입)도 일치시켜야 함
	}
}
