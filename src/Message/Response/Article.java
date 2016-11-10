package Message.Response;
/**
 * 图文model
 * @author jing
 * @date 2016/8/18
 */
public class Article {
	private String Title;
	private String Description;
	private String PicUrl;//图片链接，支持JPG，PNG，较好的图为640*320
	private String Url;// 图文消息跳转链接
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getPicUrl() {
		return PicUrl;
	}
	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
}