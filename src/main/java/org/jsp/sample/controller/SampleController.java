package org.jsp.sample.controller;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.jsp.sample.dto.Sample;
import org.jsp.sample.repository.SampleRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

	@Autowired
	Sample sample;
	
	@Autowired
	SampleRespository respository;
	
	@PostMapping("save")
	@ResponseBody
	public String save(@RequestParam String name,@RequestParam long mobile)
	{
		sample.setMobile(mobile);
		sample.setName(name);
		respository.save(sample);
		
		return "<h1>Data Saved Successfully</h1>";
	}
}
