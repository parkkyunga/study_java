package co.micol.prj.comm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	public Connection conn;
	public PreparedStatement psmt;
	public ResultSet rs;
	// 1.드라이버(라이브러리)설치 : ojdbc.jar
	// 2.드라이버 메모리 로딩 : class.forName("패키지.클래스")
	// 3.DB연결 : Connection conn = DriverManager.getConnection("url",id,pw)
	// 4.Statement -> Statement,PrepareStatement,CallableStatement
	// sql구문실행 : DML -> int r = executeUpdate()
	// select -> ResultSet rs = executeQuery() = 결과집합문
	// 5.ResultSet 커서이동 메소드 : rs.next(),previous(),first,absolrute(4)
	// 컬럼값읽는메소드 :getXxx()
	// 6.연결해제 conn.close()

	public void getConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			// DB커넥션
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public void disconnect() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if (psmt != null) {
			try {
				psmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
