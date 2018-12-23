package Main;
import java.io.IOException;
import java.util.ArrayList;

import DragAndDrop.DragAndDropController;
import ErrorMessagePopUp.ErrorMessageController;
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
	public Stage ErrorStage;
	private ArrayList<String> links = new ArrayList<String>();
	private int doneNumber;
	private int toDoNumber;
	progressController progressController = new progressController();
	DragAndDropController DragAndDropController = new DragAndDropController();
	ErrorMessageController ErrorMessageController = new ErrorMessageController();

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = new Stage();
		this.ErrorStage = new Stage();
		mainWindow();
	}

	//Windows
	public void mainWindow() throws IOException {
		FXMLLoader MainWindowLoader= new FXMLLoader(MainWindowController.class.getResource("MainWindowView.fxml"));
		AnchorPane MainWindowPane = MainWindowLoader.load();
		primaryStage.setMinHeight(400.00);
		primaryStage.setMinWidth(500.00);
		MainWindowController mainWindowController = MainWindowLoader.getController();
		mainWindowController.setMain(this);
		Scene scene=new Scene(MainWindowPane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}


	public void DragAndDropPopUpWindow() throws IOException {
			FXMLLoader DragAndDropLoader= new FXMLLoader(DragAndDropController.class.getResource("DragAndDropView.fxml"));
			AnchorPane DragAndDropPane = DragAndDropLoader.load();
			DragAndDropController = DragAndDropLoader.getController();
			DragAndDropController.setMain(this);
			Scene DragAndDropScene=new Scene(DragAndDropPane);
			primaryStage.setScene(DragAndDropScene);
	}

	public void progress() throws IOException {
			FXMLLoader progressLoader= new FXMLLoader(progressController.class.getResource("progressView.fxml"));
			AnchorPane progressPane = progressLoader.load();
			progressController= progressLoader.getController();
			progressController.setMain(this);
			progressController.setNumberToDo(getNumberToDo());
			progressController.finishButtonDisabled(true);
			Scene progressScene=new Scene(progressPane);
			primaryStage.setScene(progressScene);
	}

	public void error(String Message, String Message2) throws IOException {
			FXMLLoader ErrorMessageLoader= new FXMLLoader(ErrorMessageController.class.getResource("ErrorMessageView.fxml"));
			AnchorPane ErrorMessagePane = ErrorMessageLoader.load();
			ErrorStage.setMinHeight(200.00);
			ErrorStage.setMinWidth(700.00);
			ErrorMessageController = ErrorMessageLoader.getController();
			ErrorMessageController.setMain(this,DragAndDropController);
			ErrorMessageController.setMessage(Message,Message2);
			Scene scene=new Scene(ErrorMessagePane);
			ErrorStage.setScene(scene);
			ErrorStage.showAndWait();
	}

	//Methods
	public void compress() throws IOException {
		createNewFolder createNewFolder= new createNewFolder();
		String linkOfNewFolder=createNewFolder.createFolder();
		setNumberToDo(getLinks().size());
		progress();
		progressController.setProgressBar(getLinks(), linkOfNewFolder);
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
	public void setNumberToDo(int size) {
		toDoNumber=size;
	}
	
	public void setErrorMessageControllerNoButton(String text, boolean disabled) {
		ErrorMessageController.setNoButtonText(text,disabled);
	}
	
public void setErrorMessageControllerYesButton(String text, boolean disabled) {
	ErrorMessageController.setYesButtonText(text,disabled);
}
}