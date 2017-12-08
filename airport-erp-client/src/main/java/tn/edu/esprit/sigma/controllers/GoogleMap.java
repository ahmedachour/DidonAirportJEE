package tn.edu.esprit.sigma.controllers;




import com.lynden.gmapsfx.GoogleMapView;
import com.lynden.gmapsfx.MapComponentInitializedListener;
import com.lynden.gmapsfx.javascript.object.LatLong;
import com.lynden.gmapsfx.javascript.object.MapOptions;
import com.lynden.gmapsfx.javascript.object.Marker;
import com.lynden.gmapsfx.javascript.object.MarkerOptions;

import javafx.application.Application;

import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GoogleMap extends Application implements  MapComponentInitializedListener{
	GoogleMapView mapView;
	com.lynden.gmapsfx.javascript.object.GoogleMap map;

	@Override
	public void start(Stage stage) throws Exception {

	    //Create the JavaFX component and set this as a listener so we know when 
	    //the map has been initialized, at which point we can then begin manipulating it.
	    mapView = new GoogleMapView();
	    mapView.addMapInializedListener(this);

	    Scene scene = new Scene(mapView);

	    stage.setTitle("JavaFX and Google Maps");
	    stage.setScene(scene);
	    stage.show();
	}
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
	public static void main(String[] args) {
	    launch(args);
	}
	
	
	}
	


