class Solution {
    public String minRemoveToMakeValid(String s) {

        StringBuilder first = new StringBuilder();
        int balance = 0;

        // Remove extra ')'
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                balance++;
                first.append(ch);
            } else if (ch == ')') {
                if (balance > 0) {
                    balance--;
                    first.append(ch);
                }
            } else {
                first.append(ch);
            }
        }

        StringBuilder ans = new StringBuilder();

        // Remove extra '('
        for (int i = first.length() - 1; i >= 0; i--) {
            char ch = first.charAt(i);

            if (ch == '(' && balance > 0) {
                balance--;
                continue;
            }

            ans.append(ch);
        }

        return ans.reverse().toString();
    }
}