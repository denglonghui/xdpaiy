package xdpaiy.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.python.util.PythonInterpreter;

public class Test {

	public static void main(String[] args) {
		  Runtime rt = Runtime.getRuntime(); 
		    try {        
		      String file = "E:/stock/ini.bat"; 
		      rt.exec("cmd.exe /c start " + file); 
		    } catch (IOException e) { 
		      // TODO Auto-generated catch block 
		      e.printStackTrace(); 
		    } 
	}

}
