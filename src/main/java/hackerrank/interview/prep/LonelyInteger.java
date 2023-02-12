package hackerrank.interview.prep;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class LonelyInteger {
	
    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        Map<Integer,Integer> frqMap = new HashMap<>();
        AtomicInteger lonelyOne = new AtomicInteger();
        
        for (Integer each: a){
            frqMap.putIfAbsent(each, 0);
            int count = frqMap.get(each);
            count++;
            frqMap.put(each,count);
        }
        
        frqMap.forEach((key,value) -> {
            if (value == 1){
                lonelyOne.set(key);
            }
            
        });
                
        return lonelyOne.get();
    }

}
