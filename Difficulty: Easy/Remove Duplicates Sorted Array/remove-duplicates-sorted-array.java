class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int a : arr) {
            set.add(a);
        }
        
        Integer[] uniqueArr = set.toArray(new Integer[0]);
        Arrays.sort(uniqueArr);
        
        return new ArrayList<>(Arrays.asList(uniqueArr));
    }
}