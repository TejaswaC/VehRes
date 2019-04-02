package com.cts.VehicleReservationSystem.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.VehicleReservationSystem.bean.Vehicle;


@Repository("vehicleDAO")
@Transactional
public class VehicleDAOImpl implements VehicleDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

//	@Override
	@Transactional
	public Vehicle insertVehicle(Vehicle vehicle) {
		System.out.println("In DAO" + vehicle);

		Session session=null;
		session=sessionFactory.getCurrentSession();
		System.out.println(vehicle);
		
		session.save(vehicle);
		// TODO Auto-generated method stub
		return vehicle;
	}

	
	
	@Transactional(readOnly=true)
	public List<Vehicle> getallVehicle() {
		Session session=null;
		String query=" from vehicle";
		org.hibernate.query.Query<Vehicle> query2=null;
		session = sessionFactory.getCurrentSession();
		query2=session.createQuery(query);
		List<Vehicle> list=query2.getResultList();
		System.out.println(list);
		return list;
	}



	@Transactional
	public List<Vehicle> searchVehicleByValues(String search_by, String search_value) {
		Session session =null;
		if("Vehicle Number".equals(search_by)){
		String query ="from vehicle where vehicleNumber=?";
			org.hibernate.query.Query<Vehicle> query2 = null;
			session=sessionFactory.getCurrentSession();
			query2=session.createQuery(query);
			query2.setParameter(0, search_value);
			List<Vehicle> list=query2.getResultList();
			return list;	
		}
		if("Branch".equals(search_by)){
			String query ="from vehicle where branch=?";
				org.hibernate.query.Query<Vehicle> query2 = null;
				session=sessionFactory.getCurrentSession();
				query2=session.createQuery(query);
				query2.setParameter(0, search_value);
				List<Vehicle> list=query2.getResultList();
				return list;	
			}
		if("Insurance Expiry".equals(search_by)){
			String query ="from vehicle where insuranceExpiry=?";
				org.hibernate.query.Query<Vehicle> query2 = null;
				session=sessionFactory.getCurrentSession();
				query2=session.createQuery(query);
				query2.setParameter(0, search_value);
				List<Vehicle> list=query2.getResultList();
				return list;	
			}
		if("Service Due".equals(search_by)){
			String query ="from vehicle where serviceDue=?";
				org.hibernate.query.Query<Vehicle> query2 = null;
				session=sessionFactory.getCurrentSession();
				query2=session.createQuery(query);
				query2.setParameter(0, search_value);
				List<Vehicle> list=query2.getResultList();
				return list;	
			}
		if("Last Service".equals(search_by)){
			String query ="from vehicle where lastService=?";
				org.hibernate.query.Query<Vehicle> query2 = null;
				session=sessionFactory.getCurrentSession();
				query2=session.createQuery(query);
				query2.setParameter(0, search_value);
				List<Vehicle> list=query2.getResultList();
				return list;	
			}
		else{
			String query ="from vehicle where vehicleType=?";
			org.hibernate.query.Query<Vehicle> query2 = null;
			session=sessionFactory.getCurrentSession();
			query2=session.createQuery(query);
			query2.setParameter(0, search_value);
			List<Vehicle> list=query2.getResultList();
			return list;
		}
	}



	
	@Transactional
	public Vehicle updateVehicle(Vehicle vehicle) {
		Session session=null;
		session=sessionFactory.getCurrentSession();
		System.out.println(vehicle);
		
		session.saveOrUpdate(vehicle);
		// TODO Auto-generated method stub
		return vehicle;
	}



	@Transactional
	public Vehicle sendVehicle(String vehicleNumber) {
		// TODO Auto-generated method stub
		Session session =null;
		String query ="from vehicle where vehicleNumber=?";
		org.hibernate.query.Query<Vehicle> query2 = null;
		session=sessionFactory.getCurrentSession();
		query2=session.createQuery(query);
		query2.setParameter(0, vehicleNumber);
		Vehicle vehicle=query2.getSingleResult();
		return vehicle;
	}

}