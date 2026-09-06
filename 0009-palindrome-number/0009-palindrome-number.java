class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 ) return false;
        int original = x;
        int reversed = reverse(x,0);
        return reversed == original;
        
    }
    public int reverse(int x,int rev){
        if(x == 0 ){
            return rev;
        }
        return reverse(x/10, rev*10 + x%10);
    }
}