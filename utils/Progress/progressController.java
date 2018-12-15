package Progress;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Text;

import Main.Main;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class progressController {

	
	//views
	@FXML public Label doneLabel;
	@FXML public Label toDoLabel;
	@FXML public Label infoLabel;
	@FXML public Button finishButton;
	@FXML public ProgressBar progressBar;
	
	public Main main;



	public void setMain(Main main) {
		this.main=main;
	}
	
	@FXML
	public void handleFinishButton() {
	progressBar.setProgress(1/10);
	}
	
	public void setAll(int doneNumber, int numberToDo) {
		progressBar.setProgress(doneNumber+1/10.0);
		toDoLabel.setText(Integer.valueOf(numberToDo).toString());
		doneLabel.setText(Integer.valueOf(doneNumber+1).toString());
		
	}













}
	
		
	
	
	

