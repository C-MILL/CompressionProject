package Main;

import javafx.application.Application;
import javafx.stage.Stage;



public class Main extends Application {



	DragAndDrop.DragAndDropMain DADO=new DragAndDrop.DragAndDropMain();
	
	

	@Override
	public void start(Stage primaryStage) {
		DADO.DragAndDropPopUpWindow();
		String[] links=DADO.getLinks();
		//System.out.println(links[0]);
	}


	public static void main(String[] args) {
		launch(args);
	}


}

