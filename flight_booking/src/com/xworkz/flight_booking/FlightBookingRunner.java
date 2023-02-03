package com.xworkz.flight_booking;

import java.time.LocalDateTime;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.flight_booking.configuaration.booking.FlightBookingConfiguaration;
import com.xworkz.flight_booking.dto.booking.FlightBookingDTO;
import com.xworkz.flight_booking.exceptions.InvalidDataException;
import com.xworkz.flight_booking.service.booking.FlightBookingService;

public class FlightBookingRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(FlightBookingConfiguaration.class);

		FlightBookingService service = context.getBean(FlightBookingService.class);

		FlightBookingDTO dto = new FlightBookingDTO(0, "Ramesh Gond", true, "P1234567", "DeccanAirlines", "Bengaluru",
				"Uganda", 60000d, LocalDateTime.of(2022, 8, 16, 06, 00), 25);

		FlightBookingDTO dto1 = new FlightBookingDTO(0, "Laxmi", true, "A1234567", "SpiceJet", "Belgaum", "Uganda",
				90000d, LocalDateTime.of(2022, 8, 16, 06, 00), 25);

		FlightBookingDTO dto2 = new FlightBookingDTO(0, "Varada", true, "V1234567", "AirIndia", "Belgaum", "America",
				100000d, LocalDateTime.of(2022, 8, 16, 06, 00), 12);

		FlightBookingDTO dto3 = new FlightBookingDTO(0, "Suhas", false, "I1234567", "AirIndia", "Shimoga", "Mangalore",
				7000d, LocalDateTime.of(2022, 9, 16, 9, 00), 12);

		try {
			boolean save = service.validateAndSave(dto3);
			System.out.println(save);
		} catch (InvalidDataException e) {
			e.printStackTrace();
		}

	}

}
