package com.xworkz.powerconsumption.dao;

import java.util.Iterator;
import java.util.Optional;

import com.xworkz.powerconsumption.dto.PowerConsumptionDTO;

public class PowerConsumptionDAOImpl implements PowerConsumptionDAO {
	private PowerConsumptionDTO[] power = new PowerConsumptionDTO[TOTAL_SIZE];
	private int index;

	@Override
	public boolean save(PowerConsumptionDTO dto) {
		if (this.index < this.power.length) {
			this.power[index] = dto;
			index++;
			System.out.println("power consumption dto is saved " + dto);
		}
		System.out.println("power consumption dto is not saved " + dto);

		return false;
	}

	@Override
	public void printDetails() {
		for (int index = 0; index < power.length; index++) {
			PowerConsumptionDTO power1 = power[index];
			System.out.println(power1);
		}

	}

	@Override
	public void deleteByCustomerName(String customerName) {
		for (int index = 0; index < power.length; index++) {
			PowerConsumptionDTO powerConsumptionDTO = power[index];
			if (customerName.equals(powerConsumptionDTO.getCustomerName())) {
				powerConsumptionDTO.setCustomerName(null);
			}

		}

	}

	@Override
	public void deleteByDivision(String division) {
		for (int index = 0; index < power.length; index++) {
			PowerConsumptionDTO powerConsumptionDTO = power[index];
			if (division.equals(powerConsumptionDTO.getDivision())) {
				powerConsumptionDTO.setDivision(null);
			}

		}

	}

	@Override
	public void updateMinChargeByDivision(String division, double min) {
		for (int index = 0; index < power.length; index++) {
			PowerConsumptionDTO powerConsumptionDTO = power[index];
			if (division.equals(powerConsumptionDTO.getDivision())) {
				powerConsumptionDTO.setMinCharge(min);
			}

		}

	}

	@Override
	public void updateRatePerUnitByDivision(String division, double ratePerUnit) {
		for (int index = 0; index < power.length; index++) {
			PowerConsumptionDTO powerConsumptionDTO = power[index];
			if (division.equals(powerConsumptionDTO.getDivision())) {
				powerConsumptionDTO.setRatePerUnit(ratePerUnit);
			}

		}

	}

	@Override
	public Optional<PowerConsumptionDTO> findByDivision(String division) {
		for (int index = 0; index < power.length; index++) {
			PowerConsumptionDTO powerConsumptionDTO = power[index];
			if (division.equals(powerConsumptionDTO.getDivision())) {
				System.out.println("finding using division " + division);
				return Optional.of(powerConsumptionDTO);
			}

		}
		return Optional.empty();
	}

	@Override
	public Optional<PowerConsumptionDTO> findByCustomerNameAndDivision(String customerName, String division) {
		for (int index = 0; index < power.length; index++) {
			PowerConsumptionDTO powerConsumptionDTO = power[index];
			if (customerName.equals(powerConsumptionDTO.getCustomerName())
					&& division.equals(powerConsumptionDTO.getDivision())) {
				System.out.println("finding customer name and division " + customerName);
				return Optional.of(powerConsumptionDTO);
			}

		}
		return Optional.empty();
	}

	@Override
	public Optional<Double> findRatePerUnitByDivision(String division) {
		for (int index = 0; index < power.length; index++) {
			PowerConsumptionDTO powerConsumptionDTO = power[index];
			if (division.equals(powerConsumptionDTO.getDivision())) {
				System.out.println("finding using division " + division);
				return Optional.of(powerConsumptionDTO.getRatePerUnit());
			}

		}
		return Optional.empty();
	}

	@Override
	public Optional<Double> findDueAmountByCustomerName(String customerName) {
		for (int index = 0; index < power.length; index++) {
			PowerConsumptionDTO powerConsumptionDTO = power[index];
			if (customerName.equals(powerConsumptionDTO.getCustomerName())) {
				System.out.println("finding using customer name " + customerName);
				return Optional.of(powerConsumptionDTO.getDueAmount());
			}

		}
		return Optional.empty();
	}

}
