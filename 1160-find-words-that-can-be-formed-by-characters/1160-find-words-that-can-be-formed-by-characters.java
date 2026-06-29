class Solution {
    public int countCharacters(String[] words, String chars) {
        int []available = new int[26];
        for(char c : chars.toCharArray()){
            available[c-'a']++;
        }
        int ans = 0;
        for(String word : words){
            boolean valid = true;
            int freq[] = new int[26];
            for(char c: word.toCharArray()){
                int index = c-'a';
                freq[index]++;
                if(freq[index] > available[index]){
                    valid = false;
                    break;
                }
            }
            if(valid){
                ans+= word.length();
            }
        }
        return ans;
        
    }
}