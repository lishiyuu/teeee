package com.example.service;

import java.util.List;

import com.example.model.Name;
//定义name的业务逻辑接口
public interface INameService {
	public void save(Name bean);
	public void remove(int id);
	public List<Name> query();
}
