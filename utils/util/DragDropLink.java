package util;

	import javafx.application.Application;
	import javafx.event.EventHandler;
	import javafx.scene.Scene;
	import javafx.scene.control.Label;
	import javafx.scene.input.DragEvent;
	import javafx.scene.input.Dragboard;
	import javafx.scene.input.TransferMode;
	import javafx.scene.layout.StackPane;
	import javafx.scene.layout.VBox;
	import javafx.stage.Stage;

	public class DragDropLink extends Application {

	    public void start(Stage primaryStage) {
	        Label label = new Label("Drag your Files here.");
	        Label dropped = new Label("This has changed again");
	        VBox dragTarget = new VBox();
	        dragTarget.getChildren().addAll(label,dropped);
	        dragTarget.setOnDragOver(new EventHandler<DragEvent>() {
	            public void handle(DragEvent event) {
	                if (event.getGestureSource() != dragTarget
	                        && event.getDragboard().hasFiles()) {
	                    //TransferMode steuert wie dass Dateien abgelegt weden können. Hier kann man die Bilder reinkopieren und in das Feld kopieren.
	                    event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
	                }
	                event.consume();
	            }
	        });

	        dragTarget.setOnDragDropped(new EventHandler<DragEvent>() {

	            @Override
	            public void handle(DragEvent event) {
	                Dragboard db = event.getDragboard();
	                boolean success = false;
	                if (db.hasFiles()) {
	                    dropped.setText(db.getFiles().toString());
	                    success = true;
	                }
	                //sieht nach ob daten gedropped wurden
	                event.setDropCompleted(success);

	                event.consume();
	            }
	        });


	        StackPane root = new StackPane();
	        root.getChildren().add(dragTarget);

	        Scene scene = new Scene(root, 500, 250);

	        primaryStage.setTitle("Drag Test");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }

	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	        launch(args);
	    }

	}


