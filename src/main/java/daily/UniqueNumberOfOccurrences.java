package daily;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++){
            int count = frequencyMap.getOrDefault(arr[i],0);
            frequencyMap.put(arr[i],++count);
        }

        Set<Integer> valueSet = new HashSet<>();
        Collection<Integer> values = frequencyMap.values();
        for (int each:values){
            if (!valueSet.add(each)){
                return false;
            }
        }


        return frequencyMap.size() == valueSet.size();
        
    }
}
