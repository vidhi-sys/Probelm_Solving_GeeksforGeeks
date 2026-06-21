class Solution {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        Arrays.sort(prices);

        int minCost = 0;
        int maxCost = 0;

        int i = 0, j = prices.length - 1;

        // Minimum cost
        while (i <= j) {
            minCost += prices[i];
            i++;
            j -= k;
        }

        // Maximum cost
        i = 0;
        j = prices.length - 1;

        while (i <= j) {
            maxCost += prices[j];
            j--;
            i += k;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(minCost);
        ans.add(maxCost);

        return ans;
    }
}