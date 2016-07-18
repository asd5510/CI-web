package rml.dao;

import org.apache.ibatis.annotations.Param;

import rml.model.User;

public interface UserMapper {
	User login(@Param(value = "name")String name,@Param(value = "password")String passwd);
}
