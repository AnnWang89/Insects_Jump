package main;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class typetwo_controller {

	public void _clickongoback(ActionEvent e) throws IOException {
	    final_film.mainStage.setScene(final_film.mainScene);
	}
	public void _onclickCercopidae(ActionEvent e) throws IOException {
	    FXMLLoader loadder = new FXMLLoader(getClass().getResource("../views/Cercopidae.fxml"));
	    Parent Cercopidaetype = loadder.load();
	    Scene CercopidaeScene = new Scene(Cercopidaetype);
	    Cercopidae_controller CercopidaeCtrl = loadder.getController();
	    CercopidaeScene.setOnKeyPressed(CercopidaeCtrl.onKeyPressed);
	    final_film.mainStage.setScene(CercopidaeScene);
	}
	public void _onclickflea(ActionEvent e) throws IOException {
	    FXMLLoader loadder = new FXMLLoader(getClass().getResource("../views/flea.fxml"));
	    Parent fleastype = loadder.load();
	    Scene fleaScene = new Scene(fleastype);
	    flea_controller fleaCtrl = loadder.getController();
	    fleaScene.setOnKeyPressed(fleaCtrl.onKeyPressed);
	    final_film.mainStage.setScene(fleaScene);
	}


}
