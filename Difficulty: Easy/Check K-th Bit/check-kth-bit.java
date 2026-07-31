class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        if((n>>k)%2==0){
            return false;
        }
        return true;
    }
}