package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) {
		/*
		 * JDBC(Java Database Connectivity)
		 * - 자바와 데이터베이스를 연결해주는 라이브러리
		 * - ojdbc : 오라클 JDBC
		 * 
		 * JDBC 작성 단계
		 * 1. Connection 생성
		 * 2. Statement 생성(쿼리)
		 * 3. Query 실행
		 * 4. ResultSet에서 결과 추출(select인 경우)
		 * 5. ResultSet, Statement, Connection 닫기
		 */
		
		//데이터베이스 접속 정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "sem";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			//DriverManager : 데이터베이스에 접속하기 위한 드라이버를 관리해주는 클래스
			con = DriverManager.getConnection(url, user, password);
			//getConnection에서 드라이버 자동 로드
			
			String sql = "select * from member";
			ps = con.prepareStatement(sql);
			
			//select
			rs = ps.executeQuery();
			
			//insert, update, delete
//			int result = ps.executeUpdate();
			
			while(rs.next()){
				String memId = rs.getString(1);
				String memPass = rs.getString("MEM_PASS");
				System.out.println("MEM_ID : " + memId + " / MEM_PASS : " + memPass);
				
//				rs.getInt(1);
//				rs.getDate(1);
			}
			
			//임의의 테이블 하나를 조회해서 테이블의 모든 내용을 출력해주세요.
			sql = "select * from dept";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			System.out.println("DEPT_NO\tDNAME\tLOC");
			while(rs.next()){
				int deptNo = rs.getInt(1);
				String dName = rs.getString(2);
				String loc = rs.getString(3);
				System.out.println(deptNo + "\t" + dName + "\t" + loc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
	}

}









