class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        int n=val.length;
        double[][] item= new double[n][3];
        for(int i=0;i<n;i++){
            item[i][0]=val[i];
            item[i][1]=wt[i];
            item[i][2]=(double)val[i]/wt[i];
        }
        Arrays.sort(item,(a,b)->Double.compare(b[2],a[2]));
        double max_profit=0.0;
        for(int i=0;i<n;i++){
            if(capacity>=item[i][1]){
                max_profit+=item[i][0];
                capacity-=item[i][1];
            }else{
                max_profit+=item[i][2]*capacity;
                break;
            }
        }
        return max_profit;
    }
}