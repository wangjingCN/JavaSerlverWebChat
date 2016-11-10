package Util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 *请求校检工具类
 * @author wangjing
 * @date  2014-6-23
 */
public class SignUtil {

	//�与开发模式中接口配置信息中的teoken保存一致
	private static String token="weixinCourse";
	
	/**
	 * 签名校检
	 * @param signature  微信加密签名
	 * @param timestamp 时间戳
	 * @param nonce 随机数
	 * @return
	 */
	public static boolean checkSignature(String signature,String timestamp,String nonce)
	{
		//对signatrue,timestamp,nonce按字典排序
	     String[] pramArr=new String[]{token,timestamp,nonce };
	     Arrays.sort(pramArr);
	     
	     //排序的结果组合成新的字符串
	     String content=pramArr[0].concat(pramArr[1]).concat(pramArr[2]);
         
	     
	    String ciphertext=null;
	     
			try {
				MessageDigest md = MessageDigest.getInstance("SHA-1");
				//进行sha1加密
				byte[] digest = md.digest(content.toString().getBytes());
				ciphertext = byteArrayToStr(digest);
			} catch (NoSuchAlgorithmException e) {
			   e.printStackTrace();
			}
			// 将加密后的字符串与signature进行比较
		return ciphertext!=null?ciphertext.equals(signature.toUpperCase()):false;
	}
	
	
	/**
	 * 将字节数组转化成十六进制的字符串 
	 * @param byteArray
	 * @return String
	 */
	public static String byteArrayToStr(byte[] byteArray)
	{
		String strDigest="";
		for(int i=0;i<byteArray.length;i++)
		{
			strDigest += byteToStr(byteArray[i]);
		}
		return strDigest;
		
	}
	
	/**
	 * 将字节转化成十六进制的字符串
	 * @param 字节数组中的字节 
	 */
	
	public static String byteToStr(byte b)
	{
		char[] Digit={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char[] tempArr=new char[2];
		tempArr[0]=Digit[(b>>>4)&0X0F];
		tempArr[1]=Digit[b&0X0F];
		return new String(tempArr);
	}
	
	
}
