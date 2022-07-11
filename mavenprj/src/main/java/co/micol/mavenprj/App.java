package co.micol.mavenprj;

import co.micol.mavenprj.sort.SelectSort;

public class App {
	public static void main(String[] args) {

		int[] arr = { 1, 6, 3, 5, 4, 2 };
		SelectSort selectSort = new SelectSort();//인스턴스생성

		System.out.print("원시 데이터 >> ");
		for(int n:arr) {
			System.out.print(n +" ");
		}
		
		selectSort.run(arr); //전통적인방법
		selectSort.sort(arr);//보다낳은방법

	}
}
