package cn.com.bsfit.frms.portal.base.util;

import org.apache.commons.codec.binary.Base64;

public class Digest {

	/**
	 * BASE64加密
	 * 
	 * @param plainText
	 * @return
	 * @throws Exception
	 */
	public static String encryptBASE64(String plainText) {
		byte[] b = plainText.getBytes();
		Base64 base64 = new Base64();
		b = base64.encode(b);
		String s = new String(b);
		return s;
	}

	/**
	 * BASE64解密
	 * 
	 * @param encodeStr
	 * @return
	 */
	public static String decryptBASE64(String encodeStr) {
		byte[] b = encodeStr.getBytes();
		Base64 base64 = new Base64();
		b = base64.decode(b);
		String s = new String(b);
		return s;
	}
}
