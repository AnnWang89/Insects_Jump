package main;


import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import java.net.URL;



public class final_film extends Application {
	
	public static Stage mainStage;
	public static Scene mainScene;
	
	@Override

	public void start(Stage primaryStage) throws IOException{
		final_film.mainStage = primaryStage;
	    URL fxmlURL = this.getClass().getResource("../views/mainview.fxml");
	    FXMLLoader loader = new FXMLLoader(fxmlURL);
	    Parent main = loader.load();    
	    
	    mainScene = new Scene(main);
	    main_controller mainCtrl = loader.getController();
	    mainScene.setOnKeyPressed(mainCtrl.onKeyPressed);
	    mainStage.setTitle("©øÂÎ");//title name
	    mainStage.setScene(mainScene);//set scene to mainScene
	    mainStage.show();//show the Stage
	    
	}

	public static void main(String[] args) throws Exception{			
	  		launch(args);
	}
	

	
	
}