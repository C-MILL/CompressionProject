package Main;
 import java.io.IOException;
 import DragAndDrop.DragAndDropController;
import Main.MainWindowController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
 public class Main extends Application {
 	private Stage primaryStage;
 	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = new Stage();
		DragAndDropPopUpWindow();
		//mainWindow();
	}
 	public void mainWindow() {
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("MainWindow.fxml"));
			AnchorPane pane = loader.load();
			primaryStage.setMinHeight(400.00);
			primaryStage.setMinWidth(500.00);
			MainWindowController mainWindowController = loader.getController();
			mainWindowController.setMain(this);
			Scene scene=new Scene(pane);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	}
	
	public void DragAndDropPopUpWindow() {
		try {
			FXMLLoader loader= new FXMLLoader(getClass().getClassLoader().getResource("\\DragAndDrop\\DragAndDropView.fxml"));
			/*FXMLLoader loader = new FXMLLoader(Main.class.getResource("\\DragAndDrop\\DragAndDropView.fxml"));*/
			AnchorPane pane = loader.load();
			primaryStage.setMinHeight(400.00);
			primaryStage.setMinWidth(500.00);
			DragAndDropController DragAndDropController = loader.getController();
			DragAndDropController.setMain(this);
			Scene scene=new Scene(pane);
			primaryStage.setScene(scene);
			primaryStage.show();
 		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
 	}
 	public static void main(String[] args) {
		launch(args);
	}
}
