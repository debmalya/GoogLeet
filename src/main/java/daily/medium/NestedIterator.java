package daily.medium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * You are given a nested list of integers nestedList.
 * Each element is either an integer or a list whose elements may also be integers or other lists. Implement an iterator to flatten it.
 * <p>
 * Implement the NestedIterator class:
 * <p>
 * NestedIterator(List<NestedInteger> nestedList) Initializes the iterator with the nested list nestedList.
 * int next() Returns the next integer in the nested list.
 * boolean hasNext() Returns true if there are still some integers in the nested list and false otherwise.
 */
public class NestedIterator implements Iterator<Integer> {

    List<Integer> list;

    private int cursor;


    public NestedIterator(List<NestedInteger> nestedList) {
        this.list = new ArrayList<>();
        flatten(nestedList);
        cursor = 0;
    }

    private void flatten(List<NestedInteger> nestedList) {
        for (NestedInteger nestedMember : nestedList) {
            if (nestedMember.isInteger()) {
                list.add(nestedMember.getInteger());
            } else {
                flatten(nestedMember.getList());
            }
        }
    }


    @Override
    public boolean hasNext() {
        return cursor < list.size();
    }

    @Override
    public Integer next() {
        int i = cursor;
        if (i >= list.size()) {
            throw new NoSuchElementException();
        }
        cursor = i + 1;
        return list.get(i);
    }
}
