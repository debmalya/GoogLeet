package daily.easy;

import java.util.Arrays;

public class AssignCookies {
    /**
     * Assume you are an awesome parent and want to give your children some cookies.
     * But, you should give each child at most one cookie.
     * <p>
     * Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with;
     * and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content.
     * Your goal is to maximize the number of your content children and output the maximum number.
     *
     * @param g greed factor.
     * @param s size of the cookie.
     * @return maximum number of content children.
     * @Constraints: 1 <= g.length <= 3 * 10^4
     * 0 <= s.length <= 3 * 10^4
     * 1 <= g[i], s[j] <= 2^(31 - 1)
     */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        for (int gindex = 0, sindex = 0; gindex < g.length && sindex < s.length; sindex++) {
            if (s[sindex] >= g[gindex]) {
                count++;
                gindex++;
            }
        }
        return count;
    }
}
