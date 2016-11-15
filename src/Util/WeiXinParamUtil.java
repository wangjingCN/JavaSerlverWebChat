package Util;

/**
 * 公众平台的唯一凭证和密码
 * 
 * @author jing
 * @data 2016/8/19
 * 
 */
public class WeiXinParamUtil {
	// 唯一凭证
	public static String APPID = "wxd595c8aca928fe1d";
	// 密码
	public static String APPSECRET = "be4b79cd2bd94e826e4abf3a54131016";

	// 获取接口凭证的API,GET
	public static String TOKEN_URL = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=" + APPID + "&secret=" + APPSECRET;

	// 菜单创建（POST）
	public final static String MENU_CREATE_URL = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";
	// 菜单查询（GET）
	public final static String MENU_GET_URL = "https://api.weixin.qq.com/cgi-bin/menu/get?access_token=ACCESS_TOKEN";
	// 菜单删除（GET）
	public final static String MENU_DELETE_URL = "https://api.weixin.qq.com/cgi-bin/menu/delete?access_token=ACCESS_TOKEN";
	
	// 客服接口的发送(POST)
	public final static String CUSTOM_MESSAGE_URL = "https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=ACCESS_TOKEN";
	// 用户授权（GET）
	public final static String USER_AUTH_ACEESS_WEB_URL = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=APPID&redirect_uri=REDIRECT_URI&response_type=code&scope=SCOPE&state=STATE#wechat_redirect";
	// 获取网页授权凭证（GET）
	public final static String OATH_ACCESS_TOKEN = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code";
	// 刷新网页授权凭证
	public final static String REFRSEH_OATH_ACCESS_TOKEN = "https://api.weixin.qq.com/sns/oauth2/refresh_token?appid=APPID&grant_type=refresh_token&refresh_token=REFRESH_TOKEN";
	// 通过网页授权获取用户信息
	public final static  String SNSUSERINFO_ACCESS_TOKEN = "https://api.weixin.qq.com/sns/userinfo?access_token=ACCESS_TOKEN&openid=OPENID";
	

	
}
