package rml.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rml.dao.CIMapper;
import rml.model.CI;


@Service("CIService")
public class CIServiceImpI implements CIServiceI {

	private CIMapper ciMapper;
		
	public CIMapper getCIMapper() {
		return ciMapper;
	}

	@Autowired
	public void setCIMapper(CIMapper ciMapper) {
		this.ciMapper = ciMapper;
	}
	
	
	public List<CI> getAll() {		
		return ciMapper.getAll();
	}
	
	public List<CI> getResultByPageNum(int pageNum) {		
		int offset = (pageNum-1)*50;
		return ciMapper.getResultByPageNum(offset);
	}
	
	public int ajax_project_page_num(HashMap<String,Object> map) {
		return ciMapper.ajax_project_page_num(map);
	}
	
	public List<CI> getFilterResult(HashMap<String, Object> map) {
		return ciMapper.getFilterResult(map);
	}
	
	public CI selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int update(CI ci) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(CI ci) {
		// TODO Auto-generated method stub
		return 0;
	}
}
