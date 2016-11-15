package test;

import Util.AdvancedUtil;
import Util.TokenCommonUtil;
import Util.WeiXinParamUtil;

public class SendCustomMessage {
	public static void main(String[] args) {
		String accessToken=TokenCommonUtil.getToken(WeiXinParamUtil.APPID, WeiXinParamUtil.APPSECRET).getAccessToken();
		String openid="fasfdsafasfdsafoijfdsafdsa";
		String content="客户文本信息测试";
		boolean result=AdvancedUtil.sendCustomMessage(accessToken, AdvancedUtil.makeTextCustomMessage(openid, content));
		if (result);
			System.out.println("信息发送成功");
	}
}
 