package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 授权后的回调请求,这个被配置到jsp页面了
 * 
 * @author jing
 * @date 2016-11-16
 */
public class OAuthServlet extends HttpServlet {

	private static final long serialVersionUID = -2660289312850253497L;

	/**
	 * 客户端发送get请求时，进入此方法
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		//同意授权后，可以收到code
		String code = req.getParameter("code");
		if(!"authdeny".equals(code)){
			
		}
	}

}
