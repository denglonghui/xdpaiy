package xdpaiy.webo;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.X509TrustManager;
public class WeboManager {
	private static final String redirectUri = "http://xdpaiy.applinzi.com/index.jsp";
	private static final String clientId="2917191912";
	public  static String getWeboLoginURL(){
		return "https://api.weibo.com/oauth2/authorize?client_id="+clientId+"&response_type=code&redirect_uri="+redirectUri+"&forcelogin=true";
	}
}
