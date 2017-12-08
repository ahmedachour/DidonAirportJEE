package tn.edu.esprit.sigma.utils;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public static String g_pageAcceuilID = "acceuil";
	public static String g_pageAcceuilFile = "/tn/edu/esprit/sigma/client/gui/acceuil.fxml";
	
	public static String g_pagepassengerID = "passenger";
	public static String g_pagepassengerFile = "/tn/edu/esprit/sigma/client/gui/passenger.fxml";

	public static String g_pageRegisterrID = "Register";
	public static String g_pageRegisterrFile = "/tn/edu/esprit/sigma/client/gui/register.fxml";
	
	public static String g_pageMapID = "map";
	public static String g_pageMapFile = "/tn/edu/esprit/sigma/client/gui/maps.fxml";

	public static String g_pageBookFlightID = "bookFlight";
	public static String g_pageBookFlightFile = "/tn/edu/esprit/sigma/client/gui/BookAFlight.fxml";

	public static String g_pageauthentificationtID = "authentification";
	public static String g_pageauthentificationFile = "/tn/edu/esprit/sigma/client/gui/Authentificate.fxml";

	public static String g_mapID = "map";
	public static String g_mapFile = "/tn/edu/esprit/sigma/client/gui/gmap.fxml";
	

	public static String g_pageauthentificationt2ID = "authentification2";
	public static String g_pageauthentification2File = "/tn/edu/esprit/sigma/client/gui/Autentificate2.fxml";
	
	public static String g_pageauthentificationt3ID = "authentification3";
	public static String g_pageauthentification3File = "/tn/edu/esprit/sigma/client/gui/Authentificate3.fxml";

	
	public static String g_carID = "car";
	public static String g_carFile = "/tn/edu/esprit/sigma/client/gui/car.fxml";
	public static void main(String[] args) {

		launch(args);
	}

	public static ScreensController mainCantainer;

	@Override
	public void start(Stage primaryStage) throws Exception {

		mainCantainer = new ScreensController();
		mainCantainer.loadscreen(g_pageAcceuilID, g_pageAcceuilFile);
		mainCantainer.setScreen(Main.g_pageAcceuilID);

		Group root = new Group();
		root.getChildren().addAll(mainCantainer);

		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
