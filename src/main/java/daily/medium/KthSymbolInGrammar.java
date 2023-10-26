package daily.medium;

import java.math.BigInteger;

public class KthSymbolInGrammar {
    /**
     * We build a table of n rows (1-indexed). We start by writing 0 in the 1st row.
     * Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.
     * <p>
     * For example, for n = 3, the 1st row is 0, the 2nd row is 01, and the 3rd row is 0110.
     * <p>
     * Given two integer n and k, return the kth (1-indexed) symbol in the nth row of a table of n rows.
     *
     * @param n row number.
     * @param k column number.
     * @return return the kth (1-indexed) symbol in the nth row of a table of n rows.
     */
    public int kthGrammar(int n, int k) {
        int a = 0;
        BigInteger b = BigInteger.ZERO;
        b.negate();
        return a;
    }

    public int kthGrammar1(int n, int k) {
        StringBuilder sb = new StringBuilder("0");
        for (int i = 1; i < n; i++) {
            int j = sb.length();
            int a = 0;
            while (a < j) {
                char c = sb.charAt(a);
                char d = c == '0' ? '1' : '0';
                sb.append(d);
                a++;
            }

        }
        return sb.charAt(k - 1) - '0';
    }

    public int kthGrammar0(int n, int k) {
        StringBuilder sb = new StringBuilder("0");
        StringBuilder sbRow = new StringBuilder();
        for (int i = 1; i < n; i++) {

            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(j) == '0') {
                    sbRow.append("01");
                } else {
                    sbRow.append("10");
                }

            }
            sb.delete(0, sb.length());
            sb.append(sbRow);
            sbRow.delete(0, sbRow.length());
        }

        return sb.charAt(k - 1) - '0';

    }
}
