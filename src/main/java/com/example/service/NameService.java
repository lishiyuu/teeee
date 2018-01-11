package com.example.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.mapper.NameMapper;
import com.example.model.Name;

@Service
public class NameService implements INameService{
	@Resource //byName Autowired byType
	private NameMapper mapper;
	@Override
	public void save(Name bean) {
		if(bean.getId()!=null && bean.getId()>0) {
			this.mapper.update(bean);
		}else {
			this.mapper.insert(bean);
		}
		
	}

	@Override
	public void remove(int id) {
		this.mapper.delete(id);
		
	}

	@Override
	public List<Name> query() {
		return this.mapper.select();
	}
	
}
