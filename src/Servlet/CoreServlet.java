package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.CoreService;
import Util.SignUtil;

/**
 * 微信接口请求处理的核心类
 * 
 * @author wangjing
 * 
 */
public class CoreServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9109463924541266127L;

	/**
	 * 请求校检
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 通过微信接口传送的签名 ,时间戳，随机数，和随机字符串
		String signature = request.getParameter("signature");
		String timestamp = request.getParameter("timestamp");
		String nonce = request.getParameter("nonce");
		String echostr = request.getParameter("echostr");
		PrintWriter out = response.getWriter();

		if (SignUtil.checkSignature(signature, timestamp, nonce)) {
			out.print(echostr);

		}
		out.close();
		out = null;

	}

	/**
	 * 处理微信服务器发来的信息
	 */
	public void doPost(HttpServletRequest reqest, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO 消息的接受，处理和响应
		reqest.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		String signature = reqest.getParameter("signature");
		String timestamp = reqest.getParameter("timestamp");
		String nonce = reqest.getParameter("nonce");
		PrintWriter out = response.getWriter();

		if (SignUtil.checkSignature(signature, timestamp, nonce)) {
			String respXml=CoreService.processRequest(reqest);
			out.print(respXml);

		}
		out.close();
		out=null;
	}

}
