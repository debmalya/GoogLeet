package daily.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Design a HashMap without using any built-in hash table libraries.
 * <p>
 * Implement the MyHashMap class:
 * <p>
 * MyHashMap() initializes the object with an empty map.
 * <p>
 * void put(int key, int value) inserts a (key, value) pair into the HashMap. If the key already exists in the map,
 * update the corresponding value.
 * <p>
 * int get(int key) returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
 * <p>
 * void remove(key) removes the key and its corresponding value if the map contains the mapping for the key.
 */
public class MyHashMap {
    class Pair<U, V> {
        public U first;
        public V second;

        public Pair(U first, V second) {
            this.first = first;
            this.second = second;
        }
    }


    class Bucket {
        private final List<Pair<Integer, Integer>> bucket;

        public Bucket() {
            this.bucket = new LinkedList<Pair<Integer, Integer>>();
        }

        public Integer get(Integer key) {
            for (Pair<Integer, Integer> pair : this.bucket) {
                if (pair.first.equals(key))
                    return pair.second;
            }
            return -1;
        }

        public void update(Integer key, Integer value) {
            boolean found = false;
            for (Pair<Integer, Integer> pair : this.bucket) {
                if (pair.first.equals(key)) {
                    pair.second = value;
                    found = true;
                }
            }
            if (!found)
                this.bucket.add(new Pair<>(key, value));
        }

        public void remove(Integer key) {
            for (Pair<Integer, Integer> pair : this.bucket) {
                if (pair.first.equals(key)) {
                    this.bucket.remove(pair);
                    break;
                }
            }
        }
    }


    private final int key_space;
    private final List<Bucket> hash_table;

    /**
     * Initialize your data structure here.
     */
    public MyHashMap() {
        this.key_space = 2069;
        this.hash_table = new ArrayList<Bucket>();
        for (int i = 0; i < this.key_space; ++i) {
            this.hash_table.add(new Bucket());
        }
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        int hash_key = key % this.key_space;
        this.hash_table.get(hash_key).update(key, value);
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping
     * for the key
     */
    public int get(int key) {
        int hash_key = key % this.key_space;
        return this.hash_table.get(hash_key).get(key);
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        int hash_key = key % this.key_space;
        this.hash_table.get(hash_key).remove(key);
    }
}
