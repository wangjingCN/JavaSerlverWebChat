package Message.Menu;

/**
 * view型的button
 * 
 * @author jing
 * 
 */
public class ViewButton extends Button {
	private String type = "view";
	private String url;

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "ViewButton [type=" + type + ", url=" + url + ", name=" + getName() + "]";
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public static void main(String[] args) {
		ViewButton viewButton=new ViewButton();
		viewButton.setName("view");
		viewButton.setUrl("www.baodu.com");
		System.out.println(viewButton);
	}
}
