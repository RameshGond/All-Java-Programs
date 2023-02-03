package com.xworkz.powerconsumption.service;

import java.time.LocalDate;
import java.util.Optional;

import com.xworkz.powerconsumption.dao.PowerConsumptionDAO;
import com.xworkz.powerconsumption.dto.PowerConsumptionDTO;
import com.xworkz.powerconsumption.exceptions.InvalidDataException;

public class PowerConsumptionServiceImpl implements PowerConsumptionService {

	private PowerConsumptionDAO powerDAO;

	public void validateAndSave(PowerConsumptionDTO dto) throws InvalidDataException {
		if (dto != null) {
			Integer id = dto.getId();
			Double unitConsumed = dto.getUnitConsumed();
			Double ratePerUnit = dto.getRatePerUnit();
			LocalDate dueDate = dto.getDuedate();
			Double minCharge = dto.getMinCharge();
			String customerName = dto.getCustomerName();
			String division = dto.getDivision();

			if (id != null && id > 0) {
				System.out.println("id is valid");
			} else {
				System.out.println("id is not valid");
				InvalidDataException data = new InvalidDataException("id is invalid please enter valid id");
				throw data;
			}
			if (unitConsumed != null && unitConsumed > 0) {
				System.out.println("unitConsumed is valid");
			} else {
				System.out.println("unitConsumed is not valid");
				InvalidDataException data = new InvalidDataException(
						"unitConsumed is invalid please enter valid unitConsumed");
				throw data;
			}
			if (ratePerUnit != null && ratePerUnit >= 4 && ratePerUnit <= 12) {
				System.out.println("ratePerUnit is valid");
			} else {
				System.out.println("ratePerUnit is not valid");
				InvalidDataException data = new InvalidDataException(
						"ratePerUnit is invalid please enter valid ratePerUnit");
				throw data;
			}
			if (dueDate != null) {
				System.out.println("dueDate is valid");
			} else {
				System.out.println("dueDate is not valid");
				InvalidDataException data = new InvalidDataException("dueDate is invalid please enter valid dueDate");
				throw data;
			}
			if (minCharge != null && minCharge >= 150) {
				System.out.println("minCharge is valid");
			} else {
				System.out.println("minCharge is not valid");
				InvalidDataException data = new InvalidDataException(
						"minCharge is invalid please enter valid minCharge");
				throw data;
			}
			if (customerName != null) {
				System.out.println("customerName is valid");
			} else {
				System.out.println("customerName is not valid");
				InvalidDataException data = new InvalidDataException(
						"customerName is invalid please enter valid customerName");
				throw data;
			}
			if (division != null) {
				System.out.println("division is valid");
			} else {
				System.out.println("division is not valid");
				InvalidDataException data = new InvalidDataException("division is invalid please enter valid division");
				throw data;
			}

		}

	}

	@Override
	public void validateAndSaveMultiple(PowerConsumptionDTO[] dto1) {
		for (int index = 0; index < dto1.length; index++) {
			PowerConsumptionDTO powerConsumptionDTO = dto1[index];
			this.validateAndSave(powerConsumptionDTO);

		}

	}

	@Override
	public void printDetails() {
		this.powerDAO.printDetails();

	}

	@Override
	public void deleteByCustomerName(String name) {
		if (name != null) {
			System.out.println("valid customerName");
			this.powerDAO.deleteByCustomerName(name);
		}

	}

	@Override
	public void deleteByDivision(String division) {
		if (division != null) {
			System.out.println("valid division");
			this.powerDAO.deleteByDivision(division);
		}

	}

	@Override
	public void updateMinChargeByDivision(String division, double min) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateRatePerUnitByDivision(String division, double ratePerUnit) {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<PowerConsumptionDTO> findByDivision(String division) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<PowerConsumptionDTO> findByCustomerNameAndDivision(String customerName, String division) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Double> findRatePerUnitByDivision(String division) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Double> findDueAmountByCustomerName(String customerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(PowerConsumptionDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

}
