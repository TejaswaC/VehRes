package com.cts.VehicleReservationSystem.dao;

import com.cts.VehicleReservationSystem.bean.Vehicle;

public interface SendMailDAO {
	public String dueMail(Vehicle vehicle);

}
