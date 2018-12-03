package DragAndDrop;
 import Main.Main;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import Main.Main;
 public class DragAndDropController {
	//views
	@FXML private Rectangle DragAndDropArea;
	@FXML private Label labelNumberToCompress;
	@FXML private Button DragAndDropButtonCancel;
	private String[] links = new String[0];
 	public Main main;
 	public void setMain(Main main) {
		this.main=main;
 	}
 	@FXML
	private void handleDragDropped(DragEvent event) {
 		Dragboard DragboardLinks = event.getDragboard();	//Save all links in DragBoard
		String somelinks = DragboardLinks.getFiles().toString();		//convert dragboard to string
		somelinks= somelinks.substring(1, (somelinks.length()-1));		//substract beginning and end (rechteckige klammern)
		String[] somelinksarray = somelinks.split(", ");		//split the links 
		String[] sublinks=links;								//saves links before overwriting the array
		links = new String[links.length+somelinksarray.length]; //set the final array
		labelNumberToCompress.setText(Integer.toString(links.length));	//set label
		for(int i=0; i<sublinks.length; i++) {
			links[i]=sublinks[i];
		}	//write old links into the new array
		
		for(int i=links.length-1; i<(links.length+somelinksarray.length-1); i++) {
			for(int j=0; j<somelinksarray.length; j++) {
				links[i]=somelinksarray[j];
			} //write new links into the array
			for(int j=0; j<links.length; j++) {
				System.out.println(links[j]);
			}
		}
	
		
	}
 	@FXML
	private void setLabelNumberToCompress(String number) {
		System.out.println(number);
 	}
 	@FXML
	private void handleOnDragOver(DragEvent event) {
		if(event.getDragboard().hasFiles()) {
			event.acceptTransferModes(TransferMode.ANY);
		}
 	}
 	@FXML
	private void handleDragAndDropButtonCancel() {
		Platform.exit();
	}
}