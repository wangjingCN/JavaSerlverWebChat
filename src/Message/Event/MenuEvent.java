package Message.Event;

/**
 * 自定义菜单事件
 * @author wangjing
 *@date 2014-07-09
 */
public class MenuEvent extends BaseEvent {

	private String EventKey;//事件key值，与自定义菜单接口中key值对应

	public String getEventKey() {
		return EventKey;
	}

	public void setEventKey(String eventKey) {
		EventKey = eventKey;
	}
	
	
	
	
	
}
