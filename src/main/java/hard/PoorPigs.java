package hard;

public class PoorPigs {
    /**
     * There are buckets buckets of liquid, where exactly one of the buckets is poisonous.
     * To figure out which one is poisonous, you feed some number of (poor) pigs the liquid to see whether they will die or not.
     * Unfortunately, you only have minutesToTest minutes to determine which bucket is poisonous.
     * <p>
     * <p>
     * You can feed the pigs according to these steps:
     * <p>
     * Choose some live pigs to feed.
     * For each pig, choose which buckets to feed it. The pig will consume all the chosen buckets simultaneously and will take no time.
     * Each pig can feed from any number of buckets, and each bucket can be fed from by any number of pigs.
     * Wait for minutesToDie minutes. You may not feed any other pigs during this time.
     * After minutesToDie minutes have passed, any pigs that have been fed the poisonous bucket will die, and all others will survive.
     * Repeat this process until you run out of time.
     *
     * @param buckets       number of buckets.
     * @param minutesToDie  minutes to die.
     * @param minutesToTest minutes to test.
     * @return the minimum number of pigs needed to figure out which bucket is poisonous within the allotted time.
     */
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int testsPerPig = minutesToTest / minutesToDie;
        int numPigs = 0;
        int states = 1; // Number of unique states a pig can represent
        while (states < buckets) {
            states *= (testsPerPig + 1);
            numPigs++;
        }
        return numPigs;
    }
}
