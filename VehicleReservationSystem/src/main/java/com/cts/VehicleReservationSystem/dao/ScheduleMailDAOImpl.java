package com.cts.VehicleReservationSystem.dao;

import java.util.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.VehicleReservationSystem.bean.Vehicle;
import com.cts.VehicleReservationSystem.service.MailService;


@Repository("scheduleMailDAO")
@Transactional
public class ScheduleMailDAOImpl implements ScheduleMailDAO{
	@Autowired
	MailService mailService;
	

	@Autowired
	private SessionFactory sessionFactory;
	
	private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	
	
	@Transactional(readOnly=true)
	public String sendMail() {
		Session session=null;
		String query=" from vehicle";
		org.hibernate.query.Query<Vehicle> query2=null;
		session = sessionFactory.getCurrentSession();
		query2=session.createQuery(query);
		List<Vehicle> list=query2.getResultList();
		System.out.println(list);
		Date date = new Date();
        System.out.println(sdf.format(date));
        Long diff;
		for (Vehicle vehicle: list)
		{
			Date iDate = vehicle.getInsuranceExpiry();
			System.out.println(iDate);
			diff = (date.getTime() - iDate.getTime())/(24 * 60 * 60 * 1000);
			System.out.println("The days till next service is "+diff);
			if(diff<=15)
			{
				mailService.dueMail(vehicle);
				
				
			}

		}
		
		
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
