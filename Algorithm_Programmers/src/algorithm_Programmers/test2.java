package algorithm_Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test2 {

	public static int main(String[] args) throws IOException {
		int[] coffee_times = new int[5];
		int[] answer = {};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // n�Է¹���
		
		StringTokenizer st = new StringTokenizer(br.readLine());//�ð� �Է�
		for(int i=0; i<coffee_times.length; i++) {//�迭ũ�⸸ŭfor��
			coffee_times[i] = Integer.parseInt(st.nextToken());//�ɰ��� �迭�� ����
			System.out.print(coffee_times[i]+" ");//�ֹ���ȣ��
		}
		System.out.println();
		Arrays.sort(coffee_times);
		System.out.println(Arrays.toString(coffee_times));
		
		return 0;
	}

}
