package com.william.demo.api.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.william.base.domain.entity.User;

@Mapper
public interface UserMapper {

	List<User>getAllUser();
}
