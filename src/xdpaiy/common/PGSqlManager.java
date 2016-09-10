package xdpaiy.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PGSqlManager {
	public static void main(String args[]) { 
	      Connection c = null; 
	      try { 
	         Class.forName("org.postgresql.Driver"); 
	         c = DriverManager 
	            .getConnection("jdbc:postgresql://localhost:5432/postgres", 
	            "postgres", "postgres"); 
	         PreparedStatement ps = c.prepareStatement("select * from \"603007\" ");
	         ResultSet rs = ps.executeQuery();
	         while(rs.next()){
	        	 System.out.println(rs.getString("date"));
	        	 System.out.println(rs.getString("open"));
	         }
	      } catch (Exception e) { 
	         e.printStackTrace(); 
	         System.err.println(e.getClass().getName()+": "+e.getMessage()); 
	         System.exit(0); 
	      } 
	      System.out.println("Opened database successfully"); 
	   }
	
	public static Connection getConnectionPostgres() throws SQLException, ClassNotFoundException{
		 Class.forName("org.postgresql.Driver"); 
		 Connection   c = DriverManager 
            .getConnection("jdbc:postgresql://localhost:5432/postgres", 
            "postgres", "postgres"); 
         return c;
	}
	public static Connection getConnectionMydb() throws SQLException, ClassNotFoundException{
		 Class.forName("org.postgresql.Driver"); 
		 Connection   c = DriverManager 
           .getConnection("jdbc:postgresql://localhost:5432/mydb", 
           "postgres", "postgres"); 
        return c;
	}
	
	public static ResultSet queryBySQL(Connection con,String sql) throws SQLException{
		 PreparedStatement ps = con.prepareStatement(sql);
		 ResultSet rs = ps.executeQuery();
		 return rs;
	}

}
