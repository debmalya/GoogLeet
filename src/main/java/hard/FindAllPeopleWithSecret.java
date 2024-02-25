package hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllPeopleWithSecret {
    /**
     * You are given an integer n indicating there are n people numbered from 0 to n - 1.
     * You are also given a 0-indexed 2D integer array meetings where meetings[i] = [xi, yi, timei]
     * indicates that person xi and person yi have a meeting at timei. A person may attend multiple meetings at the same time.
     * Finally, you are given an integer firstPerson.
     * <p>
     * Person 0 has a secret and initially shares the secret with a person firstPerson at time 0.
     * This secret is then shared every time a meeting takes place with a person that has the secret.
     * More formally, for every meeting, if a person xi has the secret at timei,
     * then they will share the secret with person yi, and vice versa.
     * <p>
     * The secrets are shared instantaneously. That is, a person may receive the secret and share it with people in other meetings
     * within the same time frame.
     * <p>
     * Return a list of all the people that have the secret after all the meetings have taken place.
     * You may return the answer in any order.
     *
     * @param n           number of people.
     * @param meetings    2D integer array.
     * @param firstPerson to get the secret from person 0.
     * @return a list of all the people that have the secret.
     */
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        int[] groups = new int[100000];
        List<Integer> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < n; ++i) groups[i] = i;
        groups[firstPerson] = 0;

        Arrays.sort(meetings, (a, b) -> Integer.compare(a[2], b[2]));

        int i = 0;
        while (i < meetings.length) {
            int currentTime = meetings[i][2];
            temp.clear();
            while (i < meetings.length && meetings[i][2] == currentTime) {
                int g1 = find(groups, meetings[i][0]);
                int g2 = find(groups, meetings[i][1]);
                groups[Math.max(g1, g2)] = Math.min(g1, g2);
                temp.add(meetings[i][0]);
                temp.add(meetings[i][1]);
                ++i;
            }
            for (int j = 0; j < temp.size(); ++j) {
                if (find(groups, temp.get(j)) != 0) {
                    groups[temp.get(j)] = temp.get(j);
                }
            }
        }

        for (int j = 0; j < n; ++j) {
            if (find(groups, j) == 0) result.add(j);
        }

        return result;
    }

    private int find(int[] groups, int index) {
        while (index != groups[index]) index = groups[index];
        return index;
    }

    // 32/55
    public List<Integer> findAllPeople0(int n, int[][] meetings, int firstPerson) {
        List<Integer> peopleWithSecret = new ArrayList<>();
        peopleWithSecret.add(0);
        peopleWithSecret.add(firstPerson);

        Arrays.sort(meetings, (m1, m2) -> {
            if (m1[2] == m2[2]) {
                if (m1[0] == 0 || m1[1] == 0) {
                    return -1;
                }
            }
            if (m1[2] < m2[2]) {
                return -1;
            }
            return 1;
        });

        for (int[] meeting : meetings) {
            if (peopleWithSecret.contains(meeting[0]) || peopleWithSecret.contains(meeting[1])) {
                if (!peopleWithSecret.contains(meeting[0])) {
                    peopleWithSecret.add(meeting[0]);
                }

                if (!peopleWithSecret.contains(meeting[1])) {
                    peopleWithSecret.add(meeting[1]);
                }
            }

        }
        return peopleWithSecret;
    }


}
