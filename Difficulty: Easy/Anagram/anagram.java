class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length()){
            return false;
        }
        char[]c1=s1.toCharArray();
        char[]c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return (Arrays.equals(c1,c2));
    }
}