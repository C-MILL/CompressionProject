package Compress;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class compress {

	
	//Constructor 1
	public compress(String linkOfFile, String linkOfNewFolder) {
		try {
			
			//RANDOM TEXT
			
			
			//Load Image
		Image image = new ImageIcon(ImageIO.read(new File(linkOfFile))).getImage();
		
		//Get resolution of image and divide trough 2
		int newheight=(image.getHeight(null))/2;
		int wewWidth = (image.getWidth(null))/2;
		
		//Compress
		Image scaledImage = image.getScaledInstance(wewWidth, newheight,Image.SCALE_SMOOTH);
		BufferedImage outImg = new BufferedImage(wewWidth, newheight,BufferedImage.TYPE_INT_RGB);
		
		//Does some stuff 
		Graphics g = outImg.getGraphics();
		g.drawImage(scaledImage, 0, 0, null);
		g.dispose();
		
		//Writes new image to new folder link with the old name of the origin file...
		//But I have no idea how you need to rearrange the link where it saves the new file...
		//Good luck ;)
		ImageIO.write(outImg, "jpeg", new File(linkOfNewFolder,linkOfFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	//Constructor 2
	public compress(String linkOfFile, String linkOfNewFolder, int width, int height) {
		

		

	}
	
	
	//Constructor 3
public compress(String linkOfFile, String linkOfNewFolder, int maxSizeOfFile) {
		

		

	}
}