package tn.edu.esprit.sigma.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import tn.edu.esprit.sigma.client.delegate.ProviderServicesDelegate;
import tn.edu.esprit.sigma.utils.ControlledScreen;
import tn.edu.esprit.sigma.utils.Main;
import tn.edu.esprit.sigma.utils.ScreensController;

import java.net.URL;
import java.util.ResourceBundle;

import org.controlsfx.dialog.Dialogs;

import entities.Provider;
import javafx.event.ActionEvent;

import javafx.scene.control.MenuItem;

import javafx.scene.control.PasswordField;

import javafx.scene.control.Menu;

public class registerController implements Initializable,ControlledScreen {
	@FXML
	private Menu btn_home;
	@FXML
	private MenuItem btn_showFlights;
	@FXML
	private MenuItem btn_meals;
	@FXML
	private MenuItem btn_car;
	@FXML
	private MenuItem btn_register;
	@FXML
	private Menu btn_maps;
	@FXML
	private Menu btn_about;
	@FXML
	private TextField txt_managerName;
	@FXML
	private TextField txt_companyName;
	@FXML
	private TextField txt_email;
	@FXML
	private TextField txt_phoneNumer;
	@FXML
	private PasswordField txt_password;
	@FXML
	private Button btn_signIn;

	// Event Listener on Menu[#btn_home].onAction
	@FXML
	public void showHome(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on MenuItem[#btn_showFlights].onAction
	@FXML
	public void showFlights(ActionEvent event) {
		Main.mainCantainer.loadscreen(Main.g_pageauthentificationtID, Main.g_pageauthentificationFile);
		Main.mainCantainer.setScreen(Main.g_pageauthentificationtID);
	}
	// Event Listener on MenuItem[#btn_meals].onAction
	@FXML
	public void showMeals(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on MenuItem[#btn_car].onAction
	@FXML
	public void showCar(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on MenuItem[#btn_register].onAction
	@FXML
	public void Register(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Menu[#btn_maps].onAction
	@FXML
	public void showMaps(ActionEvent event) {
		
	}
	// Event Listener on Menu[#btn_about].onAction
	@FXML
	public void showAbout(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#btn_signIn].onAction
	@FXML
	public void signIn(ActionEvent event) {
		
		Provider provider = new Provider();
		provider.setManagerName(txt_managerName.getText());
		provider.setCompanyName(txt_companyName.getText());
		provider.setEmail(txt_email.getText());
		provider.setPassword(txt_password.getText());
//		provider.setPhoneInteger(Integer.valueOf(txt_phoneNumer.getText()));
		
		if (txt_email.getText().contains("@") ){
			ProviderServicesDelegate.doAddProvider(provider);
			
			Main.mainCantainer.loadscreen(Main.g_pagepassengerID, Main.g_pagepassengerFile);
			Main.mainCantainer.setScreen(Main.g_pagepassengerID);
		}
		else{
//			Dialogs.create()
//			.masthead(null)
//			.message("Failed")
//			.showInformation();
			System.out.println("failed");
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
