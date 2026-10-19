class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length()-1;
        char []arr = s.toCharArray();
        while(left < right){
            while( left < right && !isVowel(arr[left])){
                left++;
            }
            while( left < right && !isVowel(arr[right])){
                right--;
            }
            swap(arr,left,right);
            left++;
            right--;
        }
        return new String(arr);

        
    }
    public void swap(char []arr,int left, int right){
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        
    }
    public boolean isVowel(char ch){
        char temp = Character.toLowerCase(ch);
        if(temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u'){
            return true;
        }
        return false;
    }
}