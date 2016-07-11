package xdpaiy.jfinal;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;
public class HelloController extends Controller {

	@ActionKey("hello")
	public void hello() { 
		  renderText("Hello JFinal World.");
//		render("index.html");
		} 
}
