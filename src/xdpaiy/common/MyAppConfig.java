package xdpaiy.common;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.ext.handler.ContextPathHandler;
import com.jfinal.render.ViewType;

import xdpaiy.jfinal.HelloController;
import xdpaiy.jfinal.IndexController;
import xdpaiy.jfinal.TestRoutes;

public class MyAppConfig extends JFinalConfig {

	@Override
	public void configConstant(Constants me) {
		me.setDevMode(true);

		me.setEncoding("utf-8");

//		me.setViewType(ViewType.JSP);

	}

	@Override
	public void configRoute(Routes me) {
		me.add(new TestRoutes());
	
	}

	@Override
	public void configPlugin(Plugins me) {
		// TODO Auto-generated method stub

	}

	@Override
	public void configInterceptor(Interceptors me) {
		// TODO Auto-generated method stub

	}

	@Override
	public void configHandler(Handlers me) {
		// TODO Auto-generated method stub

	}

}
