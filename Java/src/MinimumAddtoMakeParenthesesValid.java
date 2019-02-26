import java.util.Stack;

class MinimumAddtoMakeParenthesesValid {
    public int minAddToMakeValid(String S) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++){
            if (S.charAt(i) == '('){
                stack.push('(');
            } else {
                if (!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                } else {
                    stack.push(')');
                }
            }
        }
        return stack.size();
    }
    public static void main(String[] args){
        MinimumAddtoMakeParenthesesValid S = new MinimumAddtoMakeParenthesesValid();
        System.out.println(S.minAddToMakeValid("()))(("));
    }

}
