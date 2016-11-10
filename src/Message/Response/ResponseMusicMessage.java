package Message.Response;

/**
 * 图文消息（公共平台->用户）
 * 
 * @author wangjing
 * @date 2016/8/18
 */
public class ResponseMusicMessage extends BaseResponseMessage {

	private Music music;

	public Music getMusic() {
		return music;
	}

	public void setMusic(Music music) {
		this.music = music;
	}

}
