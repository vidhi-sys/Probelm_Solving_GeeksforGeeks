class Solution {
   static int maxMeetings(int[] s, int[] f) {
       int n=s.length;
       int[][]arr=new int[n][2];
       
       for(int i=0;i<n;i++){
           arr[i][0]=f[i];
           arr[i][1]=i;
           
       }
       Arrays.sort(arr,(x,y)->x[0]-y[0]);
        List<Integer> ans = new ArrayList<>();

        // pick first meeting
        int lastfinish = arr[0][0];
        ans.add(arr[0][1] + 1);
        for(int i=0;i<n;i++){
            if(s[arr[i][1]]>lastfinish){
                ans.add(arr[i][1]+1);
                lastfinish=arr[i][0];
            }
        }
        Collections.sort(ans);
        return(ans.size());
   }
    public int activitySelection(int[] start, int[] finish) {
        
        return maxMeetings(start,finish);
        
        
        
    }
}
