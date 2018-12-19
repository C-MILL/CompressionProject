package JUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.junit.jupiter.api.Test;

import Compress.compress;

class TestCompress {

	@Test
	public void testCompressResolutionResizing() throws IOException { 
		new compress("./src/test/resources/testFileSmall.jpg", "./src/test/resources/testCompressed");
		Image uncompressedImage = new ImageIcon(ImageIO.read(new File("./src/test/resources/testFileSmall.jpg"))).getImage();
		Image compressedImage = new ImageIcon(ImageIO.read(new File("./src/test/testFileSmall_compr.jpg"))).getImage();
		

		assertEquals(compressedImage.getHeight(null), uncompressedImage.getHeight(null), "blablabla");
	}

}

