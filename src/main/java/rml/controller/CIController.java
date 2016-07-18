package rml.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import rml.model.CI;
import rml.service.CIServiceI;

@Controller
@RequestMapping("/CIController")
public class CIController {

	private CIServiceI ciService;

	public CIServiceI getCIService() {
		return ciService;
	}

	@Autowired
	public void setCIService(CIServiceI ciService) {
		this.ciService = ciService;
	}
	
/*	@RequestMapping(value="/ajax_project_filter")
	public @ResponseBody List<CI> ajax_project_filter(int _page) {
		List <CI> list = ciService.getResultByPageNum(_page);
		return list;
	}*/
	
	@RequestMapping(value="/ajax_project_page_num")
	public @ResponseBody int ajax_project_page_num(String _app_s) {
		HashMap<String,Object> map = new HashMap<String, Object>();
		map.put("app_name", _app_s);
		return ciService.ajax_project_page_num(map); 
	}
	
	@RequestMapping(value="/ajax_project_filter")
	public @ResponseBody List<CI> ajax_project_filter(int _page,String _app_s) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("offset", (_page-1)*50);
		map.put("app_name", _app_s);
		return ciService.getFilterResult(map); 
	}
}
