package Progress;

import Main.Main;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;



public class progressController extends Thread{


	//views
	@FXML private Label doneLabel;
	@FXML private Label toDoLabel;
	@FXML private Button finishButton;
	public Main main;


	public void setMain(Main main) {
		this.main=main;
	}

	@FXML
	public void handleFinishButton() {
		Platform.exit();
	}








 public void setDoneLabel(String text) {
			doneLabel.setText(text);
	}

 public void setLabelToDo(String empty) {
	 toDoLabel.setText("");
 }
 public void setLabelToDo(int numberToDo) {
	 toDoLabel.setText(numberToDo+" Fotos werden konvertiert.");
 }











}






