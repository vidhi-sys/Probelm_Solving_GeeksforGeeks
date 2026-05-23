class Solution {

    boolean palindrome(char[] ch, int l, int r) {

        if (l >= r) {
            return true;
        }

        if (ch[l] != ch[r]) {
            return false;
        }

        return palindrome(ch, l + 1, r - 1);
    }

    boolean isPalindrome(String s) {

        char[] ch = s.toCharArray();

        int l = 0;
        int r = s.length() - 1;

        return palindrome(ch, l, r);
    }
}