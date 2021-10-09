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

public class Collembola_controller implements Initializable{

	@FXML
    ImageView _collembolachar;
	@FXML
    ImageView _collembolachar2;
	@FXML
    ImageView _collembolachar3;
	@FXML
    ImageView _Collembola1;
	@FXML
    ImageView _Collembola2;
	
	Timeline jump;
	Timeline change;
	public void initialize(URL arg0, ResourceBundle arg1) { 
		change = new Timeline(
				new KeyFrame(Duration.millis(500), (e) -> {
					if(_Collembola1.isVisible())
				    {
				    	_Collembola1.setVisible(false);
				    	_Collembola2.setVisible(true);
				    }else
				    {
				    	_Collembola1.setVisible(true);
				    	_Collembola2.setVisible(false);
				    }
		  }));
		change.setCycleCount(Timeline.INDEFINITE);//will keep reset 
		change.play();
	}
	public void animation () {
		double X = _collembolachar.getX();
		double Y = _collembolachar.getY();
		int xfar = 23;
		jump = new Timeline(new KeyFrame(Duration.millis(50),(e)-> {
			_collembolachar.setScaleX(1);
			_collembolachar.setX(_collembolachar.getX()+xfar);
			_collembolachar2.setX(_collembolachar.getX());
			_collembolachar2.setY(_collembolachar.getY());
			_collembolachar3.setX(_collembolachar.getX());
			_collembolachar3.setY(_collembolachar.getY());
			if(_collembolachar.getX() - X < 12*xfar)
			{
				if(_collembolachar.getX()- X > 3*xfar && _collembolachar.getX()- X <= 8*xfar)
				{
					_collembolachar.setVisible(false);
					_collembolachar2.setVisible(true);
					_collembolachar3.setVisible(false);
				}else if(_collembolachar.getX()- X > 0 && _collembolachar.getX()- X <= 3*xfar)
				{
					_collembolachar.setVisible(true);
					_collembolachar2.setVisible(false);
					_collembolachar3.setVisible(false);
				}else
				{
					_collembolachar.setVisible(false);
					_collembolachar2.setVisible(false);
					_collembolachar3.setVisible(true);
					_collembolachar3.setRotate(_collembolachar3.getRotate()+30);
				}
				_collembolachar.setY(_collembolachar.getY()-15);
				
			}else
			{
				if(_collembolachar.getX()- X >= 12*xfar && _collembolachar.getX()- X < 16*xfar)
				{
					_collembolachar.setVisible(false);
					_collembolachar2.setVisible(false);
					_collembolachar3.setVisible(true);
					_collembolachar3.setRotate(_collembolachar3.getRotate()+30);
				}else if(_collembolachar.getX()- X > 21*xfar )
				{
					_collembolachar.setVisible(true);
					_collembolachar2.setVisible(false);
					_collembolachar3.setVisible(false);
				}else
				{
					_collembolachar.setVisible(false);
					_collembolachar2.setVisible(true);
					_collembolachar3.setVisible(false);
				}
				
				_collembolachar.setY(_collembolachar.getY()+15);
			}
			if(Y == _collembolachar.getY())
			{
				_collembolachar.setVisible(true);
				_collembolachar2.setVisible(false);
				_collembolachar3.setVisible(false);
				System.out.println("collembolaX="+_collembolachar.getX());
				jump.stop();
			}
			if(_collembolachar.getX() >1500)
			{
				jump.stop();
				 FXMLLoader loadder = new FXMLLoader(getClass().getResource("../views/Competition.fxml"));
				 Parent Competitiontype = null;
				try {
					Competitiontype = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 Scene CompetitionScene = new Scene(Competitiontype);
				 Competition_controller CompetitionCtrl = loadder.getController();
				 CompetitionScene.setOnKeyPressed(CompetitionCtrl.onKeyPressed);
				 final_film.mainStage.setScene(CompetitionScene);
			}
		 }));
		jump.setCycleCount(Timeline.INDEFINITE);
		jump.play();
	}
	public EventHandler<KeyEvent> onKeyPressed = (e)->{
		if (e.getCode() == KeyCode.RIGHT) {
			_collembolachar.setScaleX(-1);
			//_collembolachar.setRotate(0);
			_collembolachar.setX(_collembolachar.getX() + 15);
			if(_collembolachar.getX() >1500)
			{
				
				 FXMLLoader loadder = new FXMLLoader(getClass().getResource("../views/Competition.fxml"));
				 Parent Competitiontype = null;
				try {
					Competitiontype = loadder.load();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 Scene CompetitionScene = new Scene(Competitiontype);
				 Competition_controller CompetitionCtrl = loadder.getController();
				 CompetitionScene.setOnKeyPressed(CompetitionCtrl.onKeyPressed);
				 final_film.mainStage.setScene(CompetitionScene);
			}
		}
		else if (e.getCode() == KeyCode.ENTER) {
			if(_collembolachar.getY()==0)
			{
				animation();
			}
		}else if (e.getCode() == KeyCode.UP) {
			_collembolachar.setX(0);
			_collembolachar.setY(0);
		}else if (e.getCode() == KeyCode.LEFT) {
			_collembolachar.setScaleX(1);
			_collembolachar.setRotate(0);
			_collembolachar.setX(_collembolachar.getX() - 15);
			
			
		}
	};
}
