package rml.dao;

import rml.model.CI;

public interface CIMapper {
    int insert(CI record);

    int insertSelective(CI record);
}