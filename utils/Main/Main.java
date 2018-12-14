package Main;
 import java.io.IOException;
import java.util.ArrayList;

import Compress.compress;
import DragAndDrop.DragAndDropController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import MainWindow.MainWindowController;
import directory.createNewFolder;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
 public class Main extends Application {
 	private Stage primaryStage;
	private ArrayList<String> links = new ArrayList<String>();

 	
 	
 	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = new Stage();
		mainWindow();
		//DragAndDropPopUpWindow(); 
	}
 
 	public void DragAndDropPopUpWindow() {
		try {
			FXMLLoader DragAndDropLoader= new FXMLLoader(getClass().getClassLoader().getResource("\\DragAndDrop\\DragAndDropView.fxml"));
			AnchorPane DragAndDropPane = DragAndDropLoader.load();
			DragAndDropController DragAndDropController = DragAndDropLoader.getController();
			DragAndDropController.setMain(this);
			Scene DragAndDropScene=new Scene(DragAndDropPane);
			primaryStage.setScene(DragAndDropScene);
 		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
 	}
	
	
	public void mainWindow() {
		try {
			FXMLLoader MainWindowLoader= new FXMLLoader(getClass().getClassLoader().getResource("\\MainWindow\\MainWindowView.fxml"));
			AnchorPane MainWindowPane = MainWindowLoader.load();
			primaryStage.setMinHeight(400.00);
			primaryStage.setMinWidth(500.00);
			MainWindowController mainWindowController = MainWindowLoader.getController();
			mainWindowController.setMain(this);
			Scene scene=new Scene(MainWindowPane);
			primaryStage.setScene(scene);
			primaryStage.show();
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
 	public static void main(String[] args) {
		launch(args);
		Main main=new Main();
		main.compress();
		
	}
 	
	public void setLinkOfFiles(ArrayList<String> linkarray) {
		this.links.equals(linkarray);		
	}
 	
	public ArrayList<String> getLinks() {
		return links;
	}
	
	
	private void compress() {
		ArrayList<String> links=getLinks();
		createNewFolder createNewFolder= new createNewFolder();
		String linkOfNewFolder=createNewFolder.createFolder();
		for(int i =0; i<links.size();i++) {
		new compress(links.get(i),linkOfNewFolder);
		}
		
	}
}
