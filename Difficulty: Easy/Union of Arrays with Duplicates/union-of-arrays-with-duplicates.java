class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:set){
            list.add(i);
        }
        return list;
        
    }
}