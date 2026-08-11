class Solution {
    public String decodeString(String s) {
        ArrayDeque<StringBuilder> stringStack = new ArrayDeque<>();
        ArrayDeque<Integer> numberStack = new ArrayDeque<>();
        int number = 0;
        StringBuilder currentString = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                number = number * 10 + (ch-'0');
            }else if(ch == '['){
                numberStack.push(number);
                stringStack.push(currentString);

                number = 0;
                currentString = new StringBuilder();
            }else if(ch == ']'){
                int repeat = numberStack.pop();
                StringBuilder previousString = stringStack.pop();

                for(int i = 0;i< repeat;i++){
                    previousString.append(currentString);
                }
                
                currentString = previousString;
            }else{
                currentString.append(ch);
            }
        }
        return currentString.toString();
        
    }
}