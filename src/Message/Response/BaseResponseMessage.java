package Message.Response;

/**
 * 消息响应的基类(公共平台—>用户)
 * @author wangjing
 *@date 2014-07-09
 */
public class BaseResponseMessage {

	private String ToUserName;//接收方帐号（普通用户）
	
	private String FromUserName;//公共平台帐号
	
	private Long CreateTime;//消息创建时间（整型）
	
	private String MsgType;//消息类型（text/music/news）

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

	public Long getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(Long createTime) {
		CreateTime = createTime;
	}

	public String getMsgType() {
		return MsgType;
	}

	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	
	
	
}
