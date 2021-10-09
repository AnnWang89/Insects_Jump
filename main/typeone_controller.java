package main;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class typeone_controller {

	public void _clickongoback(ActionEvent e) throws IOException {
	    final_film.mainStage.setScene(final_film.mainScene);
	}
	public void _onclickClickbeetle(ActionEvent e) throws IOException {
	    FXMLLoader loadder = new FXMLLoader(getClass().getResource("../views/Clickbeetle.fxml"));
	    Parent Clickbeetletype = loadder.load();
	    Scene ClickbeetleScene = new Scene(Clickbeetletype);
	    final_film.mainStage.setScene(ClickbeetleScene);
	}
	public void _onclickOdontomachus(ActionEvent e) throws IOException {
	    FXMLLoader loadder = new FXMLLoader(getClass().getResource("../views/Odontomachus.fxml"));
	    Parent Odontomachustype = loadder.load();
	    Scene OdontomachusScene = new Scene(Odontomachustype);
	    final_film.mainStage.setScene(OdontomachusScene);
	}


}
