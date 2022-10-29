package googleet.process;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress {
	/**
	 * Every valid email consists of a local name and a domain name, separated by
	 * the '@' sign. Besides lower case letters, the email may contain one or more
	 * '.' or '+'.
	 * 
	 * If you add periods '.' between some characters in the local name part of an
	 * email address, mail sent there will be forwarded to the same address without
	 * dots in the local name. Note that this rule does not apply to domain names.
	 * 
	 * If you add a plus '+' in the local name, everything after the first plus sign
	 * will be ignored. This allows certain emails to be filtered. Note that this
	 * rule does not apply to domain names.
	 * 
	 * @param emails - array of string containing email address.
	 * @return - the number of different addresses that actually receive mails.
	 */
	public int numUniqueEmails(String[] emails) {
		// hash set to store all the unique emails
		Set<String> uniqueEmails = new HashSet<>();

		for (String email : emails) {
			// split into two parts local and domain
			String[] parts = email.split("@");

			// split local by '+'
			String[] local = parts[0].split("\\+");

			// remove all '.', and concatenate '@' and append domain
			uniqueEmails.add(local[0].replace(".", "") + "@" + parts[1]);
		}

		return uniqueEmails.size();
	}

}
