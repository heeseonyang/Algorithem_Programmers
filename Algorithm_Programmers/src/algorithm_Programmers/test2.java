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
		int N = Integer.parseInt(br.readLine()); // n입력받음
		
		StringTokenizer st = new StringTokenizer(br.readLine());//시간 입력
		for(int i=0; i<coffee_times.length; i++) {//배열크기만큼for문
			coffee_times[i] = Integer.parseInt(st.nextToken());//쪼개서 배열에 담음
			System.out.print(coffee_times[i]+" ");//주문번호순
		}
		System.out.println();
		Arrays.sort(coffee_times);
		System.out.println(Arrays.toString(coffee_times));
		
		return 0;
	}

}
