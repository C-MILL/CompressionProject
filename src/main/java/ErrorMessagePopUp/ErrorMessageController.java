package ErrorMessagePopUp;

import DragAndDrop.DragAndDropController;
import Main.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

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
	
	public void setNoButtonText(String text, boolean disabled){
		noButton.setText(text);
		noButton.setDisable(disabled);
	}

	public void setYesButtonText(String text, boolean disabled) {
		yesButton.setText(text);
		yesButton.setDisable(disabled);
	}

}
