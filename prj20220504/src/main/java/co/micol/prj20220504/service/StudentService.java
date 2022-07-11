package co.micol.prj20220504.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import co.micol.prj20220504.dto.StudentVO;

public class StudentService {// crud create,read,update,delete
	private StudentVO student;

	private List<StudentVO> students = new ArrayList<StudentVO>();

	private void dataSet() {
		student = new StudentVO("lee", "이기자", "컴퓨터공학", "대구광역사", "010-1234-5677", Date.valueOf("1991-10-27"));
		students.add(student);
		student = new StudentVO("park", "박승리", "컴퓨터공학", "대구광역사", "010-1111-5677", Date.valueOf("1992-10-27"));
		students.add(student);
		student = new StudentVO("kim", "김치국", "컴퓨터공학", "대구광역사", "010-2222-5677", Date.valueOf("1993-10-27"));
		students.add(student);
		student = new StudentVO("hong", "홍길동", "컴퓨터공학", "대구광역사", "010-3333-5677", Date.valueOf("1994-10-27"));
		students.add(student);
	}

	public void selectList() {// 학생목록보기
		dataSet();
		for (StudentVO vo : students) {
			vo.toString();
		}
	}

	public void selectStudent(String id) {
		dataSet();
		// break빠져나오면 for문 밖 여기로옴
		for (StudentVO vo : students) {
			if (vo.getId().equals(id)) {
				System.out.println("검색한 학생 >>> ");
				vo.toString();
				break;
			}
		}
	}

	public void insertStudent(StudentVO vo) {
		dataSet();
		students.add(vo);

		for (StudentVO svo : students) {
			svo.toString();
		}
	}

	public void deleteStudent(String id) {
		for (StudentVO vo : students) {
			if (vo.getId().equals(id)) {
				vo.setId(null);
				break;
			}
		}
		System.out.println(students);
	}

}
