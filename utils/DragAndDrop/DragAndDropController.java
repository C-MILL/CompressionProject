package DragAndDrop;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class DragAndDropController {
	//views
	@FXML private Rectangle DragAndDropArea;
	@FXML private Label labelNumberToCompress;
	@FXML private Button DragAndDropButtonCancel;
	private String[] links;

	

	public DragAndDropMain main;


	public void setMain(DragAndDropMain dragAndDropMain) {
		this.main=dragAndDropMain;

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
				System.out.println(links[i]);
			} //write new links into the array
			for(int h=0; h<links.length; h++) {
				System.out.println(links[h]);
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
	    Stage stage = (Stage) DragAndDropButtonCancel.getScene().getWindow();
	    stage.close();
	}
	
	
	public String[] getLinks() {
		return links;
	}

	
	public void setLinks(String[] links) {
		this.links = links;
	}
}
