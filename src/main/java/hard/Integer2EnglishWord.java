package hard;

public class Integer2EnglishWord {
  public String numberToWords(int num) {
    StringBuilder inWords = new StringBuilder();
    var divisors = new int[] {1000000000, 1000000, 1000, 100, 10};
    if (num == 0) {
      return getWord(num);
    }
    for (var index = 0; index < divisors.length; index++) {
      int result = num / divisors[index];
      if (result > 0) {
        switch (index) {
          case 0:
            // billion
            if (result > 9) {
              inWords.append(" ");
              inWords.append(numberToWords(result));
            } else {
              inWords.append(getWord(result));
            }
            inWords.append(" Billion");
            break;
          case 1:
            // millions
            if (result > 9) {
              inWords.append(" ");
              inWords.append(numberToWords(result));
            } else {
              inWords.append(getWord(result));
            }
            inWords.append(" Million");
            break;
          case 2:
            // thousands
            if (result > 9) {
              inWords.append(" ");
              inWords.append(numberToWords(result));
            } else {
              inWords.append(getWord(result));
            }
            inWords.append(" Thousand");
            break;
          case 3:
            // hundreds
            inWords.append(getWord(result));
            inWords.append(" Hundred");
            break;
          case 4:
            // tenth
            switch (result) {
              case 1:
                inWords.append(getWord(num));
                break;
              case 2:
                inWords.append(" Twenty");
                break;
              case 3:
                inWords.append(" Thirty");
                break;
              case 4:
                inWords.append(" Forty");
                break;
              case 5:
                inWords.append(" Fifty");
                break;
              case 6:
                inWords.append(" Sixty");
                break;
              case 7:
                inWords.append(" Seventy");
                break;
              case 8:
                inWords.append(" Eighty");
                break;
              case 9:
                inWords.append(" Ninety");
                break;
              default:
                break;
            }
            break;
          default:
            break;
        }
      }
      num %= divisors[index];
      if (num > 10 && num < 20) {
        break;
      }
    }

    if (num > 0) {
      inWords.append(getWord(num));
    }

    return inWords.toString().trim();
  }

  private String getWord(int result) {
    var words =
        new String[] {
          "Zero",
          " One",
          " Two",
          " Three",
          " Four",
          " Five",
          " Six",
          " Seven",
          " Eight",
          " Nine",
          " Ten",
          " Eleven",
          " Twelve",
          " Thirteen",
          " Fourteen",
          " Fifteen",
          " Sixteen",
          " Seventeen",
          " Eighteen",
          " Nineteen",
        };
    return words[result];
  }
}
