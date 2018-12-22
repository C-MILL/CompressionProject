package DragAndDrop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import Main.Main;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.shape.Rectangle;
public class DragAndDropController {
	//views
	@FXML private Rectangle DragAndDropArea;
	@FXML private Label labelNumberToCompress;
	@FXML private Label infoLabel;
	@FXML private Button DragAndDropButtonCancel;
	@FXML private Button dragAndDropButtonOk;
	boolean alreadyCatched=false;

	ArrayList<String> links = new ArrayList<String>();
	public Main main;

	public void setMain(Main main) {
		this.main=main;
	}
	@FXML
	private void handleDragDropped(DragEvent event) throws IOException {
		Dragboard DragboardLinks = event.getDragboard();
		String somelinks = DragboardLinks.getFiles().toString();
		somelinks= somelinks.substring(1, (somelinks.length()-1));		
		String[] linkarray=somelinks.split(", ");	

		for(int i =0; i<linkarray.length;i++) {
			for(int j=0; j<links.size(); j++) {
				if(linkarray[i].equals(links.get(j))){
					alreadyCatched=true;
					}
				}
			if(alreadyCatched==true) {
				setDragAndDropButtonOk(true);
				File f = new File(linkarray[i]);
				String originalImageName = f.getName();
				main.error("Dieses Foto wird bereits konvertiert, willst du es nochmals hinzufügen?",originalImageName);
				
			}
			if(alreadyCatched==false) {
				if(
						linkarray[i].endsWith(".jpg")||
						linkarray[i].endsWith(".Jpg")||
						linkarray[i].endsWith(".Jpeg")||
						linkarray[i].endsWith(".jpeg")||
						linkarray[i].endsWith(".gif")||
						linkarray[i].endsWith(".GIF")||
						linkarray[i].endsWith(".PNG")||
						linkarray[i].endsWith(".png")||
						linkarray[i].endsWith(".XBM")||
						linkarray[i].endsWith(".xbm")||
						linkarray[i].endsWith(".tiff")||
						linkarray[i].endsWith(".TIFF")){
							links.add(linkarray[i]);
				}else {
					File f = new File(linkarray[i]);
					String originalImageName = f.getName();
					main.error(("Wollen sie die Datei: "+originalImageName+" trotzdem hinzufügen?"),"Bitte wählen sie nur Fotos mit der Dateiendung jpg, jpeg, png oder gif.");
				
				}
				
				
			}
			alreadyCatched=false;
			setDragAndDropButtonOk(false);
		}
		labelNumberToCompress.setText(links.size()+" Fotos wurden bereits hinzugefügt.");	//set label
		infoLabel.setText("Sie können weiterhin beliebig viele Fotos hinzufügen.");	//set label

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

	@FXML
	private void handleDragAndDropButtonOk() throws IOException {
		main.setLinks(links);
		main.compress();


	}
	public void setAlreadyCatched(boolean b) {
		alreadyCatched=b;
		
	}
	
	public void setDragAndDropButtonOk(boolean state) {
		dragAndDropButtonOk.setDisable(state);
	}
}