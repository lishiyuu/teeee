package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverTypeController {
	
	@RequestMapping("/")
	public String welecome() {
		return "welecome";
	}
	@RequestMapping("/getname")
	public String getname() {
		return "getname";
	}
	@RequestMapping("/teeee/getnames")
	public List<String> getNames(){
		List<String> names=new ArrayList<String>();
		names.add("Tom");
		names.add("cat");
		names.add("ee");
		return names;
	}
}
