package DragAndDrop;
 import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import Main.Main;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
 public class DragAndDropController {
	//views
	@FXML private Rectangle DragAndDropArea;
	@FXML private Label labelNumberToCompress;
	@FXML private Button DragAndDropButtonCancel;
	@FXML private GridPane gridPane;
	ArrayList<String> links = new ArrayList<String>();
	ArrayList<ImageView> image = new ArrayList<ImageView>();
 	public Main main;
 	
 	public void setMain(Main main) {
		this.main=main;
 	}
 	@FXML
	private void handleDragDropped(DragEvent event) {
 		Dragboard DragboardLinks = event.getDragboard();	//Save all links in DragBoard
		String somelinks = DragboardLinks.getFiles().toString();
		//System.out.println(somelinks);							//convert dragboard to string
		somelinks= somelinks.substring(1, (somelinks.length()-1));		//substract beginning and end (rechteckige klammern)
		//System.out.println(somelinks);
		String[] linkarray=somelinks.split(", ")	;	//split the links 
		
		for(int i =0; i<linkarray.length;i++) {
		
			
			
			
		links.add(linkarray[i]);
		/*
		try {
			Image singleImage = new new ImageIcon(ImageIO.read(new File(linkarray[i]))).getImage()
			image.add();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	        
	        
		gridPane.add(image.get(i), 0, 0);
		*/
		}
		labelNumberToCompress.setText(Integer.toString(links.size()));	//set label
		
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
	private void handleDragAndDropButtonOk() {
		main.setLinks(links);
		main.compress();

 		
	}
}