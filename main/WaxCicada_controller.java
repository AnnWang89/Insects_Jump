package main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.util.Duration;

public class WaxCicada_controller implements Initializable{
	@FXML
    ImageView _gearright;
	@FXML
    ImageView _gearleft;
	@FXML
    ImageView _waxcicadachar;
	public static Timeline Gear;
	public static Timeline jump;
	
	public void initialize(URL arg0, ResourceBundle arg1) { 
		Gear = new Timeline(new KeyFrame(Duration.millis(100),(e)-> {
			_gearright.setRotate(_gearright.getRotate()+5);
			_gearleft.setRotate(_gearleft.getRotate()-5);
			//System.out.print("IN");
		 }));
		Gear.setCycleCount(Timeline.INDEFINITE);
		Gear.play();
	}
	public void animation (){
		double X = _waxcicadachar.getX();
		double Y = _waxcicadachar.getY();
		jump = new Timeline(new KeyFrame(Duration.millis(1000/25),(e)-> {
			_waxcicadachar.setX(_waxcicadachar.getX()+10);
			if(X - _waxcicadachar.getX() < -180)
			{
				_waxcicadachar.setY(_waxcicadachar.getY()+18);
			}else
			{
				_waxcicadachar.setY(_waxcicadachar.getY()-18);
			}
			if(Y == _waxcicadachar.getY())
			{
				System.out.println("X="+_waxcicadachar.getX());
				jump.stop();
			}
			if(_waxcicadachar.getX() > 1500)
			{
				jump.stop();
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("../views/Collembola.fxml"));
				Parent Collembolatype = null;
				try {
					Collembolatype = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Scene CollembolaScene = new Scene(Collembolatype);
				Collembola_controller CollembolaCtrl = loadder.getController();
				CollembolaScene.setOnKeyPressed(CollembolaCtrl.onKeyPressed);
				final_film.mainStage.setScene(CollembolaScene);
			}
		 }));
		jump.setCycleCount(Timeline.INDEFINITE);
		jump.play();
	}
	public EventHandler<KeyEvent> onKeyPressed = (e)->{
		if (e.getCode() == KeyCode.RIGHT) {
			_waxcicadachar.setScaleX(-1);
			_waxcicadachar.setRotate(0);
			_waxcicadachar.setX(_waxcicadachar.getX() + 15);
			if(_waxcicadachar.getX() > 1500 ) {
				System.out.println("X="+_waxcicadachar.getX());
				System.out.println("Y="+_waxcicadachar.getY());
				FXMLLoader loadder = new FXMLLoader(getClass().getResource("../views/Collembola.fxml"));
				Parent Collembolatype = null;
				try {
					Collembolatype = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Scene CollembolaScene = new Scene(Collembolatype);
				Collembola_controller CollembolaCtrl = loadder.getController();
				CollembolaScene.setOnKeyPressed(CollembolaCtrl.onKeyPressed);
				final_film.mainStage.setScene(CollembolaScene);
			}
			
		}else if (e.getCode() == KeyCode.LEFT) {
			_waxcicadachar.setScaleX(1);
			_waxcicadachar.setRotate(0);
			_waxcicadachar.setX(_waxcicadachar.getX() - 15);
			if(_waxcicadachar.getX() > -1455 ) {
				System.out.println("X="+_waxcicadachar.getX());
				System.out.println("Y="+_waxcicadachar.getY());
			}
			
		}else if (e.getCode() == KeyCode.ENTER) {
			if(_waxcicadachar.getY()==0)
			{
				animation();
			}
			
		}else if (e.getCode() == KeyCode.LEFT) {
			_waxcicadachar.setScaleX(1);
			_waxcicadachar.setRotate(0);
			_waxcicadachar.setX(_waxcicadachar.getX() - 15);
			
			
		}
	};

}
