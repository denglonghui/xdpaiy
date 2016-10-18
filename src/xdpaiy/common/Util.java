package xdpaiy.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
	public static int getTodayInt(){
		Date date=new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String d = sdf.format(date);
		return Integer.parseInt(d);
	}

}
