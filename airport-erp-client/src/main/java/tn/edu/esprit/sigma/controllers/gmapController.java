package tn.edu.esprit.sigma.controllers;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import com.lynden.gmapsfx.GoogleMapView;
import com.lynden.gmapsfx.MapComponentInitializedListener;
import com.lynden.gmapsfx.javascript.object.LatLong;
import com.lynden.gmapsfx.javascript.object.MapOptions;
import com.lynden.gmapsfx.javascript.object.Marker;
import com.lynden.gmapsfx.javascript.object.MarkerOptions;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Stage;
import tn.edu.esprit.sigma.utils.ControlledScreen;
import tn.edu.esprit.sigma.utils.ScreensController;

public class gmapController implements Initializable , ControlledScreen  , MapComponentInitializedListener{

	
	@Override
	public void SetScreenParent(ScreensController screenpage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		 mapView = new GoogleMapView();
		    mapView.addMapInializedListener(this);
	}

	GoogleMapView mapView;
	com.lynden.gmapsfx.javascript.object.GoogleMap map;

	

	 
	@Override
	public void mapInitialized() {
	    //Set the initial properties of the map.
	    MapOptions mapOptions = new MapOptions();

	    mapOptions.center(new LatLong(36.851111, 10.226944))
	            .overviewMapControl(false)
	            .panControl(false)
	            .rotateControl(false)
	            .scaleControl(false)
	            .streetViewControl(false)
	            .zoomControl(false)
	            .zoom(12);

	    map = mapView.createMap(mapOptions);

	    //Add a marker to the map
	    MarkerOptions markerOptions = new MarkerOptions();

	    markerOptions.position( new LatLong(36.851111, 10.226944) )
	                .visible(Boolean.TRUE)
	                .title("My Marker");

	    Marker marker = new Marker( markerOptions );

	    map.addMarker(marker);

	}

	@FXML
	public void show(ActionEvent event){
		
		Scene scene = new Scene(mapView);

	    
	}
}
