package co.edu.roof;

public class LoofExam {
	public static void main(String[] args) {
		int sum = 0;
		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		System.out.println(sum);
		
		//1~5까지의 합
		int sum2 = 0;
		for(int i =1;i<=5;i++) {
			sum2 +=i;
		}
		System.out.println(sum2);
		
		
		//구구단2단
		for (int i = 1; i <= 9; i++) {
			System.out.println("2x" + i + "=" + 2 * i);
		}
		
		//100이하의 수 중에 2,3의 배수
		for(int i =1;i<=100;i++) {
			if(i%3 == 0) {
				System.out.println(i);
			}
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
		//
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i+"x"+j+"=" + i * j);
			}
		}
		
	}
}
