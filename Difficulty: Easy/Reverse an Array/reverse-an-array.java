class Solution {
    public void reverseArray(int arr[]) {
        // code here
        ArrayList<Integer>list=new ArrayList<>();
        for(int i:arr){
            list.add(i);
        }
        Collections.reverse(list);
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        
    }
}