package com.xworkz.ott.configuration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.ott.configuration.dao.OttDAO;
import com.xworkz.ott.configuration.dto.OttDTO;


@Component
public class OttserviceImpl implements OttService {

	@Autowired
	private OttDAO ottDao;
	@Override
	public boolean validateAndSave(OttDTO ottDto) {
		System.out.println("from service impl");
	    System.out.println(ottDto);
	    ottDao.save(ottDto);
		return  true;// ottDao.save(ottDto);
	}

}
