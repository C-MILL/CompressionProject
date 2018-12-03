package views;

import java.io.IOException;

import DragAndDrop.DragAndDropController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import views.MainWindowController;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class MainWindowMain extends Application {


	@Override
	public void start(Stage primaryStage) {

	}

	public boolean mainWindow() {
		try {

			FXMLLoader loader = new FXMLLoader(MainWindowMain.class.getResource("MainWindow.fxml"));
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
		return ok;

	}

	public static void main(String[] args) {
		launch(args);
	}


	public boolean isOk() {
		return ok;
	}

	public void setOk(boolean ok) {
		this.ok = ok;
	}
}

