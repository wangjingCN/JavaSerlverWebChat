package test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Message.HttpEntity.Token;
import Message.Menu.Button;
import Message.Menu.ClickButton;
import Message.Menu.ComplexButton;
import Message.Menu.Menu;
import Message.Menu.ViewButton;
import Util.MenuUtil;
import Util.TokenCommonUtil;
import Util.WeiXinParamUtil;

/**
 * 菜单创建的测试
 * 
 * @author jing
 * @date 2016-8-22
 */
public class CreateMenuTest {
	private static Logger logger = LoggerFactory.getLogger(CreateMenuTest.class);

	public static void main(String[] args) {
		// //////////拼装菜单
		ClickButton button1 = new ClickButton();
		button1.setName("今日特惠");
		button1.setKey("cb1");

		ViewButton button2 = new ViewButton();
		button2.setName("公司官网");
		button2.setUrl("www.baidu.com");

		ClickButton button31 = new ClickButton();
		button31.setName("给我们点赞");
		button31.setKey("cb31");

		ViewButton button32 = new ViewButton();
		button32.setName("我要点餐");
		button32.setUrl("www.baidu.com");

		ComplexButton button3 = new ComplexButton();
		button3.setName("特色菜谱");
		button3.setSub_button(new Button[] { button31, button32 });

		Menu menu = new Menu();
		menu.setButton(new Button[] { button1, button2, button3 });
		// ///////拼装菜单结束

		Token token = TokenCommonUtil.getToken(WeiXinParamUtil.APPID, WeiXinParamUtil.APPSECRET);
		if (token != null) {
			if (MenuUtil.createMenu(menu, token.getAccessToken())) {
				logger.info("菜单创建成功");
			}
		}
	}
}
