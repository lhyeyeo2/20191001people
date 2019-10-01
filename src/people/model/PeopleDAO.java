package people.model;

import java.sql.*;
import java.util.ArrayList;
import javax.naming.*;
import javax.sql.DataSource;


public class PeopleDAO {
	DataSource ds;
	public static final int WRITING_PER_PAGE=10;

	public PeopleDAO() {
		try {
			Context initContext = (Context)new InitialContext().lookup("java:comp/env");
			ds= (DataSource)initContext.lookup("jdbc/oracle");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<PeopleDTO> list () { 
		
	}
	
	public void search()
	
	public void update(String name,String id,String dept,int position,String duty,String phone ) {
		Connection conn = null;
		PreparedStatement pstmt= null;
		ResultSet rs= null;
		int num=1;
		
		
		
		try {
			conn= ds.getConnection();
			String sql= "INSERT INTO PEOPLE (id, name, dept, position, duty, phone) "
					+ "(values(?,?,?,?,?,?)";
		pstmt= conn.prepareStatement(sql);
		
		pstmt.setString (1,name);
		pstmt.setString (2, id);
		pstmt.setString(3, dept);
		pstmt.setInt(4, position);
		pstmt.setString(5,duty);
		pstmt.setString(6, phone);		
		
		}
		
	
	}
}
