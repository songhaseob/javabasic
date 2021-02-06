package k_jdbc;

import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		JDBCUtil jdbc = JDBCUtil.getInstance();
		
		
		String sql = "select * from member where member_id = 1";
		
		List<Map<String,Object>> selectList = jdbc.selectList(sql);
		
	}

}






