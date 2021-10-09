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

public class Odontomachus_controller {

	@FXML
    ImageView _odontomachuschar;
	Timeline jump;
	public void animation () {
		double X = _odontomachuschar.getX();
		double Y = _odontomachuschar.getY();
		int xplus = 10;
		jump = new Timeline(new KeyFrame(Duration.millis(20),(e)-> {
			_odontomachuschar.setX(_odontomachuschar.getX()+ xplus);
			_odontomachuschar.setRotate(_odontomachuschar.getRotate()+10);
			System.out.println("X="+(_odontomachuschar.getX()-X));
			System.out.println("Y="+(_odontomachuschar.getY()-Y));
			if(_odontomachuschar.getX()- X >  xplus*36 )
			{
				_odontomachuschar.setY(_odontomachuschar.getY()+7);
			}else  
			{
				_odontomachuschar.setY(_odontomachuschar.getY()-7);
			}
			if(Y == _odontomachuschar.getY())
			{
				_odontomachuschar.setRotate(0);
				jump.stop();
			}
			if(_odontomachuschar.getX() > 1500)
			{
				jump.stop();
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("../views/WaxCicada.fxml"));
			    Parent WaxCicadatype = null;
				try {
					WaxCicadatype = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			    Scene WaxCicadaScene = new Scene(WaxCicadatype);
			    WaxCicada_controller WaxCicadaCtrl = loadder.getController();
			    WaxCicadaScene.setOnKeyPressed(WaxCicadaCtrl.onKeyPressed);
			    final_film.mainStage.setScene(WaxCicadaScene);
			}
		 }));
		jump.setCycleCount(Timeline.INDEFINITE);
		jump.play();
	}
	public EventHandler<KeyEvent> onKeyPressed = (e)->{
		if (e.getCode() == KeyCode.RIGHT) {
			_odontomachuschar.setScaleX(-1);
			_odontomachuschar.setX(_odontomachuschar.getX() + 15);
			
			if(_odontomachuschar.getX() > 1500)
			{
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("../views/WaxCicada.fxml"));
			    Parent WaxCicadatype = null;
				try {
					WaxCicadatype = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			    Scene WaxCicadaScene = new Scene(WaxCicadatype);
			    WaxCicada_controller WaxCicadaCtrl = loadder.getController();
			    WaxCicadaScene.setOnKeyPressed(WaxCicadaCtrl.onKeyPressed);
			    final_film.mainStage.setScene(WaxCicadaScene);
			}
		}else if (e.getCode() == KeyCode.LEFT) {
			_odontomachuschar.setScaleX(1);
			_odontomachuschar.setRotate(0);
			_odontomachuschar.setX(_odontomachuschar.getX() - 15);
			
			
		}else if (e.getCode() == KeyCode.ENTER) {
			if(_odontomachuschar.getY()==0)
			{
				animation();
				//_odontomachuschar.setRotate(180);
				//animation();		
				//_odontomachuschar.setRotate(0);
				
			}
		}
	};
	


}
