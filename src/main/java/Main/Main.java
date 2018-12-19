package Main;
import java.io.IOException;
import java.util.ArrayList;

import Compress.compress;
import DragAndDrop.DragAndDropController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import MainWindow.MainWindowController;
import Progress.progressController;
import directory.createNewFolder;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
public class Main extends Application {
	private Stage primaryStage;
	private ArrayList<String> links = new ArrayList<String>();
	private int doneNumber;
	private int toDoNumber;
	progressController progressController = new progressController();



	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = new Stage();
		mainWindow();
	}



	//Windows

	public void mainWindow() {
		try {
			FXMLLoader MainWindowLoader= new FXMLLoader(MainWindowController.class.getResource("MainWindowView.fxml"));
		//	FXMLLoader MainWindowLoader= new FXMLLoader(getClass().getClassLoader().getResource("\\MainWindow\\MainWindowView.fxml"));
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

	public void DragAndDropPopUpWindow() {
		try {
			FXMLLoader DragAndDropLoader= new FXMLLoader(DragAndDropController.class.getResource("DragAndDropView.fxml"));
			//FXMLLoader DragAndDropLoader= new FXMLLoader(getClass().getClassLoader().getResource("\\DragAndDrop\\DragAndDropView.fxml"));
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

	public void progress() {
		try {
			FXMLLoader progressLoader= new FXMLLoader(progressController.class.getResource("progressView.fxml"));
			//FXMLLoader progressLoader= new FXMLLoader(getClass().getClassLoader().getResource("\\Progress\\progressView.fxml"));
			AnchorPane progressPane = progressLoader.load();
			progressController= progressLoader.getController();
			progressController.setMain(this);
			progressController.setAll(getDoneNumber(), getNumberToDo());
			Scene progressScene=new Scene(progressPane);
			primaryStage.setScene(progressScene);
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//Methods
	public void compress() {

		createNewFolder createNewFolder= new createNewFolder();
		String linkOfNewFolder=createNewFolder.createFolder();
		
		setNumberToDo(getLinks().size());
		progress();
		for (int i = 0; i < getLinks().size(); i++) {
			setDoneNumber(i);
			progressController.setAll(getDoneNumber(), getNumberToDo());
			new compress(links.get(i), linkOfNewFolder);
			new compress(links.get(i), linkOfNewFolder);
		}
	}

	//Setter and Getter

	public void setLinks(ArrayList<String> linkarray) {
		links.addAll(linkarray);

	}


	public ArrayList<String> getLinks() {
		return links;


	}







	public int getDoneNumber() {
		return doneNumber;
	}
	public int getNumberToDo(){
		return toDoNumber;
	}
	private void setDoneNumber(int i) {
		doneNumber=i;

	}

	public void setNumberToDo(int size) {
		toDoNumber=size;

	}


}

