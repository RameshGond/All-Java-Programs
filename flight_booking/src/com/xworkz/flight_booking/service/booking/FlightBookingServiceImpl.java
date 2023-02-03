package com.xworkz.flight_booking.service.booking;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.xworkz.flight_booking.dao.booking.FlightBookingDAO;
import com.xworkz.flight_booking.dto.booking.FlightBookingDTO;
import com.xworkz.flight_booking.exceptions.InvalidDataException;

import lombok.AllArgsConstructor;
@Component
@AllArgsConstructor
public class FlightBookingServiceImpl implements FlightBookingService {
	
	private FlightBookingDAO dao;

	@Override
	public boolean validateAndSave(FlightBookingDTO booking) throws InvalidDataException {
		if (booking != null) {
			int id = booking.getId();
			String passengerName = booking.getPassengerName();
			boolean international = booking.isInternational();
			String passportNo = booking.getPassportNo();
			String airline = booking.getAirline();
			String boarding = booking.getBoarding();
			String destination = booking.getDestination();
			double ticketPrice = booking.getTicketPrice();
			LocalDateTime travelDateAndTime = booking.getTravelDateAndTime();
			double percentage = booking.getGstPercentage();

			if (passengerName != null && passengerName.length() > 3 && passengerName.length() < 40 && !passengerName.matches(" ")) {
				System.out.println("passengerName is valid");
			} else {
				System.err.println("passengerName is invalid");
				throw new InvalidDataException("Enter the correct data");
			}
			if (passportNo != null && passportNo.length() >= 8 && !passportNo.matches(".*[!@#$%^&*()_+{}><.;,<>].*")) {
				System.out.println("PassportNo is valid");
			} else {
				System.err.println("PassportNo is invalid");
				throw new InvalidDataException("Enter the correct data");
			}
			if (airline != null && airline.length() > 3 && airline.length() < 40 && !airline.matches("")) {
				System.out.println("Airline is valid");
			} else {
				System.err.println("Airline is invalid");
				throw new InvalidDataException("Enter the correct data");
			}
			if (boarding != null && boarding.length() > 3 && boarding.length() < 40 && !boarding.matches("")) {
				System.out.println("Boarding is valid");
			} else {
				System.err.println("Boarding is invalid");
				throw new InvalidDataException("Enter the correct data");
			}
			if (destination != null && destination.length() > 3 && destination.length() < 40
					&& !destination.matches("")) {
				System.out.println("Destination is valid");
			} else {
				System.err.println("Destination is invalid");
				throw new InvalidDataException("Enter the correct data");
			}
			if (ticketPrice > 1000) {
				System.out.println("TicketPrice is valid");
			} else {
				System.err.println("TicketPrice is invalid");
				throw new InvalidDataException("Enter the correct data");
			}
			if (percentage > 0) {
				if (international == true) {
					System.out.println("add 25% gst");
					booking.setGstPercentage(25d);
				}
				if (international == false) {
					System.out.println("add 12% gst");
					booking.setGstPercentage(12d);
				}
			} else {
				System.err.println("gstpercentage is invalid");
				throw new InvalidDataException("Enter the correct data");

			}
			double totalPrice = ticketPrice + (ticketPrice * (percentage / 100));
			booking.setTotalPrice(totalPrice);

			boolean saved = dao.save(booking);
			return saved;
		}
		return false;
	}
}
