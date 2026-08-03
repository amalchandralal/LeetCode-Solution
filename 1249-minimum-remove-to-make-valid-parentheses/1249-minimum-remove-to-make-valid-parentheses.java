class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        HashSet<Integer> set = new HashSet<>();

        int i = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(i);
            }else if(c == ')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    set.add(i);
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