class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : arr) {

            if (num < min) {
                secondMin = min;
                min = num;
            }

            else if (num > min && num < secondMin) {
                secondMin = num;
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            ans.add(-1);
        } else {
            ans.add(min);
            ans.add(secondMin);
        }

        return ans;
    }
}