package rml.dao;

import java.util.HashMap;
import java.util.List;
import rml.model.DoubanReview;
import rml.model.DoubanReviewExample;

public interface DoubanReviewMapper {
    int countByExample(DoubanReviewExample example);

    int insert(DoubanReview record);

    int insertSelective(DoubanReview record);

    List<DoubanReview> selectByExample(DoubanReviewExample example);

	List<DoubanReview> getResultByPageNum(int offset);

	int ajax_project_page_num(HashMap<String, Object> map);

	List<DoubanReview> getFilterResult(HashMap<String, Object> map);
	
    List<String> getMovieNames();
}