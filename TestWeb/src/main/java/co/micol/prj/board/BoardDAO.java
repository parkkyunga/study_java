package co.micol.prj.board;

import java.sql.SQLException;
import java.util.ArrayList;

import co.micol.prj.comm.DAO;

public class BoardDAO extends DAO{
	public ArrayList<BoardVO> selectAll(){
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		getConnect();
		String sql = "select * from board order by id desc";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setId(rs.getString("id"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setWriter(rs.getString("writer"));
				vo.setRdt(rs.getString("rdt"));
				vo.setHit(rs.getString("hit"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
		return list;
		
	}

	public int boardInsert(BoardVO vo) {
		int cnt = 0;
		String sql = "insert into board values(?,?,?,?,?,?)";
		getConnect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getTitle());
			psmt.setString(3, vo.getContent());
			psmt.setString(4, vo.getWriter());
			psmt.setString(5, vo.getRdt());
			psmt.setString(6, vo.getHit());
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return cnt;
	}

	public int boardUpdate(BoardVO vo) {
		int cnt = 0;
		
		return cnt;
	}

	public BoardVO selectOne(String id) {
		BoardVO vo = new BoardVO();
		getConnect();
		String sql = "select * from board where id=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				vo.setId(rs.getString("id"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setWriter(rs.getString("writer"));
				vo.setRdt(rs.getString("rdt"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return vo;
	}

}
