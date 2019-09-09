package com.zhangguangzhao.test;




import org.junit.Test;

import com.zhangguangzhao.utils.StringUtils;



public class TestDemo {

	@Test
	public void TestPhone() {
		boolean phone = StringUtils.isPhone("15138605495");
		System.out.println(phone);
	}
	
	@Test
	public void TestEmail() {
		boolean email = StringUtils.isEmail("2431208534@qq.com");
		System.out.println(email);
	}
	
	@Test
	public void TestHtml() {
		String html = StringUtils.toHtml("fanjbaobaobal");
		System.out.println(html);
	}
	
	
}
