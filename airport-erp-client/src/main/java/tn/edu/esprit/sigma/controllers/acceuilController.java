package tn.edu.esprit.sigma.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import tn.edu.esprit.sigma.utils.ControlledScreen;
import tn.edu.esprit.sigma.utils.ScreensController;

public class acceuilController implements Initializable, ControlledScreen {
	@FXML
	private Button btn_passenger;
	@FXML
	private Button btn_company;
	@FXML
	private Button btn_pro;

	// Event Listener on Button[#btn_passenger].onAction
	@FXML
	public void showPassenger(ActionEvent event) {
		
		tn.edu.esprit.sigma.utils.Main.mainCantainer.loadscreen(tn.edu.esprit.sigma.utils.Main.g_pagepassengerID,
				tn.edu.esprit.sigma.utils.Main.g_pagepassengerFile);
		tn.edu.esprit.sigma.utils.Main.mainCantainer.setScreen(tn.edu.esprit.sigma.utils.Main.g_pagepassengerID);
	}

	// Event Listener on Button[#btn_company].onAction
	@FXML
	public void showCompany(ActionEvent event) {
		tn.edu.esprit.sigma.utils.Main.mainCantainer.loadscreen(tn.edu.esprit.sigma.utils.Main.g_pageauthentificationt3ID,
				tn.edu.esprit.sigma.utils.Main.g_pageauthentification3File);
		tn.edu.esprit.sigma.utils.Main.mainCantainer.setScreen(tn.edu.esprit.sigma.utils.Main.g_pageauthentificationt3ID);
	}

	// Event Listener on Button[#btn_pro].onAction
	@FXML
	public void showPro(ActionEvent event) {
		tn.edu.esprit.sigma.utils.Main.mainCantainer.loadscreen(tn.edu.esprit.sigma.utils.Main.g_pageauthentificationt2ID,
				tn.edu.esprit.sigma.utils.Main.g_pageauthentification2File);
		tn.edu.esprit.sigma.utils.Main.mainCantainer.setScreen(tn.edu.esprit.sigma.utils.Main.g_pageauthentificationt2ID);
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
