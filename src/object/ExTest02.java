package object;

import java.util.Scanner;

public class ExTest02 {
		public int[] test1() {
			Scanner input = new Scanner(System.in);
			int n1, n2, sum;
			System.out.println("수 입력");
			n1 = input.nextInt();
			System.out.println("수 입력");
			n2 = input.nextInt();
			int[] arr = { n1, n2 };
			return arr;
		}
		public int test2(int n1, int n2) {

			int sum = n1 + n2;
		return sum;
		}
		public int test3(int[] n, int sum) {
			if(sum %2 != 0 ) {
				System.out.println("홀 입니다");
				return 0;
			}else {
				System.out.println("짝 입니다");
			return 1;
		}
		
		
		
	}
}

