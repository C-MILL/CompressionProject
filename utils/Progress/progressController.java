package Progress;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Text;

import Main.Main;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;



public class progressController extends Thread{


	//views
	@FXML private Label doneLabel;
	@FXML private Label toDoLabel;
	@FXML private Label infoLabel;
	@FXML private Button finishButton;
	@FXML private ProgressBar progressBar;

	public Main main;



	public void setMain(Main main) {
		this.main=main;
	}

	@FXML
	public void handleFinishButton() {
		Platform.exit();
	}


	





	public void setAll(int doneNumber, int numberToDo) {
		progressBar.setProgress(doneNumber+1.0/10.0);
		toDoLabel.setText(Integer.valueOf(numberToDo).toString());
		doneLabel.setText(Integer.valueOf(doneNumber+1).toString());
		System.out.println(doneLabel.getText());
	}



	public void closePlatform() {
	

	}













}






