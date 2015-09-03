package cn.com.bsfit.frms.portal.base.test;

public class RedisTest {
	
	public static void main(String[] args) {
		String userName = RedisClient.getClient().get("123");
		System.out.println(userName);
	}
}