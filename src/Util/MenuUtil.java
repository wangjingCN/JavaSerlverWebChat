package Util;

import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Message.Menu.Menu;

/**
 * 菜单的创建,查询和删除
 * @author jing
 *
 */
public class MenuUtil {
	private static Logger log = LoggerFactory.getLogger(MenuUtil.class);

	public static boolean createMenu(Menu menu, String accessToken) {
		boolean result = false;
		String url = WeiXinParamUtil.MENU_CREATE_URL.replace("ACCESS_TOKEN", accessToken);
		String jsonMenu = JSONObject.fromObject(menu).toString();
		JSONObject jsonObject = TokenCommonUtil.httpsRequest(url, "POST", jsonMenu);

		if (null != jsonObject) {
			int errorCode = jsonObject.getInt("errcode");
			String errorMsg = jsonObject.getString("errmsg");
			if (0 == errorCode) {
				result = true;
			} else {
				result = false;
				log.error("创建菜单失败 errcode:{} errmsg:{}", errorCode, errorMsg);
			}
		}

		return result;
	}

	public static String getMenu(String accessToken) {
		String result = null;
		String requestUrl = WeiXinParamUtil.MENU_GET_URL.replace("ACCESS_TOKEN", accessToken);
		JSONObject jsonObject = TokenCommonUtil.httpsRequest(requestUrl, "GET", null);

		if (null != jsonObject) {
			result = jsonObject.toString();
		}
		return result;
	}

	public static boolean deleteMenu(String accessToken) {
		boolean result = false;
		String requestUrl = WeiXinParamUtil.MENU_DELETE_URL.replace("ACCESS_TOKEN", accessToken);
		JSONObject jsonObject = TokenCommonUtil.httpsRequest(requestUrl, "GET", null);

		if (null != jsonObject) {
			int errorCode = jsonObject.getInt("errcode");
			String errorMsg = jsonObject.getString("errmsg");
			if (0 == errorCode) {
				result = true;
			} else {
				result = false;
				log.error("删除菜单失败 errcode:{} errmsg:{}", errorCode, errorMsg);
			}
		}
		return result;
	}
}