class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> group = new HashMap<>();
        for(String str : strs){
            String freqKey = getFrequencyString(str);
            if(group.containsKey(freqKey)){
                group.get(freqKey).add(str);
            }else{
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                group.put(freqKey,list);
            }
        }
        return new ArrayList<>(group.values());
        
    }
    public String getFrequencyString(String s){
        int []freq = new int[26];
        for(int i = 0 ;i < s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder freqString = new StringBuilder();
        for(int i= 0 ;i < 26;i++){
            if(freq[i] > 0){
                freqString.append((char)(i+'a'));
                freqString.append(freq[i]);
            }
        }
        return freqString.toString();
    }
}