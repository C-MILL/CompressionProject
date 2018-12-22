package MainWindow;

import java.io.IOException;

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
	public void handleEinfach() throws IOException {
		
		main.DragAndDropPopUpWindow();
	
	}












}
	
		
	
	
	

