package co.micol.prj20220504;

import java.sql.Date;

import co.micol.prj20220504.dto.StudentVO;
import co.micol.prj20220504.menu.Menu;

public class App {
	public static void main(String[] args) {
		 Menu menu = new Menu();menu.run();

//		StudentVO student = new StudentVO();
//		student.setId("park@abc.com");
//		student.setName("박승리");
//		student.setMajor("컴퓨터공학과");
//		student.setBirthday(Date.valueOf("2000-01-01"));
//		student.setTel("010-1234-5678");
//		student.setAddress("대구광역시");
//		student.toString();
//		
//		student = new StudentVO("lee@park", "이기자", "경영학과", "서울특별시", "02-123-4567", Date.valueOf("2002-04-01"));
//		student.toString();
	}
}
