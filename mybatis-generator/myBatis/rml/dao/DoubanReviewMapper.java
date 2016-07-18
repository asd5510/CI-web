package rml.dao;

import java.util.List;
import rml.model.DoubanReview;
import rml.model.DoubanReviewExample;

public interface DoubanReviewMapper {
    int countByExample(DoubanReviewExample example);

    int insert(DoubanReview record);

    int insertSelective(DoubanReview record);

    List<DoubanReview> selectByExample(DoubanReviewExample example);
}