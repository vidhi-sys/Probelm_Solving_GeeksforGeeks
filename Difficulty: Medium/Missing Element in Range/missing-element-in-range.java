class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        // code here
        HashSet<Integer>set=new HashSet<>();
        ArrayList<Integer> missing=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int i=low;i<=high;i++){
            if(!set.contains(i)){
                missing.add(i);
            }
        }
        return missing;
        
    }
}