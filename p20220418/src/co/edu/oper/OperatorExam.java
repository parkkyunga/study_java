package co.edu.oper;

public class OperatorExam {
	public static void main(String[] args) {
		// / -> 몫
		// % -> 나머지
		//10000초 -> 10000/(60*60) = 시간
		//          10000%60 = 남는 초
		
		int hour = 10000/(60*60);
		int min = 10000/60;
		int sec = 10000%60;
		System.out.println(hour+"시간");
		System.out.println(min+"분");
		System.out.println(sec+"초");
		System.out.println(hour+"시간"+(10000/60)%60+"분"+sec+"초");
		System.out.println("----------------------");
		
		
		int i = 0;
		i = i + 1;
		i += 1; //대입연산자
		i++;    //증감연산자
		
		int j = 0;
		j++;
		System.out.println(j);
		++j;
		System.out.println(j);
		System.out.println(++j);
		System.out.println(j++);
		System.out.println(j);
		
		
	}
}
