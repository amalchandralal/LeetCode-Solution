class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> helperStack = new Stack<>();
        for(String token : tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int b = helperStack.pop();
                int a = helperStack.pop();
                switch(token){
                    case "+":
                        helperStack.push(a+b);
                        break;
                    case "-":
                        helperStack.push(a-b);
                        break;
                    case "*":
                        helperStack.push(a*b);
                        break;
                    case "/":
                        helperStack.push(a/b);
                        break;
                }
            }else{
                helperStack.push(Integer.parseInt(token));
            }
        }
        return helperStack.pop();
        
    }
}