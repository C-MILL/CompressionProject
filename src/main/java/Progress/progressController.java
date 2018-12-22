package Progress;

import java.util.ArrayList;

import Compress.compress;
import Main.Main;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;



public class progressController{


	//views
	@FXML private Label doneLabel;
	@FXML private Label toDoLabel;
	@FXML private Label infoLabel;
	@FXML private Button finishButton;
	@FXML private ProgressBar progressBar;
	private Task copyWorker;
	private int doneNumber;
	private int numberToDo;
	private boolean threadfinished;
	ArrayList<String> links;
	String linkOfNewFolder;
	public Main main;
	int i;



	public void setMain(Main main) {
		this.main=main;
	}

	@FXML
	public void handleFinishButton() {
		Platform.exit();
	}


	
	


	public void closePlatform() {
	

	}

	
	
	
	public void setProgressBar(ArrayList<String> link, String linkOfNewFolder) {
		this.links=link;
		this.linkOfNewFolder=linkOfNewFolder;
		progressBar.progressProperty().unbind();
        progressBar.setProgress(0);
        copyWorker = createWorker();
        progressBar.progressProperty().bind(copyWorker.progressProperty());
        copyWorker.messageProperty().addListener(new ChangeListener<String>() {
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                System.out.println(newValue);
            }
        });

        new Thread(copyWorker).start();
        
        
	}
	
	
	public Task createWorker() {
        return new Task() {
            @Override
            protected Object call() throws Exception {
                for (i = 0; i < numberToDo; i++) {
                    Thread.sleep(5);
                    updateMessage("5 milliseconds");
                    updateProgress(i+1, numberToDo);
                    new compress(links.get(i), linkOfNewFolder);
                    
                    Platform.runLater(new Runnable() {
                        public void run() {
                        	doneLabel.setText(i+"");
                        	if(i==numberToDo) {
                        		infoLabel.setText("Komprimierung war erfolgreich.");
                        	}
                        }
                  });
                }
                finishButtonDisabled(false);
                
                return true;
            }
        };
    }

	public void finishButtonDisabled(boolean state) {
		finishButton.setDisable(state);
	}

	public void setNumberToDo(int numberToDo) {
		this.numberToDo=numberToDo;
		 toDoLabel.setText(""+numberToDo);
		
	}










}






