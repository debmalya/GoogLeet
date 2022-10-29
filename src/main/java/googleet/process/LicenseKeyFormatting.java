package googleet.process;

public class LicenseKeyFormatting {
	public String licenseKeyFormatting(String s, int k) {
		String part = "";
		String reformatted = "";

		for (int index = s.length() - 1; index > -1; index--) {
			char c = s.charAt(index);
			if (c != '-') {
				if (part.length() < k) {
					part = c + part;
				} else {
					if (reformatted.length() > 0) {
						reformatted = "-" + reformatted;
					}
					reformatted = part + reformatted;
					part = c + "";
				}
			}
		}

		if (part.length() > 0) {
			if (reformatted.length() > 0) {
				reformatted = "-" + reformatted;
			}
			reformatted = part + reformatted;
		}

		return reformatted.toUpperCase();

	}

}
