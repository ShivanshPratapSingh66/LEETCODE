class Solution {
    public boolean isValid(String s) {
        int i = 0;
        Stack<Character> st = new Stack<>();
        if(s.length()<=1) return false;
        while (i < s.length()) {
            char ch = s.charAt(i++);
            if (ch == '(' || ch == '{' || ch == '[')
                st.push(ch);
            else {
                if (!st.isEmpty() && ch == ')') {
                    if (st.peek() == '(')
                        st.pop();
                    else
                        return false;
                } else if (!st.isEmpty() && ch == ']') {
                    if (st.peek() == '[')
                        st.pop();
                    else
                        return false;
                } else if (!st.isEmpty() && ch == '}') {
                    if (st.peek() == '{')
                        st.pop();
                    else
                        return false;
                } else
                    return false;
            }
        }
        if(st.isEmpty())
        return true;
        return false;

    }
}
