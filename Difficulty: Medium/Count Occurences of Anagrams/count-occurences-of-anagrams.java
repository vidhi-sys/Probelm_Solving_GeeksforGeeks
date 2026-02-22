// User function Template for Java

class Solution {

    int search(String pat, String txt) {
 List<Integer> ans = new ArrayList<>();
        if (txt.length() < pat.length()) return 0;

        Map<Character, Integer> map = new HashMap<>();
        
        for (char c : pat.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int count = map.size();
        int k = pat.length();
        int i = 0, j = 0;

        while (j < txt.length()) {

            char endChar = txt.charAt(j);
            if (map.containsKey(endChar)) {
                map.put(endChar, map.get(endChar) - 1);
                if (map.get(endChar) == 0) {
                    count--;
                }
            }

            if (j - i + 1 < k) {
                j++;
            } 
            else if (j - i + 1 == k) {

                if (count == 0) {
                    ans.add(i);
                }

                char startChar = txt.charAt(i);
                if (map.containsKey(startChar)) {
                    map.put(startChar, map.get(startChar) + 1);
                    if (map.get(startChar) == 1) {
                        count++;
                    }
                }

                i++;
                j++;
            }
        }

        return ans.size();
    }
}