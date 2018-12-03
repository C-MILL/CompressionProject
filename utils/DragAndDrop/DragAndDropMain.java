package DragAndDrop;

import java.io.IOException;

import DragAndDrop.DragAndDropController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class DragAndDropMain extends Application {
	String[] links;



	@Override
	public void start(Stage primaryStage) {
		DragAndDropPopUpWindow();
	}

	

	public void DragAndDropPopUpWindow() {
		try {
			Stage DragAndDropStage = new Stage();
			FXMLLoader loader= new FXMLLoader(getClass().getClassLoader().getResource("\\DragAndDrop\\DragAndDropView.fxml"));
			/*FXMLLoader loader = new FXMLLoader(Main.class.getResource("\\DragAndDrop\\DragAndDropView.fxml"));*/
			AnchorPane pane = loader.load();
			DragAndDropStage.setMinHeight(400.00);
			DragAndDropStage.setMinWidth(500.00);
			DragAndDropController DragAndDropController = loader.getController();
			DragAndDropController.setMain(this);
			links=DragAndDropController.getLinks();
			Scene scene=new Scene(pane);
			DragAndDropStage.setScene(scene);
			DragAndDropStage.show();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	
	public String[] getLinks() {
		return links;
	}

	public static void main(String[] args) {
		launch(args);
	}

}

