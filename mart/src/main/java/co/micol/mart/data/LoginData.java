package co.micol.mart.data;

import java.util.ArrayList;
import java.util.List;

import co.micol.mart.dto.LoginVO;

public class LoginData {
	public List<LoginVO> loginVO = new ArrayList<LoginVO>();

	public LoginData() {
		loginVO.add(new LoginVO("pkyung", "kyung", "박경아", "대구광역시", "010-1111-11111", 100000, 0, 0));
		loginVO.add(new LoginVO("park565", "k", "홍길동", "대구광역시", "010-2222-2222", 100000, 100000, 0));
		loginVO.add(new LoginVO("akyung", "k", "김자바", "대구광역시", "010-3333-4444", 100000, 0, 0));
		loginVO.add(new LoginVO("admin", "admin", "관리자", "대구광역시", "010-0000-0000", 100000, 100000, 1));
	}
}
