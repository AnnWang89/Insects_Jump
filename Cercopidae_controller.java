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
import javafx.util.Duration;

public class Cercopidae_controller {
	@FXML
    ImageView _Cercopidaechar;
	
	
	Timeline jump;
	public void animation () {
		double X = _Cercopidaechar.getX();
		double Y = _Cercopidaechar.getY();
		jump = new Timeline(new KeyFrame(Duration.millis(50),(e)-> {
			_Cercopidaechar.setX(_Cercopidaechar.getX()+15);
			if(X - _Cercopidaechar.getX() < -150)
			{
				_Cercopidaechar.setY(_Cercopidaechar.getY()+45);
			}else
			{
				_Cercopidaechar.setY(_Cercopidaechar.getY()-45);
			}
			if(Y <= _Cercopidaechar.getY())
			{
				jump.stop();
			}
			if(_Cercopidaechar.getX() > 1600)
			{
				jump.stop();
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("../views/Clickbeetle.fxml"));
			    Parent Clickbeetletype = null;
				try {
					Clickbeetletype = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			    Scene ClickbeetleScene = new Scene(Clickbeetletype);
			    Clickbeetle_controller ClickbeetleCtrl = loadder.getController();
			    ClickbeetleScene.setOnKeyPressed(ClickbeetleCtrl.onKeyPressed);
			    final_film.mainStage.setScene(ClickbeetleScene);
			}
		 }));
		jump.setCycleCount(Timeline.INDEFINITE);
		jump.play();
	}

	public EventHandler<KeyEvent> onKeyPressed = (e)->{
		if (e.getCode() == KeyCode.RIGHT) {
			_Cercopidaechar.setScaleX(-1);
			_Cercopidaechar.setRotate(0);
			_Cercopidaechar.setX(_Cercopidaechar.getX() + 15);
			if(_Cercopidaechar.getX() > 1600)
			{
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("../views/Clickbeetle.fxml"));
			    Parent Clickbeetletype = null;
				try {
					Clickbeetletype = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			    Scene ClickbeetleScene = new Scene(Clickbeetletype);
			    Clickbeetle_controller ClickbeetleCtrl = loadder.getController();
			    ClickbeetleScene.setOnKeyPressed(ClickbeetleCtrl.onKeyPressed);
			    final_film.mainStage.setScene(ClickbeetleScene);
			}
			
		}else if (e.getCode() == KeyCode.LEFT) {
			_Cercopidaechar.setScaleX(1);
			_Cercopidaechar.setRotate(0);
			_Cercopidaechar.setX(_Cercopidaechar.getX() - 15);
			
			
		}else if (e.getCode() == KeyCode.ENTER) {
			if(_Cercopidaechar.getY()==0)
			{
				animation();
			}
		}
	};

}
