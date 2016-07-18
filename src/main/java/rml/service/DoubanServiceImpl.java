package rml.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import rml.dao.DoubanReviewMapper;
import rml.model.DoubanReview;

@Service("doubanReviewService")
public class DoubanServiceImpl implements DoubanServiceI {
	
	
	private DoubanReviewMapper doubanReviewMapper;
	
	public DoubanReviewMapper getDoubanReviewMapper() {
		return doubanReviewMapper;
	}

	@Autowired
	public void setDoubanReviewMapper(DoubanReviewMapper doubanReviewMapper) {
		this.doubanReviewMapper = doubanReviewMapper;
	}
	

	public List<DoubanReview> getResultByPageNum(int pageNum) {
		int offset = (pageNum-1)*50;
		return doubanReviewMapper.getResultByPageNum(offset);
	}

	public List<DoubanReview> getFilterResult(HashMap<String, Object> map) {
		return doubanReviewMapper.getFilterResult(map);
	}

	public int ajax_project_page_num(HashMap<String, Object> map) {
		return doubanReviewMapper.ajax_project_page_num(map);
	}

	public List<String> getMoviewNames() {
		return doubanReviewMapper.getMovieNames();
	}

}
