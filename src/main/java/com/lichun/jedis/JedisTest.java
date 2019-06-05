package com.lichun.jedis;

import redis.clients.jedis.Jedis;

public class JedisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost", 6379);
        jedis.auth("123456");
        jedis.set("name", "ABC");
        String name = jedis.get("name");
        System.out.println(name);
        jedis.close();
    }
}