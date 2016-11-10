package Message.Response;

import java.util.List;

/**
 * 语音消息（公共平台->用户）
 * 
 * @author wangjing
 * @date 2014-07-09
 */
public class ResponseNewsMessage extends BaseResponseMessage {
	private int ArticleCount;// 图文消息个数，10个以内
	private List<Article> Article;

	public int getArticleCount() {
		return ArticleCount;
	}

	public List<Article> getArticle() {
		return Article;
	}

	public void setArticleCount(int articleCount) {
		ArticleCount = articleCount;
	}

	public void setArticle(List<Article> article) {
		Article = article;
	}

}
