package lester.github.com.practice;

import java.util.*;

/**
 * Created by lyy on 2017/6/19.
 */
public class CollectionsPractice {


    public static void main(String[] args) {
        int[] intArray = {3, 8, 4, 5, 6, 2, 9};
        getNaturalOrdering(intArray);

        Map<Integer, String> employeeDeptMap = new HashMap<>();
        employeeDeptMap.put(6142, "R&D");
        employeeDeptMap.put(6143, "R&D");
        employeeDeptMap.put(6144, "R&D");
        employeeDeptMap.put(6145, "TS");
        employeeDeptMap.put(6146, "TS");
        employeeDeptMap.put(6147, "HR");

        iterateMap(employeeDeptMap);

        String rdDept = "R&D";
        removeDeptByIterator(employeeDeptMap, rdDept);

        String tsDept = "TS";
        removeDept(employeeDeptMap, tsDept);

    }

    /**
     * Map.Entry<K,V> - A map entry (key-value pair).
     * Map.entrySet - Returns a Set view of the mappings contained in this map.
     */
    private static void iterateMap(Map<Integer, String> employeeDeptMap) {
        for (Map.Entry entry : employeeDeptMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

    /**
     * Iterator - enables the user to remove elements from the backing collection with well-defined, useful semantics.
     * The Map.entrySet supports element removal, except through the Iterator.remove
     */
    private static void removeDeptByIterator(Map<Integer, String> employeeDeptMap, String dept) {
        Iterator iterator = employeeDeptMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            if (entry.getValue().equals(dept)) {
                iterator.remove();
            }
        }
        System.out.println(employeeDeptMap.toString());
    }

    /**
     * Map - A mapping from keys to values. Each key can map to one value.
     * Collection<V> values()
     * Returns a Collection view of the values contained in this map.
     * Collection - A group of objects.
     * boolean removeAll(Collection<?> c)
     * Removes all of this collection's elements that are also contained in the specified collection.
     */
    private static void removeDept(Map<Integer, String> employeeDeptMap, String dept) {
        Set removedDeptSet = new HashSet<>();
        removedDeptSet.add(dept);

        employeeDeptMap.values().removeAll(removedDeptSet);

        System.out.println(employeeDeptMap.toString());
    }

    /**
     * Set - No duplicate elements permitted. May or may not be ordered.
     * TreeSet - Red-black tree implementation.
     * The elements are ordered using their natural ordering.
     */
    private static void getNaturalOrdering(int[] intArray) {
        TreeSet data = new TreeSet();
        for (int i = 0; i < intArray.length; i++) {
            data.add(intArray[i]);
        }
        System.out.println(data.toString());
    }


}
