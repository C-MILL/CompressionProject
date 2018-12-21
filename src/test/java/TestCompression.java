
import static org.junit.Assert.assertTrue;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import org.junit.Test;

import Compress.compress;

class TestCompression {
	String linkOfSmallFile="./src/test/resources/testFileSmall.jpeg";
	String linkOfSmallCompressedFile="./src/test/resources/testCompressed/testFileSmall_compr.jpeg";
	String linkOfBigFile="./src/test/resources/testFileBig.jpeg";
	String linkOfBigCompressedFile="./src/test/resources/testCompressed/testFileBig_compr.jpeg";

	

	Image smallImage;
	Image smallCompressedImage;
	Image bigImage;
	Image bigCompressedImage;

	
	
	
	@Test
	public void testTheFileSizeAfterCompression() throws IOException { 
		
			new compress(linkOfBigFile, "./src/test/resources/testCompressed");
			File bigImage = new File(linkOfBigFile);
			File bigCompressedImage = new File(linkOfBigCompressedFile);
			long bigImageSize = bigImage.length();
			long bigCompressedImageSize = bigCompressedImage.length();
			 assertTrue((bigImageSize > bigCompressedImageSize));
		
	}
}


