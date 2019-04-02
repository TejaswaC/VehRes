package com.cts.VehicleReservationSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.VehicleReservationSystem.bean.Vehicle;
import com.cts.VehicleReservationSystem.dao.LoginDAO;
import com.cts.VehicleReservationSystem.dao.ScheduleMailDAO;
import com.cts.VehicleReservationSystem.dao.SendMailDAO;

@Service("mailService")
@Transactional(propagation=Propagation.SUPPORTS)
public class MailServiceImpl implements MailService{

	
	@Autowired
	ScheduleMailDAO scheduleMailDAO ;
	
	@Autowired
	SendMailDAO sendMailDAO ;

	@Override
	public String sendMail() {
		// TODO Auto-generated method stub
		System.out.println("In Servie");
		return scheduleMailDAO.sendMail();
	}
	
	
	@Override
	public String dueMail(Vehicle vehicle) {
		// TODO Auto-generated method stub
		System.out.println("In Servie due mail");
		return sendMailDAO.dueMail(vehicle);	}

}
