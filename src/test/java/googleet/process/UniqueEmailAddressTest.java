package googleet.process;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UniqueEmailAddressTest {

	UniqueEmailAddress uniqueEmailAddress = new UniqueEmailAddress();

	@Test
	void testNumUniqueEmails() {
		assertEquals(2, uniqueEmailAddress.numUniqueEmails(new String[] { "test.email+alex@leetcode.com",
				"test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com" }));
		assertEquals(3, uniqueEmailAddress
				.numUniqueEmails(new String[] { "a@leetcode.com", "b@leetcode.com", "c@leetcode.com" }));

	}

}
