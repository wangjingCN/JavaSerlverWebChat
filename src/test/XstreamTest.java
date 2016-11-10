package test;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import Message.Response.Article;
import Message.Response.Music;
import Message.Response.ResponseNewsMessage;

public class XstreamTest {
	public static String javaObject2Xml(Object o) {
		XStream xs = new XStream(new DomDriver());
		xs.alias(o.getClass().getSimpleName(), o.getClass());
		return xs.toXML(o);
	}
	public static String newsMessage2Xml(ResponseNewsMessage o) {
		XStream xs = new XStream(new DomDriver());
		xs.alias("xml", o.getClass());
		xs.alias("items", new Article().getClass());
		return xs.toXML(o);
	}
	public static void main(String[] args) {
		Music music=new Music();
		music.setDescription("a");
		music.setHQMusicUrl("www.baidu.com");
//		System.out.println(javaObject2Xml(music));
		
		ResponseNewsMessage responseNewsMessage=new ResponseNewsMessage();
		responseNewsMessage.setArticleCount(8);
		Article article=new Article();
		article.setDescription("ok");
		Article article2=new Article();
		article2.setDescription("ok2");
		List<Article> articleList=new ArrayList<Article>();
		articleList.add(article);
		articleList.add(article2);
		responseNewsMessage.setArticle(articleList);
//		System.out.println(javaObject2Xml(article));
		System.out.println(newsMessage2Xml(responseNewsMessage));
	}
}
