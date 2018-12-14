package directory;
 import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
 public class createNewFolder {

<<<<<<< HEAD
import java.io.File;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class createNewFolder {
=======
	public String createNewFolder() {
		String linkOfNewFolder = null;

		try {

			// Gets todays Date
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd");
			LocalDateTime today = LocalDateTime.now();

			
			// Gets users home directory and splits it at Desktop
			// Creates new folder with e.g. following path: C:\Users\mkaun\Desktop\Compressed 2018.12.14
			String path = System.getProperty("user.home") + File.separator + "Desktop";
			path += File.separator + "Compressed Images " + dtf.format(today);
			File customDir = new File(path);
			customDir.mkdirs();
			linkOfNewFolder = path;
					//.replace("\\","/");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return linkOfNewFolder;
	}
>>>>>>> refs/remotes/origin/master

	public String createNewFolder() {
		String linkOfNewFolder = null;

		try {

			// Gets todays Date
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd");
			LocalDateTime today = LocalDateTime.now();

			
			// Gets users home directory and splits it at Desktop
			// Creates new folder with e.g. following path: C:\Users\mkaun\Desktop\Compressed 2018.12.14
			String path = System.getProperty("user.home") + File.separator + "Desktop";
			path += File.separator + "Compressed Images " + dtf.format(today);
			File customDir = new File(path);
			customDir.mkdirs();
			linkOfNewFolder = path.replace("\\","/");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return linkOfNewFolder;
	}

}
