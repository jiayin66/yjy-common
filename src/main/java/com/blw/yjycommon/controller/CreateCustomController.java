package com.blw.yjycommon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blw.yjycommon.dao.BusinessDao;
import com.blw.yjycommon.entity.Business;

@RequestMapping("/CreateCustomController/")
@RestController
public class CreateCustomController {
	@Autowired
	private BusinessDao businessDao;
	
	@PostMapping("save")
	public Business saveCustom( Business Business) {
		if(Business==null || Business.getMachineId()==null) {
			return null;
		}
		businessDao.save(Business);
		return Business;
	}
}
