package daily.medium;

public class BitwiseANDOfNumbersRange {
    public int rangeBitwiseAnd(int left, int right) {
        int and = left;
        and &= right;
        while (left < right) {
            ++left;
            and &= left;
            if (and == 0) {
                break;
            }
            right--;
            and &= right;
            if (and == 0) {
                break;
            }
        }
        return and;
    }
}
