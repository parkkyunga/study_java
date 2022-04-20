package co.edu.array;

public class ArrayExam3 {
	public static void main(String[] args) {
		System.out.println("1.1~100까지의 데이터를 넣은 배열에서 3의 배수만 출력");
		int ary[] = new int[100];
		for (int i = 0; i < ary.length; i++) {
			ary[i] = i + 1;
			if (ary[i] % 3 == 0) {
				System.out.println(ary[i]);
			}
		}
		
		System.out.println("\n2.1에서 만든 배열에서 짝수만출력");
		for (int i = 0; i < ary.length; i++) {
			ary[i] = i + 1;
			if (ary[i] % 2 == 0) {
				System.out.println(ary[i]);
			}
		}
	}
}
