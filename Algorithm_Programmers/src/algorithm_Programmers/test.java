package algorithm_Programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test {

	 public int solution(int[] estimates, int k) throws IOException{        
	        int answer = 0; //k일 동안 추정 접속자 수의 합
	        
	        
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        k = Integer.parseInt(br.readLine());//k값 입력 (k일)
	        
	        StringTokenizer st = new StringTokenizer(br.readLine()); //추정 접속자 수 입력
	        
	        int max =0;
	        int sum=0;
	        
	        for(int i=0; i<k; i++){
	            estimates[i] = Integer.parseInt(st.nextToken());
	            sum += estimates[i];
	            
	            if(sum == max) {
	            	answer = max;
	            }
	        }
	        System.out.println(answer);
	               
	        return answer;
	    }
	}