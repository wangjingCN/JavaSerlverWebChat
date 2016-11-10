package Message.Response;

/**
 * 音乐model（公共平台->用户）
 * 
 * @author jing
 * @date 2016/8/18
 */
public class Music{
	private String Title;
	private String Description;
	private String MusicUrl;
	private String HQMusicUrl;// wifi环境下优先使用该链接播放音乐
	private String ThumbMediaId;// 缩略图ID，上传多媒体文件时得到的
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
	public String getMusicUrl() {
		return MusicUrl;
	}
	public void setMusicUrl(String musicUrl) {
		MusicUrl = musicUrl;
	}
	public String getHQMusicUrl() {
		return HQMusicUrl;
	}
	public void setHQMusicUrl(String hQMusicUrl) {
		HQMusicUrl = hQMusicUrl;
	}
	public String getThumbMediaId() {
		return ThumbMediaId;
	}
	public void setThumbMediaId(String thumbMediaId) {
		ThumbMediaId = thumbMediaId;
	}

}
