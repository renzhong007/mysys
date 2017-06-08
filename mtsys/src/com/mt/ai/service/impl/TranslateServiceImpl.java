package com.mt.ai.service.impl;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mt.ai.bean.TranslateObj;
import com.mt.ai.service.TranslateService;
import com.mt.ai.util.HttpRequest;

@Service
public class TranslateServiceImpl implements TranslateService {

	private String URL = "http://183.175.14.126:80/trans_result.php";
	private String URL2 = "http://183.175.14.126:80/trans_result2.php";
	private String param = "input1=";

	@Override
	public String monZhTranslate(TranslateObj translateObj) {
		String result = "";
		if ("zh".equals(translateObj.getFrom())) {
			result = HttpRequest.sendPost(URL2,param+translateObj.getText());;
		}
		if ("mon".equals(translateObj.getFrom())) {
			result = HttpRequest.sendPost(URL,param+translateObj.getText());// "蒙文翻译成中文";
		}
		return result;
	}

}
