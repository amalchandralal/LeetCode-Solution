class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        
        backTrack(list,"",0,0,n);
        return list;
        
    }
    public void backTrack(List<String> ans,String current, int open, int close , int n){
        if(current.length() == n*2){
            ans.add(current);
            return ;
        }
        if(open < n){
            backTrack(ans, current+"(",open+1,close,n);
        }
        if(close < open){
            backTrack(ans, current+")",open, close+1,n);
        }
    }
}