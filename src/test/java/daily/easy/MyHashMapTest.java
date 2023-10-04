package daily.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyHashMapTest {
    MyHashMap myHashMap = new MyHashMap();


    @Test
    void put() {
        myHashMap.put(1, 1);
        myHashMap.put(2, 2);
        assertEquals(1, myHashMap.get(1));
    }

    @Test
    void get() {
        myHashMap.put(1, 1);
        myHashMap.put(2, 2);
        assertEquals(1, myHashMap.get(1));
        assertEquals(2, myHashMap.get(2));
        assertEquals(-1, myHashMap.get(7));
    }

    @Test
    void remove() {
        myHashMap.put(1, 1);
        myHashMap.put(2, 2);
        assertEquals(1, myHashMap.get(1));
        assertEquals(2, myHashMap.get(2));
        myHashMap.remove(2);
        assertEquals(-1, myHashMap.get(2));
    }
}