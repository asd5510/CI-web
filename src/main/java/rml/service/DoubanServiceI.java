package rml.service;

import java.util.HashMap;
import java.util.List;

import rml.model.DoubanReview;

public interface DoubanServiceI {
	List<DoubanReview> getResultByPageNum(int pagenum);
	
	List<DoubanReview> getFilterResult(HashMap<String, Object> map);
    List<String> getMoviewNames();
	int ajax_project_page_num(HashMap<String,Object> map);
}
