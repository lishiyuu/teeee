package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.model.Name;

//定义名字的数据访问接口
@Mapper
public interface NameMapper {
	public void insert(Name bean);
	public void delete(int id);
	public void update(Name bean);
	public List<Name> select();
}
