package rml.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import rml.model.DoubanReview;
import rml.service.DoubanServiceI;

@Controller
@RequestMapping("/DoubanReviewController")
public class DoubanReviewController {

	private DoubanServiceI doubanService;

	public DoubanServiceI getDoubanService() {
		return doubanService;
	}

	@Autowired
	public void setDoubanService(DoubanServiceI doubanService) {
		this.doubanService = doubanService;
	}
	
	
	@RequestMapping(value="/ajax_project_page_num")
	public @ResponseBody int ajax_project_page_num(String _app_s) {
		HashMap<String,Object> map = new HashMap<String, Object>();
		map.put("app_name", _app_s);
		return doubanService.ajax_project_page_num(map); 
	}
	
	@RequestMapping(value="/ajax_project_filter")
	public @ResponseBody List<DoubanReview> ajax_project_filter(int _page,String _app_s) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("offset", (_page-1)*50);
		map.put("app_name", _app_s);
		System.out.println(_app_s);
		return doubanService.getFilterResult(map); 
	}
	
}
