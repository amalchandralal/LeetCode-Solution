class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();


        for(char ch : s.toCharArray()){
            if(ch == '(' || ch ==  '{' || ch ==  '['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.peek();
                if((ch == ')' && top != '(') ||
                   (ch == '}' && top != '{') ||
                   (ch == ']' && top != '[')
                ){
                    return false;
                }else{
                    stack.pop();
                }

            }

        }
        return stack.isEmpty();
        
    }
}