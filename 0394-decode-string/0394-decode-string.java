class Solution {
    public String decodeString(String s) {
        
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for(char ch : s.toCharArray()){
            if(ch != ']'){
                stack.push(ch);
            }else{
                StringBuilder currentString = new StringBuilder();
                while(!stack.isEmpty() && stack.peek() != '['){
                    currentString.insert(0,stack.pop());
                }
                stack.pop();
                StringBuilder number = new StringBuilder();
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                    number.insert(0,stack.pop());
                }
                int repeat = Integer.parseInt(number.toString());

                StringBuilder repeated = new StringBuilder();
                for(int i = 0 ; i < repeat;i++){
                    repeated.append(currentString);
                }
                for(char c : repeated.toString().toCharArray()){
                    stack.push(c);
                }
            }
        }
        StringBuilder answer = new StringBuilder();
        while(!stack.isEmpty()){
            answer.insert(0,stack.pop());
        }
        return answer.toString();
    }
}