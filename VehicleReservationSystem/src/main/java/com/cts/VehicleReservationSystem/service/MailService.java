package com.cts.VehicleReservationSystem.service;

import com.cts.VehicleReservationSystem.bean.Vehicle;

public interface MailService {
	public String sendMail();
	
	public String dueMail(Vehicle vehicle);

}
