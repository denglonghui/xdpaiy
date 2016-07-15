package xdpaiy.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sina.sae.util.SaeUserInfo;


public class MySQLManager {
	String url="jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_xdpaiy";
	String username="zyl3433xy5";
	String password="x12m3500x2kkx10j3kyjwjihlli0h1izl2ll2ylj";
	String driver="com.mysql.jdbc.Driver";

	public Connection getConnection() {
		try {
			Class.forName(driver).newInstance();

			Connection con=DriverManager.getConnection(url,username,password);
			return con;
		} catch (InstantiationException e) {
			System.out.println("message1:"+e.getMessage());
		} catch (IllegalAccessException e) {
			System.out.println("message1:"+e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("message1:"+e.getMessage());
		} catch (SQLException e) {
			System.out.println("message1:"+e.getMessage());
		}
		return null;
	}
	public void test(){
		
			try {
				MySQLManager man = new MySQLManager();
				Connection con = man.getConnection();
				PreparedStatement ps = con.prepareStatement("select * from para");
				ResultSet set = ps.executeQuery();
				while(set.next()){
					String name = set.getString("key_name");
					System.out.println(name);
				}
				set.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				// TODO Auto-generated catch block
			//	e.printStackTrace();
			}
		
	}
	public static void main(String[] argv){
		MySQLManager m = new MySQLManager();
		m.test();
	}
}
