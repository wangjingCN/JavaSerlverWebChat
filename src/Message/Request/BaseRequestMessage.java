package Message.Request;

/**
 * 请求消息的基类(用户->公共帐号 )
 * @author wangjing
 *
 */
public class BaseRequestMessage {
  
	//开发者的公共帐号 
	private String ToUserName;
	
	//用户的帐号 （OpenID）
	private String FromUserName;
	
	//用户发送消息的时间
	private long CreateTime;
	
	//用户的消息类型：text/image/location(用户的地理位置 )/link/voice
    private String MsgType;
	
	//用户发送消息的ID，64的整型
    private long MsgId;
    
    public String getToUserName() {
		return ToUserName;
	}

	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}

	public String getFromUserName() {
		return FromUserName;
	}

	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}

	public long getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(long createTime) {
		CreateTime = createTime;
	}

	public String getMsgType() {
		return MsgType;
	}

	public void setMsgType(String msgType) {
		MsgType = msgType;
	}

	public long getMsgId() {
		return MsgId;
	}

	public void setMsgId(long msgId) {
		MsgId = msgId;
	}
    
}
