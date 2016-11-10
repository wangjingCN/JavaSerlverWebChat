package Message.Menu;

/**
 * click类型的button
 * 
 * @see ViewButton的toString方法
 * @author jing
 * 
 */
public class ClickButton extends Button {
	private String type = "click";
	private String key;

	public String getType() {
		return type;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "ClickButton [type=" + type + ", key=" + key + ", name=" + getName() + "]";
	}
}