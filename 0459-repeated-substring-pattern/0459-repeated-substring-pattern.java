class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        for(int i = 1 ;i <= length/2;i++){
            if(length%i == 0){
                int len = i;
                 
                String pattern = s.substring(0,len);
                String repeated = pattern.repeat(length/len);
                if(s.equals(repeated)){
                    return true;
                }

            }
        }
        return false;
        
    }
}