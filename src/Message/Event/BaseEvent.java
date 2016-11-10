package Message.Event;

/**
 * 用户对公共帐号所做的操作
 * 
 * @author 王静
 * 
 */
public class BaseEvent {
	
	private String ToUserName;// 公共微信号
	
	private String FromUserName;// 用户帐号的Openid
	
	private long CreateTime;// 消息的创建时间，整型
	
	private String MsgType;// 消息类型
	
	private String Event;// 事件类型

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

	public String getEvent() {
		return Event;
	}

	public void setEvent(String event) {
		Event = event;
	}

}
