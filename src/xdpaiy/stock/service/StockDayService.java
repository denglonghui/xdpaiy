package xdpaiy.stock.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import xdpaiy.common.PGSqlManager;
import xdpaiy.stock.vo.StockDayInfo;
import xdpaiy.stock.vo.StockInfo;

public class StockDayService {
	
	public static List<StockDayInfo> queryStockDayInfoByCode(String code) throws ClassNotFoundException, SQLException{
		List<StockDayInfo> list = new ArrayList<StockDayInfo>();
		Connection con = PGSqlManager.getConnectionPostgres();
		String sql="select * from \""+code+"\"";
		ResultSet rs = PGSqlManager.queryBySQL(con, sql);
		while(rs.next()){
			StockDayInfo info = new StockDayInfo();
			info.setCode(code);;
			info.setClose(rs.getDouble("close"));
			info.setDate(rs.getString("date"));
			info.setHigh(rs.getDouble("high"));
			info.setLow(rs.getDouble("low"));
			info.setOpen(rs.getDouble("open"));
			info.setpChange(rs.getDouble("p_change"));
			list.add(info);
		}
		rs.close();
		con.close();
		
		return list;
		
	}
	public static List<String> queryAllCodes() throws SQLException, ClassNotFoundException{
		List<String> list = new ArrayList<String>();
		Connection con = PGSqlManager.getConnectionPostgres();
		String sql="select code from stock_list";
		ResultSet rs = PGSqlManager.queryBySQL(con, sql);
		while(rs.next()){
			String code=rs.getString("code");
			list.add(code);
		}
		rs.close();
		con.close();
		
		return list;
	}
	
	public static void calStock(String code) throws ClassNotFoundException, SQLException{
		Connection con = PGSqlManager.getConnectionPostgres();
		String sql="select * from \""+code+"\" limit 100";
		List<StockDayInfo> list = new ArrayList<StockDayInfo>();
		ResultSet rs = PGSqlManager.queryBySQL(con, sql);
		while(rs.next()){
			StockDayInfo info = new StockDayInfo();
			info.setCode(code);;
			info.setClose(rs.getDouble("close"));
			info.setDate(rs.getString("date"));
			info.setHigh(rs.getDouble("high"));
			info.setLow(rs.getDouble("low"));
			info.setOpen(rs.getDouble("open"));
			info.setpChange(rs.getDouble("p_change"));
			list.add(info);
		}
		rs.close();
		con.close();
		String type="";
		int days=0;
		double pChange=0;
		for(int i=0;i<list.size();i++){
			StockDayInfo info = list.get(i);
			if(i==0){
				if(info.getpChange()>0){
				   type="lz";	
				}
				if(info.getpChange()<0){
					   type="ld";	
					}
			}else{
				if("lz".equalsIgnoreCase(type)&&info.getpChange()>0){
					days++;
					pChange+=info.getpChange();
				}
				else if("ld".equalsIgnoreCase(type)&&info.getpChange()<0){
					days++;
					pChange+=info.getpChange();
				}else{
					break;
				}
			}
		}
		if(days>0){
		System.out.println(code+"|"+type+"|"+days+"|"+pChange);
		}
	}
	
	public static void main(String[] argv){
		try {
//			List<StockDayInfo> l=queryStockDayInfoByCode("600783");
//			for(int i=0;i<l.size();i++)
//			System.out.println(l.get(i).getDate()+"|"+l.get(i).getClose()+"|"+l.get(i).getpChange()+"%");
			List<String> codes=queryAllCodes();
			for(int i=0;i<codes.size();i++){
				calStock(codes.get(i));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
