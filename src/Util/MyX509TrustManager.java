package Util;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/**
 * 
 * @author jing
 *
 */
public class MyX509TrustManager implements X509TrustManager {

	//检查客户端的证书
	public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
	}

	//检查服务端的证书
	public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
	}

	//返回受信任的x509证书数组
	public X509Certificate[] getAcceptedIssuers() {
		return null;
	}
}
