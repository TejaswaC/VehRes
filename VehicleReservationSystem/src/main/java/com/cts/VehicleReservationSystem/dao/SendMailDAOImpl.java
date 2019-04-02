package com.cts.VehicleReservationSystem.dao;
import java.util.*;  


import javax.mail.*;  
import javax.mail.internet.*;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.VehicleReservationSystem.bean.Vehicle;

import javax.activation.*;  


@Repository("sendMailDAO")
@Transactional
public class SendMailDAOImpl implements SendMailDAO{

	
	
		@Override
		public String dueMail(Vehicle vehicle) {
			
			System.out.println("Reached DAO Mailer");
			System.out.println(vehicle);
			// TODO Auto-generated method stub
			/* String recipient = "tejasw22@gmail.com"; 
			  
		      // email ID of  Sender. 
		      String sender = "tejasw22@gmail.com"; 
		  
		      // using host as localhost 
		      String host = "127.0.0.1"; 
		  
		      // Getting system properties 
		      Properties properties = System.getProperties(); 
		  
		      // Setting up mail server 
		      properties.setProperty("mail.smtp.host", host); 
		  
		      // creating session object to get properties 
		      Session session = Session.getDefaultInstance(properties); 
		  
		      try 
		      { 
		         // MimeMessage object. 
		         MimeMessage message = new MimeMessage(session); 
		  
		         // Set From Field: adding senders email to from field. 
		         message.setFrom(new InternetAddress(sender)); 
		  
		         // Set To Field: adding recipient's email to from field. 
		         message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient)); 
		  
		         // Set Subject: subject of the email 
		         message.setSubject("Vehicle Reservaytion Mail"); 
		  
		         // set body of the email. 
		         message.setText("Service due for"+ vehicle); 
		  
		         // Send email. 
		         Transport.send(message); 
		         System.out.println("Mail successfully sent"); 
		      } 
		      catch (MessagingException mex)  
		      { 
		         mex.printStackTrace(); 
		      } 	*/
		
		
		return "Mail sent";
		
	
	
	
}}
