class Solution {
    public int longestUniqueSubstr(String s) {
        HashSet<Character> set = new HashSet<>();

        int i = 0; // left
        int j = 0; // right
        int len = 0;

        while (j < s.length()) {

            // If character is not present, expand window
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                len = Math.max(len, j - i);
            }

            // Duplicate found → shrink from left
            else {
                set.remove(s.charAt(i));
                i++;
            }
        }

        return len;
    }
}