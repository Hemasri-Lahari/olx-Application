package com.zensar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.entity.AdvertiseCategory;
import com.zensar.entity.AdvertiseStatus;

import com.zensar.repository.CategoryRepository;
import com.zensar.repository.StatusRepository;
@Service
public class OlxMasterServiceImpl implements OlxMasterService {
	
	@Autowired
    private CategoryRepository categoryRepository;
	@Autowired
	private StatusRepository statusRepository;

	static List<AdvertiseCategory> categories= new ArrayList<AdvertiseCategory>();
	static List<AdvertiseStatus> status=new ArrayList<AdvertiseStatus>();
	
	static {
		categories.add(new AdvertiseCategory(1L, "Furniture"));
		categories.add(new AdvertiseCategory(2L, "Cars"));
		categories.add(new AdvertiseCategory(3L, "Mobiles"));
		categories.add(new AdvertiseCategory(4L, "Real Estate"));
		categories.add(new AdvertiseCategory(5L, "Sports"));
	}
	
	static {
		status.add(new AdvertiseStatus(1L, "OPEN"));
		status.add(new AdvertiseStatus(2L, "CLOSED"));
	} 
	
	
	@Override
	public List<AdvertiseCategory> getAllAdvertisementCategories() {
		return categoryRepository.findAll();
	}

	@Override
	public List<AdvertiseStatus> getAllAdvertisementStatus() {
		return statusRepository.findAll();
	}

}
