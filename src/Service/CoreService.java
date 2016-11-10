package Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.dom4j.DocumentException;

import Message.Response.Article;
import Message.Response.ResponseNewsMessage;
import Message.Response.ResponseTextMessage;
import Util.MessageUtil;

/**
 * 核心服务类
 * 
 * @author jing
 * 
 */
public class CoreService {
	public static String processRequest(HttpServletRequest httpServletRequest) {
		String respXml = null;
		String respContent = null;// 回复的文本
		try {
			Map<String, String> requestMap = MessageUtil.parseXml(httpServletRequest);
			// 发送方帐号
			String fromUserName = requestMap.get("FromUser");
			// 开发者微信号
			String toUserName = requestMap.get("ToUserName");
			// 消息类型
			String msgType = requestMap.get("MsgType");

			// 默认回复文本消息
			ResponseTextMessage textMessage = new ResponseTextMessage();
			textMessage.setToUserName(fromUserName);
			textMessage.setFromUserName(toUserName);
			textMessage.setCreateTime(new Date().getTime());
			textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);

			if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)) {
				respContent = "您发送的是文本消息,爱小球爱生活！";
				textMessage.setContent(respContent);
				respXml = MessageUtil.javaObject2Xml(textMessage);
			}
			// 图片消息
			if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_IMAGE)) {
				respContent = "您发送的是图片消息,爱小球爱生活！";
				textMessage.setContent(respContent);
				respXml = MessageUtil.javaObject2Xml(textMessage);
			}
			// 语音消息
			if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_VOICE)) {
				String mediaId = requestMap.get("MediaId");
				String format = requestMap.get("Format");
				String recognition = requestMap.get("Recognition");
				
				respContent = "您发送的是语音消息,爱小球爱生活！";
				textMessage.setContent(respContent);
				respXml = MessageUtil.javaObject2Xml(textMessage);
			}
			// 视频消息
			if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_VIDEO)) {
				respContent = "您发送的是视频消息,爱小球爱生活！";
				textMessage.setContent(respContent);
				respXml = MessageUtil.javaObject2Xml(textMessage);
			}
			// 地理位置消息
			if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LOCATION)) {
				respContent = "您发送的是地理位置消息,爱小球爱生活！";
				textMessage.setContent(respContent);
				respXml = MessageUtil.javaObject2Xml(textMessage);
			}
			// 链接消息
			if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LINK)) {
				respContent = "您发送的是链接消息,爱小球爱生活！";
				textMessage.setContent(respContent);
				respXml = MessageUtil.javaObject2Xml(textMessage);
			}
			// 事件推送
			if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_EVENT)) {
				// 事件类型
				String eventType = requestMap.get("Event");
				// 关注
				if (eventType.equals(MessageUtil.EVENT_TYPE_SUBSCRIBE)) {
					respContent = "谢谢您的关注！这是我们的公共号测试版本";
					textMessage.setContent(respContent);
					respXml = MessageUtil.javaObject2Xml(textMessage);
				}
				// 取消关注
				else if (eventType.equals(MessageUtil.EVENT_TYPE_UNSUBSCRIBE)) {
					// TODO 取消订阅后用户不会再收到公众账号发送的消息，因此不需要回复
				}
				// 扫描带参数二维码
				else if (eventType.equals(MessageUtil.EVENT_TYPE_SCAN)) {
					// TODO 处理扫描带参数二维码事件
				}
				// 上报地理位置
				else if (eventType.equals(MessageUtil.EVENT_TYPE_LOCATION)) {
					// TODO 处理上报地理位置事件
				}
				// 自定义菜单
				else if (eventType.equals(MessageUtil.EVENT_TYPE_CLICK)) {
					// 菜单事件的key值，与创建菜单的时候保持一致
					String eventKey = requestMap.get("EventKey");
					// 这里只的是ClickButton的Key值,因为View的url由微信内置的浏览器访问了
					if (eventKey.equals("cb1")) {
						Article article = new Article();
						article.setTitle("开源中国");
						article.setDescription("开源中国社区成立于2008年8月，是目前中国最大的开源技术社区。\n\n开源中国的目的是为中国的IT技术人员提供一个全面的、快捷更新的用来检索开源软件以及交流开源经验的平台。\n\n经过不断的改进,目前开源中国社区已经形成了由开源软件库、代码分享、资讯、讨论区和博客等几大频道内容。");
						article.setPicUrl("");
						article.setUrl("http://m.oschina.net");
						// 开始创建图文消息
						List<Article> articlesList = new ArrayList<Article>();
						articlesList.add(article);
						ResponseNewsMessage newsMessage = new ResponseNewsMessage();
						newsMessage.setArticle(articlesList);
						newsMessage.setArticleCount(articlesList.size());
						newsMessage.setCreateTime(new Date().getTime());
						newsMessage.setFromUserName(toUserName);
						newsMessage.setToUserName(fromUserName);
						newsMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_NEWS);
						respXml = MessageUtil.newsMessage2Xml(newsMessage);
					} else {
						// 如果点击的不是 "cb1"
						respContent = "小球，我要唱首歌：曾经真的以为人生就这样了。。。。。。\n\n";
						textMessage.setContent(respContent);
						respXml = MessageUtil.javaObject2Xml(textMessage);
					}

				}
			} else {
				// 用户发送的消息不在上面的时候，设置文本消息的内容
				respContent = "未知的消息类型";
				textMessage.setContent(respContent);
				respXml = MessageUtil.javaObject2Xml(textMessage);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return respXml;
	}

}
