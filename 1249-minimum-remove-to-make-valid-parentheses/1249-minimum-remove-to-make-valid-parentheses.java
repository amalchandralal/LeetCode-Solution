class Solution {
    public String minRemoveToMakeValid(String s) {
        HashSet<Integer> set = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(i);
            }
            if(c == ')'){
                if(stack.isEmpty()){
                    set.add(i);
                }else{
                    stack.pop();
                }
            }
            i++;
        }
        while(!stack.isEmpty()){
            set.add(stack.pop());
        }
        StringBuilder result = new StringBuilder();
        for(int j = 0;j < s.length();j++){
            if(!set.contains(j)){
                result.append(s.charAt(j));
            }
        }

        return result.toString();
        
    }
}