package daily.easy;

public class ReverseWordsInAStringIII {

    public String reverseWords(String s) {
        String[] words = s.split("\\s");
        StringBuilder sb = new StringBuilder();

        for (String each : words) {
            sb.append(reverse(each));
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    private char[] reverse(String each) {
        char[] reversed = each.toCharArray();
        int limit = each.length() / 2;
        int i = 0;
        int reversedIndex = each.length() - i - 1;
        for (; i < limit; i++) {
            char temp = each.charAt(i);
            reversed[i] = reversed[reversedIndex];
            reversed[reversedIndex] = temp;
            reversedIndex--;
        }

        return reversed;
    }
}
