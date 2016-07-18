package rml.service;

import java.util.HashMap;
import java.util.List;

import rml.model.CI;

public interface CIServiceI {

	List<CI> getAll();
	
	List<CI> getResultByPageNum(int pagenum);
	
	List<CI> getFilterResult(HashMap<String, Object> map);
	
	int ajax_project_page_num(HashMap<String,Object> map);
	
	CI selectByPrimaryKey(String id);
	
    int insert(CI ci);
    
    int update(CI ci);
    
    int delete(String id);
    

}
