package tn.edu.esprit.sigma.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import tn.edu.esprit.sigma.client.delegate.PassengerServicesDelegate;
import tn.edu.esprit.sigma.utils.ControlledScreen;
import tn.edu.esprit.sigma.utils.Main;
import tn.edu.esprit.sigma.utils.ScreensController;

import java.net.URL;
import java.util.ResourceBundle;

import entities.Passenger;
import javafx.event.ActionEvent;

import javafx.scene.control.PasswordField;

public class Authentificate3Controller implements Initializable , ControlledScreen {
	@FXML
	private TextField txt_email;
	@FXML
	private PasswordField txt_password;
	@FXML
	private Button btn_connect;
	static Passenger passenger ;

	// Event Listener on Button[#btn_connect].onAction
	@FXML
	public void connect(ActionEvent event) {
		//	Gmail gmail =new Gmail();
		PassengerServicesDelegate p = new PassengerServicesDelegate();
		
		passenger =	p.doAuthentication( txt_email.getText().toString(), txt_password.getText().toString());
		if (passenger != null){
			GMailAuthenticator authenticator = new GMailAuthenticator(txt_email.getText().toString(), txt_password.getText().toString());
//			gmail.adresse_destination=passenger.getEmail();
//			gmail.subject="Confiramtion de ticket";
//			gmail.contenu="la confirmation est valide dans deux jour";
//			gmail.sendMail();
			Main.mainCantainer.loadscreen(Main.g_pageBookFlightID, Main.g_pageBookFlightFile);
			Main.mainCantainer.setScreen(Main.g_pageBookFlightID);
		}
		
	}

	@Override
	public void SetScreenParent(ScreensController screenpage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
