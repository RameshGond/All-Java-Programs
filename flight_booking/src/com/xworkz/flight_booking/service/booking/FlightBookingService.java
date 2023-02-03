package com.xworkz.flight_booking.service.booking;

import com.xworkz.flight_booking.dto.booking.FlightBookingDTO;
import com.xworkz.flight_booking.exceptions.InvalidDataException;

public interface FlightBookingService {
	
	boolean validateAndSave(FlightBookingDTO booking) throws InvalidDataException;

}
