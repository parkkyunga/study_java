//	Plus 1] 다음과 같이 출력결과가 나오도록 실행코드를 수정하세요.
//	1) 실행코드
//	class Question2 {
//	
//		public static void main(String[] args) {
//		
//			method1();
//			System.out.println(1);
//			
//			System.out.println(2);
//			
//			System.out.println(3);
//			
//			System.out.println(4);
//
//		}
//		
//		public static void method1(){
//			throw new NullPointerException();
//		}
//	}
//	
//	2) 출력결과
//		3	
//		4
//
//	3) 조건
//		try~catch~finally문 사용
//
//	Plus 2] 다음과 같이 출력결과가 나오도록 실행코드를 수정하세요.
//	1) 실행코드
//	class Question3 {
//		public static void main(String[] args) {
//
//			method(true);
//			method(false);
//
//		}
//		
//		public static void method(boolean value){
//			System.out.println(1);
//			
//			if(value){
//				throw new RuntimeException();
//			}
//			
//			System.out.println(2);
//			
//			System.out.println(3);
//			
//			System.out.println(4);
//			
//			System.out.println(5);
//			
//			System.out.println(6);
//		}
//		
//	}
//	
//	2) 출력결과
//		1
//		3
//		5
//		1
//		2
//		5
//		6
//	
//	3) 조건
//		다중 catch문 사용
//	
