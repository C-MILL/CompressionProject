package ErrorMessagePopUp;

import DragAndDrop.DragAndDropController;
import Main.Main;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ErrorMessageController {
	public Main main;
	@FXML private Label messageLabel;
	@FXML private Label messageLabel2;
	@FXML private Button yesButton;
	@FXML private Button noButton;
	DragAndDropController dragAndDropController;
	
	public ErrorMessageController() {
		// TODO Auto-generated constructor stub
	}

	public void setMain(Main main, DragAndDropController dragAndDropController) {
		this.main=main;
		this.dragAndDropController=dragAndDropController;
		
	}
	
	
	@FXML
	private void handleYesButton() {
		dragAndDropController.setAlreadyCatched(false);
		main.ErrorStage.close();
	}
	
	@FXML
	private void handleNoButton() {
		dragAndDropController.setAlreadyCatched(true);
		main.ErrorStage.close();
		
	}
	
	public void setMessage(String message, String message2) {
		messageLabel.setText(message);
		messageLabel2.setText(message2);
		
	}

}
