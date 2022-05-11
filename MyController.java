package com.zensar.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entity.AdvertiseCategory;
import com.zensar.entity.AdvertiseStatus;
import com.zensar.service.OlxMasterService;



@RestController
@RequestMapping(value="/advertise")
public class MyController {
	
	@Autowired
	private OlxMasterService olxmasterService;
	
	@GetMapping(value="/category",produces= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public List<AdvertiseCategory> getAllAdvertisementCategories() {
		return olxmasterService.getAllAdvertisementCategories();
	}
	
	@GetMapping(value="/status",produces= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public List<AdvertiseStatus> getAllAdvertisementStatus(){
		return olxmasterService.getAllAdvertisementStatus();
	}
	

}