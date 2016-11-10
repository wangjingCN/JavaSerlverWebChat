package Message.Response;

/**
 * 视频消息（公共平台->用户）
 * @author Administrator
 *@date 2014-07-09
 */
public class ResponseVedioMessage extends BaseResponseMessage {
  
	private Vedio vedio;//公共平台回复消息的内容
	
	public Vedio getVedio() {
		return vedio;
	}

	public void setVedio(Vedio vedio) {
		this.vedio = vedio;
	}


	
	
	
}
