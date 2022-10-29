package googleet.process;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LicenseKeyFormattingTest {
	
	LicenseKeyFormatting licenseKeyFormatting = new LicenseKeyFormatting();

	@Test
	void testLicenseKeyFormatting() {
		assertEquals("5F3Z-2E9W",licenseKeyFormatting.licenseKeyFormatting("5F3Z-2e-9-w", 4));
		assertEquals("2-5G-3J",licenseKeyFormatting.licenseKeyFormatting("2-5g-3-J", 2));
		assertEquals("2-5-G-3-J",licenseKeyFormatting.licenseKeyFormatting("2-5g-3-J", 1));
		assertEquals("25G3J",licenseKeyFormatting.licenseKeyFormatting("2-5g-3-J", 5));
		assertEquals("25G3J",licenseKeyFormatting.licenseKeyFormatting("2-5g-3-J", 6));
	}
	

}
