package com.mt.ai.test;

import com.mt.ai.bean.TranslateObj;
import com.mt.ai.util.HttpRequest;

public class Test {

	@org.junit.Test
	public void test() {
		//发送 POST 请求
		TranslateObj translateObj = new TranslateObj();
		translateObj.setText("ᠠᠭᠲᠠ ᠤᠨᠠᠪᠠᠴᠤ ᠠᠭᠠᠷᠴᠠᠭ ᠲᠤ ᠨᠠᠭᠠᠯᠳᠤᠳᠠᠭ ᠦᠭᠡᠢ ᠂ ᠠᠮᠲᠠᠲᠤ ᠶᠢ ᠢᠳᠡᠪᠡᠴᠦ ᠠᠷᠠᠭᠠᠨ ᠳᠤ ᠨᠢᠯᠵᠠᠳᠠᠳᠠᠭ ᠦᠭᠡᠢ .");
		translateObj.setFrom("zh");
		translateObj.setTo("m");
        String sr=HttpRequest.sendPost("http://183.175.14.126:80/trans_result2.php", "input1="+translateObj.getText());
        System.out.println(sr);

	}

}
