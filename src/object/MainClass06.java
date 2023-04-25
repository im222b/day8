package object;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		TestClass06 t = new TestClass06();
		//System.out.println( t );
		
		
		int[] num = t.myInput();
		
		t.test(num[0], num[1]); //num = [10,20] 순번대로 넘긴다
	}
}
