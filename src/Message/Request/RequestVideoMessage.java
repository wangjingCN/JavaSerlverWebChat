package Message.Request;
/**
 * 视频消息（用户->公共平台 ）
 * @author 王静
 *
 */
public class RequestVideoMessage extends BaseRequestMessage {
	//视频消息媒体ID
	private String MediaId;
	//视频消息缩略图的媒体ID
	private String ThumbMediaId;
	
	public String getMediaId() {
		return MediaId;
	}
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	public String getThumbMediaId() {
		return ThumbMediaId;
	}
	public void setThumbMediaId(String thumbMediaId) {
		ThumbMediaId = thumbMediaId;
	}
	
}
