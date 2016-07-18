package rml.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import constant.Global;
import rml.service.DoubanServiceI;
import rml.service.UserServiceI;

@Controller
@RequestMapping("/MainController")
public class MainController {
	private DoubanServiceI doubanServiceI;
	
	private UserServiceI userServiceI;
	

	public DoubanServiceI getDoubanServiceI() {
		return doubanServiceI;
	}

	@Resource
	public void setDoubanServiceI(DoubanServiceI doubanServiceI) {
		this.doubanServiceI = doubanServiceI;
	}
	
	public UserServiceI getUserServiceI() {
		return userServiceI;
	}
	
	@Resource
	public void seUserServiceI(UserServiceI userServiceI) {
		this.userServiceI = userServiceI;
	}
	
	@RequestMapping("/toMainPage")
	public String toMainPage(HttpServletRequest request, HttpSession session) {
		if(session.getAttribute(Global.USER_SESSION_KEY) == null || session.getAttribute(Global.USER_SESSION_KEY).equals("")) {
			session.setAttribute(Global.USER_SESSION_KEY, "游客");
		}
		List<String> list = new ArrayList<String>();
		list = doubanServiceI.getMoviewNames();
		request.setAttribute("movielist", list);
		return "welcome";
	}
	@RequestMapping("/toDoubanReviewPage")
	public String toDoubanReviewPage(HttpServletRequest request, HttpServletResponse response) {
		List<String> list = new ArrayList<String>();
		list = doubanServiceI.getMoviewNames();
		request.setAttribute("movielist", list);
		return "appinfo";
	}
	@RequestMapping("/login")
	public String login(HttpServletRequest request, HttpSession session) {
		org.apache.ibatis.logging.LogFactory.useLog4JLogging();
		String name = request.getParameter("name");
		String passwd = request.getParameter("passwd");
		
		boolean result = userServiceI.login(name, passwd);
		if (result) {
			session.setAttribute(Global.USER_SESSION_KEY, name);
			return "welcome";
		} else {
			return "login";
		}
	}
}
