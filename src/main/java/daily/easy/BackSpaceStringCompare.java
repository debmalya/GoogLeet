package daily.easy;

public class BackSpaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        return handleBackSpace(s).compareTo(handleBackSpace(t)) == 0;
    }

    public String handleBackSpace(String s) {
        StringBuilder sb = new StringBuilder();
        int isBackSpaceCharacter = 0;
        for (int i = s.length() - 1; i > -1; i--) {
            char c = s.charAt(i);
            if (c == '#') {
                isBackSpaceCharacter++;
            }
            if (isBackSpaceCharacter == 0) {
                sb.append(c);
            }
            if (isBackSpaceCharacter > 0 && c != '#') {
                isBackSpaceCharacter--;
            }
        }
        return sb.reverse().toString();
    }
}
