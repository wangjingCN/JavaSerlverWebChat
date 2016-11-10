package Message.Event;

/**
 * 扫描带参数的二维码事件
 * @author wangjing
 * @date 2014-07-09
 *
 */
public class QRCodeEvent extends BaseEvent {

	private String EventKey;//扫描时间的key值
	
	private String Ticket;//用于获取二维码图片 

	public String getEventKey() {
		return EventKey;
	}

	public void setEventKey(String eventKey) {
		EventKey = eventKey;
	}

	public String getTicket() {
		return Ticket;
	}

	public void setTicket(String ticket) {
		Ticket = ticket;
	}
	
	
}
