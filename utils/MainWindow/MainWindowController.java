package MainWindow;

import Main.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

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
		
		main.DragAndDropPopUpWindow();
	
	}












}
	
		
	
	
	

