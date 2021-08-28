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
		N = Integer.parseInt(br.readLine()); // n입력받음
		
		StringTokenizer st = new StringTokenizer(br.readLine());//시간 입력
		for(int i=0; i<coffee_times.length; i++) {//배열크기만큼for문
			coffee_times[i] = Integer.parseInt(st.nextToken());//쪼개서 넣음
			//System.out.println(coffee_times[i]);
		}

		Arrays.sort(coffee_times);
		System.out.println(coffee_times);
		return answer;
	}
}
