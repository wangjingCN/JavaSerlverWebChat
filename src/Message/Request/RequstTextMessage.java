package Message.Request;

/**
 * 文本消息(用户->公共帐号 )
 * @author wangjing
 * @date 2014-06-25
 */
public class RequstTextMessage extends BaseRequestMessage {
  
	//消息内容 
	private String Content;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}
	
	
}
