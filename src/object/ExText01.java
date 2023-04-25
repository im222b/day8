package object;

import java.util.Scanner;

public class ExText01 {
	public String[] myInput() {
		Scanner input = new Scanner(System.in);
		String n1, n2, n3;
		System.out.println("이름 입력");
		n1 = input.next();
		System.out.println("이름 입력");
		n2 = input.next();
		System.out.println("이름 입력");
		n3 = input.next();
		String[] arr = { n1, n2, n3 };
		return arr;

	}

	public void print(String n[]) {
		System.out.println(n[0] + ", " + n[1] +", " + n[2]);

	}
}