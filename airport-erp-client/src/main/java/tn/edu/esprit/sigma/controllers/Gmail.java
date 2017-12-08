package tn.edu.esprit.sigma.controllers;
import javax.mail.*;
import java.util.Properties;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class Gmail {
	/*
	 * To change this template, choose Tools | Templates
	 * and open the template in the editor.
	 */


	    public static String adresse_destination;
	    public static String subject;
	    public static String contenu;
	     
	    final String username ="ines.mnaouar@gmail.com"; // your email 
	    final String password ="litdenounou@13"; // your password

	    
	    public void sendMail () {
	   
	        Properties props = new Properties();
	        
	        
	        props.put("mail.smtp.auth","true");// authentification 
	        props.put("mail.smtp.starttls.enable","true"); // ********
	        props.put("mail.smtp.host","smtp.gmail.com"); // serveur 
	        props.put("mail.smtp.port","587"); // port
	        
     Session session = Session.getInstance(props);
	        
//	        Session session = Session.getInstance(props, 
//	                new javax.mail.Authenticator(){
//	
//	        protected PasswordAuthentication getPasswordAuthentfication(){
//	            
//	    return new PasswordAuthentication(username,password);
//	           
//	        }    
//	});
	    
	    

	try {
	    
	    
	    Message message = new MimeMessage(session);
	    message.setFrom(new InternetAddress("ines.mnaouar@gmail.com"));// email mte3ek
	    message.setRecipients(Message.RecipientType.TO, 
	    InternetAddress.parse(adresse_destination));
	    message.setSubject(subject);
	  
	    message.setContent(contenu,"text/html; charset=utf-8");// 
	    Transport.send(message);
	    
	    
	    
	    System.out.println("Message envoye");

	} catch(MessagingException e) {

	    throw new RuntimeException(e);
	}
	        
	        
	    }
	    

	}

