package Compress;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import Main.Main;

public class compress {

	Main main = new Main();
	public compress() {
	}
	//Constructor 1 -> Default program functionality
	public compress(String linkOfFile, String linkOfNewFolder) {

		// initialize Image
		Image image;
		try {
			// reads image from path input
			image = new ImageIcon(ImageIO.read(new File(linkOfFile))).getImage();
			// gets file path and saves it to f (important for further file processing)
			File f = new File(linkOfFile);

			// Extracts file name from file path
			String originalImageName = f.getName();

			// Removes file extension (.jpg / .jpeg / etc) -> important so that the newly created images all have the same file extension.
			int pos = originalImageName.lastIndexOf(".");
			String onlyImageName = originalImageName.substring(0, pos);

			// Creates the image name for the exported, compressed image
			String newImageName = onlyImageName + "_compr";

			//Get resolution of image and divide trough 2
			int newheight=(image.getHeight(null));
			int newWidth = (image.getWidth(null));
			if(image.getHeight(null)>2*1080) {
				newheight=(image.getHeight(null))/2;
				newWidth = (image.getWidth(null))/2;
			}

			//Compress
			Image scaledImage = image.getScaledInstance(newWidth, newheight,Image.SCALE_SMOOTH);
			BufferedImage outImg = new BufferedImage(newWidth, newheight,BufferedImage.TYPE_INT_RGB);

			//Does some stuff 
			Graphics g = outImg.getGraphics();
			g.drawImage(scaledImage, 0, 0, null);
			g.dispose();

			// Writes compressed image to the newly generated folder with the newly generated filename.
			ImageIO.write(outImg, "jpeg", new File(linkOfNewFolder + "/"+newImageName + ".jpeg"));

		} catch (IOException e) {
			e.printStackTrace();
		}}

	//Constructor 2 for extended functionality
	public compress(String linkOfFile, String linkOfNewFolder, int width, int height) {
	}

	//Constructor 3 for extended functionality
	public compress(String linkOfFile, String linkOfNewFolder, int maxSizeOfFile) {
	}
}
