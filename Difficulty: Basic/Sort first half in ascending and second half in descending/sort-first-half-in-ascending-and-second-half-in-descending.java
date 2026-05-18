// User function Template for Java

class Solution {
    public ArrayList<Integer> customSort(int[] arr) {
        // your code
        ArrayList<Integer> list=new ArrayList<>();
        int n=arr.length;
        int half =n/2;
       int[]asc=new int[half];
    int []desc=new int[n-half];
        for(int i=0;i<half;i++){
            asc[i]=arr[i];
            
        }
        Arrays.sort(asc);
        for(int i:asc){
            
            list.add(i);
        }
        
        for(int i=n-1;i>=half;i--){
            desc[i-half]=arr[i];
            
            
        }
         Arrays.sort(desc);
          for (int i = desc.length - 1; i >= 0; i--) {
            list.add(desc[i]);
        }

        
        return list;
        
    }
}