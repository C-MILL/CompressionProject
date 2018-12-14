package directory;

import java.io.File;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class createNewFolder {

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
