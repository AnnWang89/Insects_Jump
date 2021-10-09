package main;

import java.io.IOException;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class Clickbeetle_controller {

	@FXML
    ImageView _clickbeetlechar;
	
	Timeline jump;
	
	public void animation () {
		double X = _clickbeetlechar.getX();
		double Y = _clickbeetlechar.getY();
		jump = new Timeline(new KeyFrame(Duration.millis(30),(e)-> {
			_clickbeetlechar.setX(_clickbeetlechar.getX()+5);
			_clickbeetlechar.setScaleX(1);
			_clickbeetlechar.setScaleY(-1);
			_clickbeetlechar.setRotate(_clickbeetlechar.getRotate()+5);
			if(X - _clickbeetlechar.getX() < -90)
			{
				_clickbeetlechar.setY(_clickbeetlechar.getY()+23);
				
			}else
			{
				_clickbeetlechar.setY(_clickbeetlechar.getY()-23);
			}
			if(Y <= _clickbeetlechar.getY())
			{
				_clickbeetlechar.setScaleX(-1);
				_clickbeetlechar.setScaleY(1);
				_clickbeetlechar.setRotate(0);
				jump.stop();
			}
			if(_clickbeetlechar.getX() >1500)
			{
				jump.stop();
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("../views/Odontomachus.fxml"));
			    Parent Odontomachustype = null;
				try {
					Odontomachustype = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			    Scene OdontomachusScene = new Scene(Odontomachustype);
			    Odontomachus_controller OdontomachusCtrl = loadder.getController();
			    OdontomachusScene.setOnKeyPressed(OdontomachusCtrl.onKeyPressed);
			    final_film.mainStage.setScene(OdontomachusScene);
			}
		 }));
		jump.setCycleCount(Timeline.INDEFINITE);
		jump.play();
	}
	public EventHandler<KeyEvent> onKeyPressed = (e)->{
		if (e.getCode() == KeyCode.RIGHT) {
			_clickbeetlechar.setScaleX(-1);
			_clickbeetlechar.setX(_clickbeetlechar.getX() + 15);
			
			if(_clickbeetlechar.getX() >1500)
			{
				
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("../views/Odontomachus.fxml"));
			    Parent Odontomachustype = null;
				try {
					Odontomachustype = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			    Scene OdontomachusScene = new Scene(Odontomachustype);
			    Odontomachus_controller OdontomachusCtrl = loadder.getController();
			    OdontomachusScene.setOnKeyPressed(OdontomachusCtrl.onKeyPressed);
			    final_film.mainStage.setScene(OdontomachusScene);
			}
		}else if (e.getCode() == KeyCode.LEFT) {
			_clickbeetlechar.setScaleX(1);
			_clickbeetlechar.setRotate(0);
			_clickbeetlechar.setX(_clickbeetlechar.getX() - 15);
			
			
		}
		else if (e.getCode() == KeyCode.ENTER) {
			if(_clickbeetlechar.getY()==0)
			{
				animation();
			}
		}
	};
	
}
