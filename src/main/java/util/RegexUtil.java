package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtil {
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$");
    Matcher matcher = pattern.matcher(args[0]);
  }
}
