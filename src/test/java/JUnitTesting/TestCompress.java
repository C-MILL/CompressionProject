package JUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Compress.compress;

class TestCompress {

	@Test
	public void testCompressResolutionResizing() {
		compress compress = new compress();
		assertEquals((2160-1), compress.(2160-1), "It resizes the Picture even though the resolution is already smaller than 2*1080");
	}

}
