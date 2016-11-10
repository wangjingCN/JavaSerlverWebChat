package Message.Response;

/**
 * 图片消息（公共平台->用户）
 * @author Administrator
 * @date 2014-07-09
 */
public class ResponseImageMessage extends BaseResponseMessage {

	private Image Image; //公平平台回复的图片

	public Image getImage() {
		return Image;
	}

	public void setImage(Image image) {
		Image = image;
	}
	
}
