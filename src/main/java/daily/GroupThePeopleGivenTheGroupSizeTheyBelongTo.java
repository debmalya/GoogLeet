package daily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupThePeopleGivenTheGroupSizeTheyBelongTo {
    /**
     * There are n people that are split into some unknown number of groups. Each person is labeled with a unique ID from 0 to n - 1.
     *
     * @param groupSizes an integer array groupSizes, where groupSizes[i] is the size of the group that person 'i' is in.
     *                   For example, if groupSizes[1] = 3, then person 1 must be in a group of size 3.
     * @return a list of groups such that each person 'i' is in a group of size groupSizes[i].
     * Each person should appear in exactly one group, and every person must be in a group.
     * If there are multiple answers, return any of them.
     * It is guaranteed that there will be at least one valid solution for the given input.
     */
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> group = new ArrayList<>();
        Map<Integer, List<Integer>> groupMap = new HashMap<>();

        for (int index = 0; index < groupSizes.length; index++) {
            groupMap.putIfAbsent(groupSizes[index], new ArrayList<>());
            var members = groupMap.get(groupSizes[index]);
            members.add(index);
            if (members.size() == groupSizes[index]) {
                group.add(members);
                groupMap.remove(groupSizes[index]);
            }
        }
        return group;
    }
}
