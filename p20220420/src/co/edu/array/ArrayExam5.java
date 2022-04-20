package co.edu.array;

public class ArrayExam5 {
	public static void main(String[] args) {
		//참조타입String배열생성
		String[] strAry = {"김","이","박","최"};
		//향상된 포문을 이용해서 각각의 배열 요소 출력
		for(String name : strAry) {
			System.out.println(name);
		}
		System.out.println("\n"+strAry[0]);
		
		
	}
}
