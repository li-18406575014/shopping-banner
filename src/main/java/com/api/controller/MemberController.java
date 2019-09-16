package com.api.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.entity.Jieshao;
import com.api.service.JieShaoService;

@RestController
@RequestMapping("MemberController")
public class MemberController {

	@Autowired
	private JieShaoService JieShaoService;

	@RequestMapping("selectBanner")
	public List<Jieshao> selectBanner(HttpServletRequest resquest, HttpServletResponse response) {
		// 查询数据库中的banner
		System.out.println("aa");
		// 允许所有的域都可以跨域访问
		response.addHeader("Access-Control-Allow-Origin", "*");
		// 允许跨域GET和POST请求
		response.addHeader("Access-Control-Allow-Method", "*");
		// 需要添加普通跨域请求的两行代码，然后再添加下面的代码。
		// 解决JSON格式的ajax请求，先是 Options请求，这是预检命令，如果预检命令检查通过之后才进行真正的请求。
		response.addHeader("Access-Control-Allow-Headers", "Content-Type");
		// 缓存预检命令，在规定的时间内不需要重复的进行预检操作。
		response.addHeader("Access-Control-Max-Age", "3600");// 单位为秒。
		List<Jieshao> list = JieShaoService.selectBanner();
		return list;
	}
}
