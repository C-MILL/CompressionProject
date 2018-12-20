package kap04.kap0405;

import javafx.application.Application;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.concurrent.Task;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/* Presenter */
class PTask extends Task<Void> {
	private final static long INTERVAL = 50; // Milliseconds

	protected Void call() {
		int totalWork = (int) (Math.random() * 200 + 50);
		int workDone = 0;
		while (!isCancelled() && workDone <= totalWork) {
			updateProgress(workDone, totalWork);
			workDone++;
			try {
				Thread.sleep(INTERVAL);
			} catch (InterruptedException e) {
			}
		}
		return null;
	}
}

class ProgressPresenter {
	private PTask task;
	private ProgressView view;

	public void setView(ProgressView view) {
		this.view = view;
	}

	public void start() {
		if (task == null || !task.isRunning()) {
			task = new PTask();
			view.bind(task.progressProperty());
			Thread thread = new Thread(task);
			thread.setDaemon(true);
			thread.start();
		}
	}

	public void stop() {
		if (task != null) {
			task.cancel();
		}
	}
}

/* View */
class ProgressView {
	private ProgressPresenter presenter;

	private VBox root;
	private ProgressBar progressBar;
	private ProgressIndicator progressIndicator;

	public ProgressView(ProgressPresenter presenter) {
		this.presenter = presenter;
		initView();
	}

	private void initView() {
		root = new VBox(8);
		root.setPadding(new Insets(10));
		Button b1 = new Button("Start");
		b1.setOnAction(e -> presenter.start());
		root.getChildren().add(b1);
		Button b2 = new Button("Stopp");
		b2.setOnAction(e -> presenter.stop());
		root.getChildren().add(b2);
		progressBar = new ProgressBar();
		root.getChildren().add(progressBar);
		progressIndicator = new ProgressIndicator();
		root.getChildren().add(progressIndicator);
	}

	public Pane getUI() {
		return root;
	}

	
	
	public void bind(ReadOnlyDoubleProperty progressProperty) {
		progressBar.progressProperty().bind(progressProperty);
		progressIndicator.progressProperty().bind(progressProperty);
	}
}

/* Main */
public class ProgressTask extends Application {
	public void start(Stage primaryStage) {
		ProgressPresenter p = new ProgressPresenter();
		ProgressView view = new ProgressView(p);
		p.setView(view);

		Scene scene = new Scene(view.getUI());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Fortschritt mit Kopplung");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
