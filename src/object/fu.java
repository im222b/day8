package object;

import java.util.Scanner;

public class fu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2, sum;
		System.out.println("수 입력");
		n1 = input.nextInt();
		System.out.println("수 입력");
		n2 = input.nextInt();
		int[] arr = { n1, n2 };
		sum = n1 + n2;
		if (sum % 2 == 0)

		{
			System.out.println("짝 입니다");

		} else
			System.out.println("홀 입니다");
	}

}
