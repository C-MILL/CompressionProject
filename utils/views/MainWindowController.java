package views;

import Main.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainWindowController {

	
	//views
	@FXML private Button kompliziert;
	@FXML private Button einfach;
	
	public Main main;
	
	
	
	public void setMain(Main main) {
		this.main=main;
	}

	

	@FXML
	public void handleKompliziert() {
		
	}
	
	@FXML
	public void handleEinfach() {
		
		 Stage stage = (Stage) clear.getScene().getWindow();
		 Main ok = new Main();
			ok.DragAndDropPopUpWindow();
	}













}
	
		
	
	
	

