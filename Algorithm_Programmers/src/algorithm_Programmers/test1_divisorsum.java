package algorithm_Programmers;

import java.util.Scanner;

//����� ������ ����
public class test1_divisorsum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int left = scan.nextInt();
		int right = scan.nextInt();
		int answer = 0;

		for (int i = left; i <= right; i++) { // left~right������ ���� ���ϱ�
			int cnt = 0;
			for (int j = 1; j <= left; j++) {// ���հ��� ��� ���ϱ�
				if (i % j == 0) {
					cnt++;// ����� ���� ��
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
