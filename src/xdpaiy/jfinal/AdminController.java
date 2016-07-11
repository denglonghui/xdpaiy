package xdpaiy.jfinal;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

public class AdminController extends Controller {
	@ActionKey("/admin/query")
	public void query() { 
		 renderText("query");
//		render
	} 
}
