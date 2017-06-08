package com.mt.ai.handler;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mt.ai.bean.TranslateObj;
import com.mt.ai.service.TranslateService;
import com.mt.ai.util.HttpRequest;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/sys")
public class TranslateHandler {
	@Autowired
	private TranslateService translateService;

	@RequestMapping(value = "/trans", method = RequestMethod.POST)
	public @ResponseBody String login(HttpServletRequest req, HttpServletResponse resp) {
		TranslateObj translateObj = new TranslateObj();
		translateObj.setText(req.getParameter("text"));
		translateObj.setFrom(req.getParameter("from"));
		translateObj.setTo(req.getParameter("to"));
		String mon = translateService.monZhTranslate(translateObj);
		String respResult = null;
		String resStatus = "ok";
		JSONObject respMap = new JSONObject();
		respMap.put("status", resStatus);
		JSONObject resultMap = new JSONObject();
		resultMap.put("mon", mon);
		respMap.put("data", resultMap);
		respResult = respMap.toString();
		System.out.println(respResult);
		resp.setContentType("text/html;charset=UTF-8");
		try {
			resp.getWriter().print(respResult);
			resp.getWriter().flush();
			resp.getWriter().close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
