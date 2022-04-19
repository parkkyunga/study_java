package co.edu.array;

public class ArrayExam {
	public static void main(String[] args) {
		int [] ary = new int[5];
		int [] ary1 = {1,2,3,4,5};
		
		int sum = 0;
		for(int i=0;i<ary1.length;i++) {
			sum+=ary1[i];
		}
		
		System.out.println(sum+"\n");
		
		int[] scores = {83,90,95};
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		
		int sum1 = 0;
		for(int i =0;i<scores.length;i++) {
			sum1 += scores[i];
		}
		System.out.println(sum1);
		double avg = (double)sum1/3;
		System.out.println(avg);
	
		//최대값구하기
		int[] ary2 = { 5, 2, 7, 4, 8 };
		int max = 0;
		int min = ary2[0];
		for (int i = 0; i < ary2.length; i++) {
			if (max < ary2[i]) {
				max = ary2[i];
			}
			if (min > ary2[i]) {
				min = ary2[i];
			}
		}
		System.out.println("최대값"+max);	
		System.out.println("최소값"+min);	
	
	}
}
