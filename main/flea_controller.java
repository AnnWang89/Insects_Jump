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
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.util.Duration;

public class flea_controller {
	@FXML
    ImageView _fleapic;
	@FXML
    ImageView _fleachar;

	Timeline jump;
	
	public void animation () {
		double X = _fleachar.getX();
		double Y = _fleachar.getY();
		jump = new Timeline(new KeyFrame(Duration.millis(20),(e)-> {
			_fleachar.setX(_fleachar.getX()+20);
			if(X - _fleachar.getX() < -440)
			{
				_fleachar.setY(_fleachar.getY()+10);
			}else
			{
				_fleachar.setY(_fleachar.getY()-10);
			}
			if(Y <= _fleachar.getY())
			{
				jump.stop();
			}
			if(_fleachar.getX()>1400)
			{
				jump.stop();
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("../views/Cercopidae.fxml"));
			    Parent Cercopidaetype = null;
				try {
					Cercopidaetype = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			    Scene CercopidaeScene = new Scene(Cercopidaetype);
			    Cercopidae_controller CercopidaeCtrl = loadder.getController();
			    CercopidaeScene.setOnKeyPressed(CercopidaeCtrl.onKeyPressed);
			    final_film.mainStage.setScene(CercopidaeScene);
			}
		 }));
		jump.setCycleCount(Timeline.INDEFINITE);
		jump.play();
	}
	public EventHandler<KeyEvent> onKeyPressed = (e)->{
		if (e.getCode() == KeyCode.RIGHT) {
			_fleachar.setScaleX(-1);
			_fleachar.setRotate(0);
			_fleachar.setX(_fleachar.getX() + 15);
			if(_fleachar.getX() > 1500 ) {
				
				System.out.println("X="+_fleachar.getX());
				System.out.println("Y="+_fleachar.getY());
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("../views/Cercopidae.fxml"));
			    Parent Cercopidaetype = null;
				try {
					Cercopidaetype = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			    Scene CercopidaeScene = new Scene(Cercopidaetype);
			    Cercopidae_controller CercopidaeCtrl = loadder.getController();
			    CercopidaeScene.setOnKeyPressed(CercopidaeCtrl.onKeyPressed);
			    final_film.mainStage.setScene(CercopidaeScene);
			}
			
		}else if (e.getCode() == KeyCode.LEFT) {
			_fleachar.setScaleX(1);
			_fleachar.setRotate(0);
			_fleachar.setX(_fleachar.getX() - 15);
			
		}
		/*
		else if (e.getCode() == KeyCode.UP) {
			if(_fleachar.getY() > -765 ) {
				_fleachar.setY(_fleachar.getY() - 15);
				System.out.println("X="+_fleachar.getX());
				System.out.println("Y="+_fleachar.getY());
			}
			if(_fleachar.getScaleX() == 1) {
				_fleachar.setRotate(90);
			}else {
				_fleachar.setRotate(-90);
			}
		}else if (e.getCode() == KeyCode.DOWN) {
			if(_fleachar.getY() < -15 ) {
				_fleachar.setY(_fleachar.getY() + 15);
				System.out.println("X="+_fleachar.getX());
				System.out.println("Y="+_fleachar.getY());
			}
			if(_fleachar.getScaleX() == 1) {
				_fleachar.setRotate(-90);
			}else {
				_fleachar.setRotate(90);
			}
			
		}
		*/
		else if (e.getCode() == KeyCode.ENTER) {
			if(_fleachar.getY()==0)
			{
				animation();
			}
		}
	};

}
