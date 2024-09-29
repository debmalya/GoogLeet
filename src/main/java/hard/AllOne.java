package hard;

import java.util.*;

public class AllOne {
    private final Map<String, Integer> keyCount;
    private final TreeMap<Integer, Set<String>> countKeys;

  /** Initialize your data structure here. */
  public AllOne() {
      keyCount = new HashMap<>();
      countKeys = new TreeMap<>();
  }

  /** Inserts a new key <Key> with value 1. Or increments an existing key by 1. */
  public void inc(String key) {
      int count = keyCount.getOrDefault(key, 0);
      keyCount.put(key, count + 1);

      if (count > 0) {
          countKeys.get(count).remove(key);
          if (countKeys.get(count).isEmpty()) {
              countKeys.remove(count);
          }
      }

      countKeys.computeIfAbsent(count + 1, k -> new HashSet<>()).add(key);
  }

  /** Decrements an existing key by 1. If Key's value is 1, remove it from the data structure. */
  public void dec(String key) {
      if (!keyCount.containsKey(key)) {
          return;
      }

      int count = keyCount.get(key);
      if (count == 1) {
          keyCount.remove(key);
      } else {
          keyCount.put(key, count - 1);
      }

      countKeys.get(count).remove(key);
      if (countKeys.get(count).isEmpty()) {
          countKeys.remove(count);
      }

      if (count > 1) {
          countKeys.computeIfAbsent(count - 1, k -> new HashSet<>()).add(key);
      }
  }


  /** Returns one of the keys with maximal value. */
  public String getMaxKey() {
      if (countKeys.isEmpty()) {
          return "";
      }
      return countKeys.lastEntry().getValue().iterator().next();
  }

    public String getMinKey() {
        if (countKeys.isEmpty()) {
            return "";
        }
        return countKeys.firstEntry().getValue().iterator().next();
    }
}
