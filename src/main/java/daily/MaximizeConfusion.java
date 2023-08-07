package daily;

import java.util.LinkedList;

public class MaximizeConfusion {
    /**
     * A teacher is writing a test with n true/false questions, with 'T' denoting true and 'F' denoting false. He wants to confuse the students by maximizing the number of consecutive questions with the same answer (multiple trues or multiple falses in a row).
     * <p>
     * You are given a string answerKey, where answerKey[i] is the original answer to the ith question. In addition, you are given an integer k, the maximum number of times you may perform the following operation:
     * <p>
     * Change the answer key for any question to 'T' or 'F' (i.e., set answerKey[i] to 'T' or 'F').
     * Return the maximum number of consecutive 'T's or 'F's in the answer key after performing the operation at most k times.
     *
     * @param answerKey answerKey[i] is either 'T' or 'F'
     * @param k         - the maximum number of times you may perform the operation flip T -> F or vice-versa.
     * @return - the maximum number of consecutive 'T's or 'F's in the answer key after performing the operation at most k times.
     */
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(flipper(answerKey, k, 'F'), flipper(answerKey, k, 'T'));
    }

    public int flipper(String answerKey, int k, char countLetter) {
        int max = 0;
        int count = 0;
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < answerKey.length(); i++) {
            char letter = answerKey.charAt(i);
            if (letter == countLetter) count++;
            else if (k > 0) {
                queue.add(i);
                k--;
                count++;
            } else {
                queue.add(i);
                max = Math.max(count, max);
                Integer firstEncountered = queue.removeFirst();
                count = i - firstEncountered;
            }
        }
        max = Math.max(count, max);
        return max;
    }
}
