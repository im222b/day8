package object;

import java.util.Scanner;

public class TestClass04 {
	public void sumFunc(int nnn) // 메소드에서 받아주는 값을 argument 또는 매개변수
	         					 // 괄호안에 있는 값을 저장하기 위한 통로 
	                             // 실수일 경우 double 문자열일경우 string으로
	                             // 넘어 오는값에 형태 따라 맞춰 준다 
	 {
		int sum = 0;
		for (int i = 1; i <= nnn; i++) {
			sum += i;
		}
		System.out.println("1~ "+nnn+"까지의 합 : "+sum);
		 
	 }
}
