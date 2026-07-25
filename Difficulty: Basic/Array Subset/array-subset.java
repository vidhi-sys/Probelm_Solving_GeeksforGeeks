import java.util.*;

class Solution {
    public boolean isSubset(int a[], int b[]) {

        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        // Frequency of elements in a
        for (int ele : a) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        // Frequency of elements in b
        for (int ele : b) {
            map2.put(ele, map2.getOrDefault(ele, 0) + 1);
        }

        // Check frequencies
        for (int ele : map2.keySet()) {
            if (!map.containsKey(ele))
                return false;

            if (map.get(ele) < map2.get(ele))
                return false;
        }

        return true;
    }
}