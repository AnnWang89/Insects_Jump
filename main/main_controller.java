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
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class main_controller {
	
	@FXML
    Polygon _light1;
	@FXML
    Polygon _light2;
	@FXML
    Polygon _light3;
	@FXML
    Polygon _light4;
	@FXML
    Polygon _light5;
	@FXML
    Polygon _light6;
	@FXML
	ImageView _char1;
	@FXML
	ImageView _char2;
	@FXML
	ImageView _char3;
	@FXML
	ImageView _char4;
	@FXML
	ImageView _char5;
	@FXML
	ImageView _char6;
	
	
	int choose;
	boolean in=true;
	public EventHandler<KeyEvent> onKeyPressed = (e)->{
		if (e.getCode() == KeyCode.ENTER) {
			
			FXMLLoader loadder = new FXMLLoader(getClass().getResource("../views/flea.fxml"));
		    Parent fleastype = null;
			try {
				fleastype = loadder.load();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		    Scene fleaScene = new Scene(fleastype);
		    flea_controller fleaCtrl = loadder.getController();
		    fleaScene.setOnKeyPressed(fleaCtrl.onKeyPressed);
		    final_film.mainStage.setScene(fleaScene);
		    
		}else if (e.getCode() == KeyCode.UP) {
			choose =(int) (Math.random()*10);
			if(choose%2==1)
			{
				_light1.setVisible(false);
				_char1.setScaleX(-1);
				_char1.setX(_char1.getX()+5);
			}else 
			{
				_light1.setVisible(true);
				if(in)
				{
					_char1.setScaleX(1);
					_char1.setX(_char1.getX()-5);
				}else
				{
					_char1.setScaleX(-1);
					_char1.setX(_char1.getX()+23);
				}
				
			}
			
			choose =(int) (Math.random()*10);
			if(choose%2==1)
			{
				_light2.setVisible(false);
				_char2.setScaleX(-1);
				_char2.setX(_char2.getX()+5);
			}else 
			{
				_light2.setVisible(true);
				if(in)
				{
					_char2.setScaleX(1);
					_char2.setX(_char2.getX()-5);
				}else
				{
					_char2.setScaleX(-1);
					_char2.setX(_char2.getX()+20);
				}
				
			}
			
			choose =(int) (Math.random()*10);
			if(choose%2==1)
			{
				_light3.setVisible(false);
				_char3.setScaleX(-1);
				_char3.setX(_char3.getX()+5);
			}else 
			{
				_light3.setVisible(true);
				
				if(in)
				{
					_char3.setScaleX(1);
					_char3.setX(_char3.getX()-5);
				}else
				{
					_char3.setScaleX(-1);
					_char3.setX(_char3.getX()+15);
				}
			}
			choose =(int) (Math.random()*10);
			if(choose%2==1)
			{
				_light4.setVisible(false);
				_char4.setScaleX(-1);
				_char4.setX(_char4.getX()+5);
			}else 
			{
				_light4.setVisible(true);
				
				if(in)
				{
					_char4.setScaleX(1);
					_char4.setX(_char4.getX()-5);
				}else
				{
					_char4.setScaleX(-1);
					_char4.setX(_char4.getX()+13);
				}
			}
			choose =(int) (Math.random()*10);
			if(choose%2==1)
			{
				_light5.setVisible(false);
				_char5.setScaleX(-1);
				_char5.setX(_char5.getX()+5);
			}else 
			{
				_light5.setVisible(true);
				
				if(in)
				{
					_char5.setScaleX(1);
					_char5.setX(_char5.getX()-5);
				}else
				{
					_char5.setScaleX(-1);
					_char5.setX(_char5.getX()+20);
				}
			}
			
			choose =(int) (Math.random()*10);
			if(choose%2==1)
			{
				_light6.setVisible(false);
				_char6.setScaleX(-1);
				_char6.setX(_char6.getX()+5);
			}else 
			{
				_light6.setVisible(true);
				_char6.setScaleX(1);
				_char6.setX(_char6.getX()-4);
				if(in)
				{
					_char6.setScaleX(1);
					_char6.setX(_char6.getX()-5);
				}else
				{
					_char6.setScaleX(-1);
					_char6.setX(_char6.getX()+25);
				}
			}

		    
		}else if (e.getCode() == KeyCode.DOWN) {
			choose =(int) (Math.random()*10);
			if(choose%3==1)
			{
				_light1.setFill(Color.LIGHTBLUE);
			}else if (choose%3==2)
			{
				_light1.setFill(Color.LIGHTYELLOW);
			}else
			{
				_light1.setFill(Color.LIGHTGREEN);
			}
			
			choose =(int) (Math.random()*10);
			if(choose%3==1)
			{
				_light2.setFill(Color.LIGHTBLUE);
			}else if (choose%3==2)
			{
				_light2.setFill(Color.LIGHTYELLOW);
			}else
			{
				_light2.setFill(Color.LIGHTGREEN);
			}
			choose =(int) (Math.random()*10);
			if(choose%3==1)
			{
				_light3.setFill(Color.LIGHTBLUE);
			}else if (choose%3==2)
			{
				_light3.setFill(Color.LIGHTYELLOW);
			}else
			{
				_light3.setFill(Color.LIGHTGREEN);
			}
			choose =(int) (Math.random()*10);
			if(choose%3==1)
			{
				_light4.setFill(Color.LIGHTBLUE);
			}else if (choose%3==2)
			{
				_light4.setFill(Color.LIGHTYELLOW);
			}else
			{
				_light4.setFill(Color.LIGHTGREEN);
			}
			
			choose =(int) (Math.random()*10);
			if(choose%3==1)
			{
				_light5.setFill(Color.LIGHTBLUE);
			}else if (choose%3==2)
			{
				_light5.setFill(Color.LIGHTYELLOW);
			}else
			{
				_light5.setFill(Color.LIGHTGREEN);
			}
			
			choose =(int) (Math.random()*10);
			if(choose%3==1)
			{
				_light6.setFill(Color.LIGHTBLUE);
			}else if (choose%3==2)
			{
				_light6.setFill(Color.LIGHTYELLOW);
			}else
			{
				_light6.setFill(Color.LIGHTGREEN);
			}
		    if(!in)
		    {
		    	_char1.setScaleX(-1);
				_char1.setX(_char1.getX()+23);
				_char2.setScaleX(-1);
				_char2.setX(_char2.getX()+20);
				_char3.setScaleX(-1);
				_char3.setX(_char3.getX()+15);
				_char4.setScaleX(-1);
				_char4.setX(_char4.getX()+13);
				_char5.setScaleX(-1);
				_char5.setX(_char5.getX()+20);
				_char6.setScaleX(-1);
				_char6.setX(_char6.getX()+25);
		    }
		}else if (e.getCode() == KeyCode.LEFT)
		{
			in = false;
		}
	};
	

}
