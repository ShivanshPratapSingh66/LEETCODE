class MyQueue {
     Stack<Integer> st = new Stack<>();
       Stack<Integer> st1 = new Stack<>();
    public MyQueue() {
     

    }
    
    public void push(int x) {
       st.push(x);
    }
    
    public int pop() {
     
        while(!st.isEmpty()){
           st1.push(st.peek());
           st.pop();
        }
       int pop= st1.pop();
         while(!st1.isEmpty()){
           st.push(st1.pop());
        }
        return pop;

    }
    
    public int peek() {
         while(!st.isEmpty()){
           st1.push(st.pop());
        }
       int top= st1.peek();
         while(!st1.isEmpty()){
        st.push(st1.pop());
    }
    return top;
    }
    
    public boolean empty() {
        if(st.isEmpty() && st1.isEmpty())
        return true;
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
