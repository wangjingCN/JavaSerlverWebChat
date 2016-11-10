package Message.Response;

/**
 * 音乐消息（公共平台->用户）
 * 
 * @author wangjing
 * @date 2014-07-09
 */
public class ResponseVoiceMessage extends BaseResponseMessage {

	private Voice Voice;// 语音消息

	public Voice getVoice() {
		return Voice;
	}

	public void setVoice(Voice voice) {
		Voice = voice;
	}

}
