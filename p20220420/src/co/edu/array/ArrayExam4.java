package co.edu.array;

public class ArrayExam4 {
	public static void main(String[] args) {
		int[][] ary = {{1,2},{2,3},{3,4},{4,5},{5,6}};
		for (int i=0;i<ary.length;i++) {
			for (int j=0;j<ary[i].length;j++) {
				System.out.print(ary[i][j]+" ");
			}
			System.out.println();
		}
		
		//2차원배열
		int [][] ary1 = new int[5][5];
		int num = 1;
		for(int i =0;i<ary1.length;i++) {
			for(int j=0;j<ary1[i].length;j++) {
				ary1[i][j] += num;
				num++;
			}
		}
		for(int i =0;i<ary1.length;i++) {
			for(int j=0;j<ary1[i].length;j++) {
				System.out.print(ary1[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i =0;i<ary1.length;i++) {
			for(int j=0;j<ary1[i].length;j++) {
				System.out.print(ary1[j][i]+" ");
			}
			System.out.println();
		}
		for(int i =ary1.length;i>0;i--) {
			for(int j=ary1.length;j>0;j--) {
				System.out.print(ary1[i][j]+" ");
			}
			System.out.println();
		}//?다시해보기 25~1순으로 정렬
	}
}
