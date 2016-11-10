package Message.Request;
/**
 * 语音消息（用户->公共平台）
 * @author wangjing
 *
 */
public class RequestVoiceMessage extends BaseRequestMessage{
	//媒体ID
	private String MediaID;
	//语音格式
	private String Format;
	//语音识别结果，UTF-8编码
	private String Recongnition;
	
	public String getMediaID() {
		return MediaID;
	}
	public void setMediaID(String mediaID) {
		MediaID = mediaID;
	}
	public String getFormat() {
		return Format;
	}
	public void setFormat(String format) {
		Format = format;
	}
	public String getRecongnition() {
		return Recongnition;
	}
	public void setRecongnition(String recongnition) {
		Recongnition = recongnition;
	}
	
	
}
