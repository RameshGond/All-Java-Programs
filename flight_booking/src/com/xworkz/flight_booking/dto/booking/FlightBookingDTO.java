package com.xworkz.flight_booking.dto.booking;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class FlightBookingDTO implements Serializable {
	@NonNull
	private int id;
	@NonNull
	private String passengerName;
	@NonNull
	private boolean international;
	@NonNull
	private String passportNo;
	@NonNull
	private String airline;
	@NonNull
	private String boarding;
	@NonNull
	private String destination;
	@NonNull
	private double ticketPrice;
	@NonNull
	private LocalDateTime travelDateAndTime;
	@NonNull
	private double gstPercentage;
	private double totalPrice;

}
