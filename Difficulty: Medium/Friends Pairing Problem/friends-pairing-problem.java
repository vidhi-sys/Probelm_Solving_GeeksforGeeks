class Solution {
    public int countFriendsPairings(int n) {
        // code here
        if(n<=2){
            return n;
        }
        return (n-1)*countFriendsPairings(n-2)+countFriendsPairings(n-1);
    }
}
