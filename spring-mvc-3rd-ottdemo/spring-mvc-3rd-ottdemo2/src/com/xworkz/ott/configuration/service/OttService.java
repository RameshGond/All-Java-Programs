package com.xworkz.ott.configuration.service;

import com.xworkz.ott.configuration.dto.OttDTO;

public interface OttService {
	
	boolean validateAndSave(OttDTO ottDto);

}
