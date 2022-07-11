package co.micol.mavenprj.sort;

public class SelectSort {
	public void run(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) { // 오름차순
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("\n선택정렬결과 >> ");
		for (int n : arr) {
			System.out.print(n + " ");
		}
	}

	public void sort(int[] arr) {
		int min;
		for (int i = 0; i < arr.length; i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			if (min != i) { // 현재 요소보다 작은값을 가지는 요소와 교환
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}

		System.out.print("\n최신정렬결과 >> ");
		for (int n : arr) {
			System.out.print(n + " ");
		}
	}

}
