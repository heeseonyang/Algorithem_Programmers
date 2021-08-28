package algorithm_Programmers;

import java.util.Scanner;

//약수의 개수와 덧셈
public class test1_divisorsum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int left = scan.nextInt();
		int right = scan.nextInt();
		int answer = 0;

		for (int i = left; i <= right; i++) { // left~right까지의 숫자 구하기
			int cnt = 0;
			for (int j = 1; j <= left; j++) {// 사잇값의 약수 구하기
				if (i % j == 0) {
					cnt++;// 약수의 갯수 셈
				}
			}

			if (cnt % 2 == 0) {
				answer += i;
			} else {
				answer -= i;
			}
			left++;
		}

		System.out.println(answer);

	}
}
