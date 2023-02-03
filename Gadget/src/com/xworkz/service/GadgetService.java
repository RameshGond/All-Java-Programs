package com.xworkz.service;

import com.xworkz.gadget.dto.GadgetDTO;

public interface GadgetService {
	
	
	
	
	boolean validateAndSave(GadgetDTO dto);

	GadgetDTO findById(int id);

}
