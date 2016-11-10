package Message.Response;

/**
 * 文本消息（公共平台->用户）
 * @author Administrator
 *@date 2014-07-09
 */
public class ResponseTextMessage extends BaseResponseMessage {
  
	private String Content;//公共平台回复消息的内容

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}
	
	
	
}
