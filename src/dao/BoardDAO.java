package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DBConnection.DBConnection;
import VO.BoardVO;

public class BoardDAO {
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	private void freeResource() {
		try {
			if(conn != null) conn.close();
			if(pstmt !=null) pstmt.close();
			if(rs != null) rs.close();
		} catch (Exception e) {
			System.out.println("freeResource error : " +e.toString());
		}
	}//end of freeResource

	public int insertArticle(BoardVO boardVO) {
		int num = 0;
		String query = "";
		int insertCount = 0;
		
		try {
			conn = DBConnection.getConntection();
			query = "SELECT max(num) FROM board";
			rs = pstmt.executeQuery();
			if(rs.next()) {
				num = rs.getInt(1)+1;
			}else {
				num = 1;
			}
			
			query = "INSERT INTO board(title,writer,content) VALUES(?,?,?)";
			pstmt.setString(1, boardVO.getTitle());
			pstmt.setString(2, boardVO.getWriter());
			pstmt.setString(3, boardVO.getContent());
			insertCount = pstmt.executeUpdate();			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			freeResource();
		}
		
		return insertCount;
	}
	
	

	

}
