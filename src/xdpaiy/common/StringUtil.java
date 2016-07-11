package xdpaiy.common;

public class StringUtil {
	public static boolean isDigit(char c){
	    if(c!='0'&&c!='1'&&c!='2'&&c!='3'&&c!='4'&&c!='5'&&c!='6'&&c!='7'&&c!='8'&&c!='9'){
	    	return false;
	    }else{
	    	return true;
	    }
	}
	public static boolean isAllDigit(String code){
		for(int i=0;i<code.length();i++){
			if(!isDigit(code.charAt(i))){
				return false;
			}
		}
		return true;
	}

}
