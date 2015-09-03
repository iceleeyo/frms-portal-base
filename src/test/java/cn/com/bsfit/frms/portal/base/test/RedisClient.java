package cn.com.bsfit.frms.portal.base.test;

import redis.clients.jedis.Jedis;

public class RedisClient {
	
	// redis 主机
	private static final String REDIS_HOST = "devhost2";
	// redis 端口号
	private static final Integer REDIS_PORT = 6379;
	public static Jedis jedis = null;

	public static Jedis getClient() {
		if (jedis == null) {
			jedis = new Jedis(REDIS_HOST, REDIS_PORT);
		}
		return jedis;
	}
}