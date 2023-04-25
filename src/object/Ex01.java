package object;
/*
절차지향 
- C언어는 절차지향 언어라고 표현한다
- 기능들로만 이뤄져 있다
- 기능이란 함수들의 집합으로 만들어진 프로그램
- 객체지향 보다 처리속도가 빠르다
- 사용하고 싶다면 틀만 가져다 사용 가능
객체지향
- c++, python, java. .. 등의 언어
- 클래스라는 자료형으로 만들어진것 
- 재활용이 가능하다
- 절차지향보다 처리속도가 느리다
- 사용하고 싶다면 모든것을 다 가져다 써야함
- 객체는 변수다 클래스라는 자료형으로 만드려면 객체라고 표현한다.n
클래스
- 사용자 정의 자료형
- 변수와 기능들의 집합을 말한다
- 재활용이 편해서 만들어 사용한다 
  */

import members.Member;

public class Ex01 {
public static void main(String[] args) {
	Member m =new Member();
	m.name = "홍길동";
	m.addr = "산꼴짜기";
	System.out.println("이름 "+ m.name);
	System.out.println("주소 "+ m.addr);
	
}
}








