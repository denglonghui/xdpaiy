package xdpaiy.jfinal;

import com.jfinal.config.Routes;

public class TestRoutes extends Routes {

	@Override
	public void config() {
		// TODO Auto-generated method stub
		//这里指定目录或者功能比如 /   /user/  /admin/front/等
		add("/", IndexController.class);
		add("/admin", AdminController.class);
		
	
	}

}
