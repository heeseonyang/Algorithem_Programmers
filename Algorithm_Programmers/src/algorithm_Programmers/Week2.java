package algorithm_Programmers;

public class Week2 {

	public static void main(String[] args) {
		int[][] result = new int [8][6];
		int sum =0;
		
		for(int i=0; i<result.length; i++) {
			for(int k=0; k<result[i].length; k++) {
				sum = result[i][k];
			}
		}
		System.out.println(sum);
		
		int[]ar;
		ar = new int[5]; //���̰� 2�� �迭 ����
		System.out.println("�迭�� ar = " + ar);
		System.out.println("�迭�� ar = " + ar.toString());
		

	}

}
