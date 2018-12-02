package Main;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainWindowController {

	
	//views
	@FXML private Label label;
	@FXML private TextField field;
	
	
	public Main main;
	
	public void setMain(Main main) {
		this.main=main;
		
	}

	

	@FXML
	public void handleChangeText() {
		String text = field.getText();
		label.setText(text);
	}
	
	@FXML
	public void handleClear() {
		
		
	}
	
	
}
