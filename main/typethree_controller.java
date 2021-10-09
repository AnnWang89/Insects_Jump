package main;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class typethree_controller {
    @FXML
    ImageView _Collembola1;
	public void _clickongoback(ActionEvent e) throws IOException {
		final_film.mainStage.setScene(final_film.mainScene);
		
	}
	public void _onclickCollembola(ActionEvent e) throws IOException {
	    FXMLLoader loadder = new FXMLLoader(getClass().getResource("../views/Collembola.fxml"));
	    Parent Collembolatype = loadder.load();
	    Scene CollembolaScene = new Scene(Collembolatype);
	    final_film.mainStage.setScene(CollembolaScene);
	}
	public void _onclickWaxCicada(ActionEvent e) throws IOException {
	    FXMLLoader loadder = new FXMLLoader(getClass().getResource("../views/WaxCicada.fxml"));
	    Parent WaxCicadatype = loadder.load();
	    Scene WaxCicadaScene = new Scene(WaxCicadatype);
	    
	    final_film.mainStage.setScene(WaxCicadaScene);
	}
	
	public EventHandler<KeyEvent> onKeyPressed = (e)->{
		if (e.getCode() == KeyCode.RIGHT) {
			//System.out.println("In");
			if(_Collembola1.isVisible())
		    {
		    	_Collembola1.setVisible(false);
		    }else
		    {
		    	_Collembola1.setVisible(true);
		    }
		}
	};
	

}
