package rml.dao;

import java.util.HashMap;
import java.util.List;

import rml.model.CI;

public interface CIMapper {
    int insert(CI record);

    int insertSelective(CI record);

	List<CI> getAll();
	
    List<CI> getResultByPageNum(int offset);
    
    int ajax_project_page_num(HashMap<String,Object> map);
    
    List<CI> getFilterResult(HashMap<String,Object> map);
    
} 