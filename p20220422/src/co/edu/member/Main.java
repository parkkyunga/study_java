package co.edu.member;

public class Main {
	public static void main(String[] args) {
		
		//StaticMember sm = new StaticMember();
		//위 방법을 아래로 할수있음
		double pi = StaticMember.PI;
		System.out.println(pi);
		
		int sum =  StaticMember.plus(5, 10);
		System.out.println(sum);
		
		int minus = StaticMember.minus(10, 1);
		System.out.println(minus);
		
		
		Pizza p1 = new Pizza("super suprme");
		Pizza p2 = new Pizza("cheese");
		Pizza p3 = new Pizza("perpperoni");
		
		int sales =  Pizza.count;
		System.out.println("판매된 피자갯수: "+sales);
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if(p1 != p2) {
			System.out.println("같은피자 아닙니다.");
		}
		if(obj1 == obj2) {
			System.out.println("하나의 싱글톤 객체입니다.");
		}
		System.out.println(obj1);
		System.out.println(obj2);

		Person person = new Person("122345-1234523", "hong gil dong");
		System.out.println(person.nation + person.name + person.ssn);

		System.out.println("지구반지름: " + Earth.EARTH_RADIUS);
		System.out.println("지구표면적: " + Earth.EARTH_AREA);
	}
}
