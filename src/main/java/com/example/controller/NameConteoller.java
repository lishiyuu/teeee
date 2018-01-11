package com.example.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Name;
import com.example.service.INameService;

@RestController
public class NameConteoller {
	@Resource //自动装配 依赖注入
	private INameService service;
	
	@RequestMapping("/name/query")
	public List<Name> query(){
		return this.service.query();
	}
	
	@RequestMapping("/name/remove/{id}")
	public boolean remove(@PathVariable("id") int id){
		try {
			this.service.remove(id);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
	@RequestMapping("/name/save")
	public boolean save(Name bean) {
		try {
			this.service.save(bean);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;// TODO: handle exception
		}
	}
	
}
