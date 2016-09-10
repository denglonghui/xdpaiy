package xdpaiy.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

}
