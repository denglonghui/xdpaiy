package xdpaiy.jfinal;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

public class IndexController extends Controller {
	
	@ActionKey("/index")
	public void index() { 
	  render("index.html"); 
//		render
	} 
	
	@ActionKey("/hello")
	public void hello() { 
		 renderText("Hello JFinal World.");
//		render
	} 
	
	@ActionKey("/admin/add")
	public void add() { 
		 renderText("add");
//		render
	} 
	
	
}
