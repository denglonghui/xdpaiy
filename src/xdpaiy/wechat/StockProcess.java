package xdpaiy.wechat;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import xdpaiy.common.StringUtil;

public class StockProcess {
	
	public String queryStockInfo(String code){
		String result="";
		String tcode="";
		if(code.startsWith("6")){
			tcode="sh"+code;
		}else{
			tcode="sz"+code;
		}
		String param="http://hq.sinajs.cn/list="+tcode;
		HttpGet request = new HttpGet(param);
		
		try {
			HttpResponse response = HttpClients.createDefault().execute(request);
			if(response.getStatusLine().getStatusCode()==200){
				String tmp="";
				tmp = EntityUtils.toString(response.getEntity());
				if(tmp.length()>40){
					tmp=tmp.substring(21, tmp.length());
					System.out.println(tmp);
					String[] strs= tmp.split("\\,");
					result=strs[0]+code+",现价:"+strs[3]+"元,时间 :"+strs[strs.length-2];
				}else{
					result=tmp;
				}
				
			}else{
				result="股价查询失败！";
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
		
	}
	public static boolean isStockCode(String code){
		
		if(code.length()!=6||(!code.startsWith("6")&&!code.startsWith("3")&&!code.startsWith("0")&&!code.startsWith("7")&&!code.startsWith("8"))){
			return false;
		}
		if(!StringUtil.isAllDigit(code)){
			return false;
		}
		
		return true;
	}
	public static void main(String[] argv){
		String code="600783";
		System.out.println(StockProcess.isStockCode(code));
		System.out.println(new StockProcess().queryStockInfo(code));
	}

}
