package algorithm_Programmers;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution {
	public int[] solution(int N, int[] coffee_times) throws IOException {
		coffee_times = new int[5];
		int[] answer = {};

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine()); // n�Է¹���
		
		StringTokenizer st = new StringTokenizer(br.readLine());//�ð� �Է�
		for(int i=0; i<coffee_times.length; i++) {//�迭ũ�⸸ŭfor��
			coffee_times[i] = Integer.parseInt(st.nextToken());//�ɰ��� ����
			//System.out.println(coffee_times[i]);
		}

		Arrays.sort(coffee_times);
		System.out.println(coffee_times);
		return answer;
	}
}
