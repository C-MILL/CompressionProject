package Compress;

public class compressThreads extends Thread{

	public compressThreads(String linkOfFile, String linkOfFolder) {
		new compress(linkOfFile,linkOfFolder);
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
