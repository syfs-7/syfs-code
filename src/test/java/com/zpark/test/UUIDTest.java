package com.zpark.test;

import java.util.UUID;

/*
  * 随机码测试
 */
public class UUIDTest {
	
	public static void main(String[] args) {
		
		String str = UUID.randomUUID().toString().replaceAll("-", "");
		System.out.println(str);
	}

}
