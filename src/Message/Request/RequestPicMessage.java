package Message.Request;

/**
 * 图片信息（用户->公共账号）
 * @author wangjing
 *
 */
public class RequestPicMessage extends BaseRequestMessage {

	//用户发送的图片链接 
	private String PicUrl;

	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}
	
	
}
