package Message.Response;

/***
 * 视频model（公共平台->用户）
 * 
 * @author jing
 * @date 2016/8/18
 */
public class Vedio {

	private String MediaId;// 媒体文件ID
	private String ThumbMediaId;// 缩略图ID

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
