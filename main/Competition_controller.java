package main;

import java.io.IOException;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class Competition_controller {

	@FXML
	Rectangle _dark;
	@FXML
    ImageView _chan1;
	@FXML
    ImageView _chan2;
	@FXML
    Text _far;
	@FXML
    Text _high;
	@FXML
    ImageView _fleachar;
	@FXML
    ImageView _Cercopidaechar;
	@FXML
    ImageView _clickbeetlechar;
	@FXML
    ImageView _odontomachuschar;
	@FXML
    ImageView _waxcicadachar;
	@FXML
    ImageView _collembolachar;
	@FXML
    ImageView _collembolachar2;
	@FXML
    ImageView _collembolachar3;
	@FXML
	Text _flag;
	@FXML
	Text _jumpcom;
	@FXML
	Text _jumpfinal;
	@FXML
	Text _work;
	@FXML
	Text _teacher;
	int num=0;
	int start = 0; 
	Timeline jumpflea;
	Timeline jumpCercopidae;
	Timeline jumpClickbeetle;
	Timeline jumpOdontomachus;
	Timeline jumpWaxCicada;
	Timeline jumpcollembola;
	boolean stopornot = true;
	public void animationflea () {
		double X = _fleachar.getX();
		double Y = _fleachar.getY();
		jumpflea = new Timeline(new KeyFrame(Duration.millis(60),(e)-> {
			_fleachar.setX(_fleachar.getX()+20);
			if(X - _fleachar.getX() < -440)
			{
				_fleachar.setY(_fleachar.getY()+10);
			}else
			{
				if(X - _fleachar.getX() == -440 &&stopornot)
				{
					jumpflea.stop();
					System.out.println("fleaY= "+_fleachar.getY());
				}
				_fleachar.setY(_fleachar.getY()-10);
			}
			if(Y == _fleachar.getY())
			{
				System.out.println("fleaX= "+_fleachar.getX());
				
				jumpflea.stop();
			}
			
		 }));
		jumpflea.setCycleCount(Timeline.INDEFINITE);
		jumpflea.play();
	}
	public void animationCercopidae () {
		double X = _Cercopidaechar.getX();
		double Y = _Cercopidaechar.getY();
		jumpCercopidae = new Timeline(new KeyFrame(Duration.millis(70),(e)-> {
			_Cercopidaechar.setX(_Cercopidaechar.getX()+15);
			if(X - _Cercopidaechar.getX() < -150)
			{
				_Cercopidaechar.setY(_Cercopidaechar.getY()+45);
			}else
			{
				if(X - _Cercopidaechar.getX() == -150&&stopornot)
				{
					
					System.out.println("CercopidaeY= "+_Cercopidaechar.getY());
					jumpCercopidae.stop();
				}
				_Cercopidaechar.setY(_Cercopidaechar.getY()-45);
			}
			if(Y == _Cercopidaechar.getY())
			{
				System.out.println("CercopidaeX= "+_Cercopidaechar.getX());
				
				jumpCercopidae.stop();
			}
			
		 }));
		jumpCercopidae.setCycleCount(Timeline.INDEFINITE);
		jumpCercopidae.play();
	}
	public void animationClickbeetle () {
		double X = _clickbeetlechar.getX();
		double Y = _clickbeetlechar.getY();
		jumpClickbeetle = new Timeline(new KeyFrame(Duration.millis(70),(e)-> {
			_clickbeetlechar.setX(_clickbeetlechar.getX()+5);
			_clickbeetlechar.setScaleX(1);
			_clickbeetlechar.setScaleY(-1);
			_clickbeetlechar.setRotate(_clickbeetlechar.getRotate()+5);
			if(X - _clickbeetlechar.getX() < -90)
			{
				_clickbeetlechar.setY(_clickbeetlechar.getY()+23);
				
			}else
			{
				if(X - _clickbeetlechar.getX() == -90)
				{
					jumpClickbeetle.stop();
					System.out.println("clickbeetleY= "+_clickbeetlechar.getY());
				}
				_clickbeetlechar.setY(_clickbeetlechar.getY()-23);
			}
			if(Y <= _clickbeetlechar.getY())
			{
				_clickbeetlechar.setScaleX(-1);
				_clickbeetlechar.setScaleY(1);
				_clickbeetlechar.setRotate(0);
				System.out.println("clickbeetleX= "+_clickbeetlechar.getX());
				
				jumpClickbeetle.stop();
			}
			
		 }));
		jumpClickbeetle.setCycleCount(Timeline.INDEFINITE);
		jumpClickbeetle.play();
	}
	public void animationOdontomachus () {
		double X = _odontomachuschar.getX();
		double Y = _odontomachuschar.getY();
		int xplus = 8;
		jumpOdontomachus = new Timeline(new KeyFrame(Duration.millis(60),(e)-> {
			_odontomachuschar.setX(_odontomachuschar.getX()+xplus);
			_odontomachuschar.setRotate(_odontomachuschar.getRotate()+10);
			//System.out.println("X="+(_odontomachuschar.getX()-X));
			//System.out.println("Y="+(_odontomachuschar.getY()-Y));
			if(_odontomachuschar.getX()- X > xplus*36 )
			{
				_odontomachuschar.setY(_odontomachuschar.getY()+7);
			}else  
			{
				if(_odontomachuschar.getX()- X == xplus*36)
				{
					jumpOdontomachus.stop();
					System.out.println("odontomachusY= "+_odontomachuschar.getY());
				}
				_odontomachuschar.setY(_odontomachuschar.getY()-7);
			}
			if(Y == _odontomachuschar.getY() )
			{
				_odontomachuschar.setRotate(0);
				System.out.println("odontomachusX= "+_odontomachuschar.getX());
				jumpOdontomachus.stop();
			}
			
		 }));
		jumpOdontomachus.setCycleCount(Timeline.INDEFINITE);
		jumpOdontomachus.play();
	}
	public void animationWaxCicada(){
		double X = _waxcicadachar.getX();
		double Y = _waxcicadachar.getY();
		jumpWaxCicada = new Timeline(new KeyFrame(Duration.millis(70),(e)-> {
			_waxcicadachar.setX(_waxcicadachar.getX()+10);
			if(X - _waxcicadachar.getX() < -180)
			{
				_waxcicadachar.setY(_waxcicadachar.getY()+18);
			}else
			{
				if(X - _waxcicadachar.getX() == -180)
				{
					System.out.println("waxcicadaY="+_waxcicadachar.getY());
					jumpWaxCicada.stop();
				}
				_waxcicadachar.setY(_waxcicadachar.getY()-18);
			}
			if(Y == _waxcicadachar.getY())
			{
				System.out.println("waxcicadaX="+_waxcicadachar.getX());
				jumpWaxCicada.stop();
			}
			
		 }));
		jumpWaxCicada.setCycleCount(Timeline.INDEFINITE);
		jumpWaxCicada.play();
	}
	public void animationcollembola() {
		double X = _collembolachar.getX();
		double Y = _collembolachar.getY();
		int xfar = 23;
		jumpcollembola = new Timeline(new KeyFrame(Duration.millis(70),(e)-> {
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
				if(_collembolachar.getX()- X == 12*xfar)
				{
					jumpcollembola.stop();
					System.out.println("collembolaY="+_collembolachar.getY());
				}
				_collembolachar.setY(_collembolachar.getY()+15);
			}
			if(Y == _collembolachar.getY())
			{
				_collembolachar.setVisible(true);
				_collembolachar2.setVisible(false);
				_collembolachar3.setVisible(false);
				System.out.println("collembolaX="+_collembolachar.getX());
				jumpcollembola.stop();
			}
			
		 }));
		jumpcollembola.setCycleCount(Timeline.INDEFINITE);
		jumpcollembola.play();
	}
	public EventHandler<KeyEvent> onKeyPressed = (e)->{
		if (e.getCode() == KeyCode.RIGHT) {
			if(num==0)
			{
				_flag.setVisible(false);
				_jumpcom.setVisible(true);
				
				
			}else if(num==1)
			{
				_jumpcom.setVisible(false);
				_jumpfinal.setVisible(true);
				
				
			}else if(num==2)
			{
				
				_jumpfinal.setVisible(false);
				_work.setVisible(true);
				
			}else if(num==3)
			{
				_work.setVisible(false);
				_teacher.setVisible(true);
			}
			num++;
		}
		else if (e.getCode() == KeyCode.ENTER) {
			if(start==0)
			{
				start ++;
				animationflea();
				animationCercopidae();				
				animationClickbeetle();
				animationOdontomachus();
				animationWaxCicada();
				animationcollembola();
				
			}
			
		}else if (e.getCode() == KeyCode.UP) {
			if(start == 1)
			{
				start ++;
				jumpflea.play();
				jumpCercopidae.play();				
				jumpClickbeetle.play();
				jumpOdontomachus.play();
				jumpWaxCicada.play();
				jumpcollembola.play();
				
			}else if(start == 2)
			{
				_fleachar.setX(_fleachar.getX()+20);
				_Cercopidaechar.setX(_Cercopidaechar.getX()+40);
				_clickbeetlechar.setX(_clickbeetlechar.getX()+50);
				_odontomachuschar.setX(_odontomachuschar.getX()+30);
				_waxcicadachar.setX(_waxcicadachar.getX()+40);
				_collembolachar.setX(_collembolachar.getX()+30);
				stopornot = false;
			}else if(start == 3)
			{
				_chan1.setX(_fleachar.getX());
				_chan2.setX(_Cercopidaechar.getX());
				_far.setX(_fleachar.getX());
				_high.setX(_Cercopidaechar.getX());
				_chan1.setY(_fleachar.getY());
				_chan2.setY(_Cercopidaechar.getY());
				_far.setY(_fleachar.getY());
				_high.setY(_Cercopidaechar.getY());
				_chan1.setVisible(true);
				_chan2.setVisible(true);
				_far.setVisible(true);
				_high.setVisible(true);
				start++;
			}else if(start == 4)
			{
				
				_fleachar.setX(_fleachar.getX()+20);
				_Cercopidaechar.setX(_Cercopidaechar.getX()+40);
				_chan1.setX(_fleachar.getX());
				_chan2.setX(_Cercopidaechar.getX());
				_far.setX(_fleachar.getX());
				_high.setX(_Cercopidaechar.getX());
				
			}
		}else if (e.getCode() == KeyCode.DOWN) {
			_fleachar.setX(0);
			_Cercopidaechar.setX(150);
			_fleachar.setY(132);
			_Cercopidaechar.setY(100);
			animationflea();
			animationCercopidae();		
			start ++;
			
			
			
		}else if (e.getCode() == KeyCode.LEFT) {
			_dark.setOpacity(_dark.getOpacity()+0.1);
			
			
			
		}
	};

}
