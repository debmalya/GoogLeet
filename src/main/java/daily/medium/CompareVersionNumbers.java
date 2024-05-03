package daily.medium;

public class CompareVersionNumbers {
    /**
     * Given two version numbers, version1 and version2, compare them.
     * <p>
     * Version numbers consist of one or more revisions joined by a dot '.'.
     * Each revision consists of digits and may contain leading zeros. Every revision contains at least one character.
     * Revisions are 0-indexed from left to right, with the leftmost revision being revision 0, the next revision being revision 1,
     * and so on. For example 2.5.33 and 0.1 are valid version numbers.
     * <p>
     * To compare version numbers, compare their revisions in left-to-right order.
     * Revisions are compared using their integer value ignoring any leading zeros.
     * This means that revisions 1 and 001 are considered equal.
     * If a version number does not specify a revision at an index,
     * then treat the revision as 0. For example, version 1.0 is less than version 1.1 because their revision 0s are the same,
     * but their revision 1s are 0 and 1 respectively, and 0 < 1.
     * <p>
     * Return the following:
     * <p>
     * If version1 < version2, return -1.
     * If version1 > version2, return 1.
     * Otherwise, return 0.
     *
     * @param version1
     * @param version2
     * @return
     */
    public int compareVersion(String version1, String version2) {
        int[] iVersion1 = intVersion(version1);
        int[] iVersion2 = intVersion(version2);

        for (var index = 0; index < iVersion1.length || index < iVersion2.length; index++) {
            if (index < iVersion1.length && index < iVersion2.length) {
                if (iVersion1[index] > iVersion2[index]) {
                    return 1;
                } else if (iVersion1[index] < iVersion2[index]) {
                    return -1;
                }
            } else if (index < iVersion1.length && iVersion1[index] > 0) {
                return 1;
            } else if (index < iVersion2.length && iVersion2[index] > 0) {
                return -1;
            }
        }
        return 0;
    }

    private int[] intVersion(String version) {
        String[] versions = version.split("\\.");
        int[] ints = new int[versions.length];
        for (var index = 0; index < versions.length; index++) {
            ints[index] = Integer.parseInt(versions[index]);
        }
        return ints;
    }
}
