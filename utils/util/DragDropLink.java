package util;

	import javafx.application.Application;
	import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
	import javafx.scene.input.DragEvent;
	import javafx.scene.input.Dragboard;
	import javafx.scene.input.TransferMode;
	import javafx.scene.layout.StackPane;
	import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

	public class DragDropLink {
		
		static String[] links=null;
		public static String[] display(String abbrechen) {
			
			Stage window = new Stage();
			
			window.initModality(Modality.APPLICATION_MODAL);
			window.setTitle("Komprimieren");
			window.setMinWidth(250);
			
			Label label = new Label();
			label.setText("Ziehe alle Dateien die du komprimieren willst in dieses Fenster.");
			
			Button closeButton = new Button("Abbrechen");
			closeButton.setOnAction(e->window.close());
			
		
			VBox layout = new VBox(10);
			layout.getChildren().addAll(label,closeButton);
			layout.setAlignment(Pos.CENTER);
			
			
		    //Dies ist die DragOver Methode. Sie Schaut ob etwas ins Feld geschoben wird. Sie macht eigentlich nur dass man überhaupt etwas droppen kann
			layout.setOnDragOver(new EventHandler<DragEvent>() {
	            public void handle(DragEvent event) {
	                if (event.getGestureSource() != label
	                        && event.getDragboard().hasFiles()) {
	                    //TransferMode steuert wie dass Dateien abgelegt weden können. Hier kann man die Bilder reinkopieren und in das Feld kopieren.
	                    event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
	                }
	                event.consume();
	            }
	        });
			
		      //Diese Methode reagiert wenn tatsächlich etwas gedropped wird.
			  label.setOnDragDropped(new EventHandler<DragEvent>() {

		            @Override
		            public void handle(DragEvent event) {
		                Dragboard db = event.getDragboard();
		                boolean success = false;
		                if (db.hasFiles()) {
		                String link=db.getFiles().toString();
		                links = link.split(","); 
		       			success = true;
		                }
		        
		                event.setDropCompleted(success);

		                event.consume();

		            }
		        });
			
			Scene scene = new Scene(layout);
			window.setScene(scene);
			window.showAndWait();
			return links;
			
		}

	


	   

	}


