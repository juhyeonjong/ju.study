package edu.board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import edu.board.vo.BoardVO;


@Repository //외부 자원과의 연결을 맡은 객체를 의미하는 어노테이션
public class BoardDAO {

	public List<BoardVO> list() throws Exception{
		//DB에서 board 테이블 게시글 목록을 조회하여 service로 반환
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs =null;
		String url = "jdbc:mysql://localhost:3306/board";
		String user = "tester";
		String pass = "1234";
		
		List<BoardVO> blist = new ArrayList<BoardVO>();
		
		try{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,user,pass);
			
			String sql = "select * from board";
			psmt = conn.prepareStatement(sql);
			
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setBtitle(rs.getString("btitle"));
				vo.setBno(rs.getInt("bno"));
				vo.setRdate(rs.getString("rdate"));
				vo.setBhit(rs.getInt("bhit"));
				
				blist.add(vo);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) conn.close();
			if(psmt != null) psmt.close();
			if(rs != null) rs.close();
		}
		
		return blist;
	}
	
	public BoardVO selectOneByBno(int bno) throws Exception{
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs =null;
		String url = "jdbc:mysql://localhost:3306/board";
		String user = "tester";
		String pass = "1234";
		
		BoardVO result = null;
		
		try{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,user,pass);
			
			String sql = "select * from board b, member m where b.mno=m.mno and b.bno = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, bno);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				result = new BoardVO();
				result.setBtitle(rs.getString("btitle"));
				result.setBno(rs.getInt("bno"));
				result.setRdate(rs.getString("rdate"));
				result.setBhit(rs.getInt("bhit"));
				result.setBcontent(rs.getString("bcontent"));
				result.setMname(rs.getNString("mname"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) conn.close();
			if(psmt != null) psmt.close();
			if(rs != null) rs.close();
		}
		
		return result;
	}
	
	
	public int update(BoardVO vo) throws Exception{
		int result = 0;
		
		Connection conn = null;
		PreparedStatement psmt = null;
		String url = "jdbc:mysql://localhost:3306/board";
		String user = "tester";
		String pass = "1234";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,user,pass);
			
			String sql = "UPDATE board       "
					   + "   SET btitle   = ?"
					   + "      ,bcontent = ?"
					   + " WHERE bno = ?     ";
						
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,vo.getBtitle());
			psmt.setString(2,vo.getBcontent());
			psmt.setInt(3,vo.getBno());
			
			result = psmt.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) conn.close();
			if(psmt != null) psmt.close();
		}
		
		
		
		return result;
		
	}
	
	public int delete(int bno) throws Exception{
int result = 0;
		
		Connection conn = null;
		PreparedStatement psmt = null;
		String url = "jdbc:mysql://localhost:3306/board";
		String user = "tester";
		String pass = "1234";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,user,pass);
			
			String sql = "DELETE FROM board "
					   + " WHERE bno = ?    ";
						
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1,bno);
			
			result = psmt.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) conn.close();
			if(psmt != null) psmt.close();
		}
		
		
		
		return result;
	}
	
	
	
}
