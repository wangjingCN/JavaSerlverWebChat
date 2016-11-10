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
}
