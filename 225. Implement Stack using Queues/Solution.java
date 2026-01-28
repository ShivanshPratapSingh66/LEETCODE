class MyStack {
    Queue<Integer> Q = new LinkedList<>();
    Queue<Integer> Q1 = new LinkedList<>();

    public MyStack() {

    }

    public void push(int x) {
        Q.offer(x);

    }

    public int pop() {
        if (Q.isEmpty()) {
            return -1;
        }

        while (Q.size() > 1) {
            Q1.offer(Q.poll());
        }

        int pop = Q.poll();

        // swap queues
        while (!Q1.isEmpty()) {
            Q.offer(Q1.poll());
        }

        return pop;
    }

    public int top() {
        if (Q.isEmpty()) {
            return -1;
        }

        while (Q.size() > 1) {
            Q1.offer(Q.poll());
        }

        int top = Q.poll();
        Q1.offer(top);

        // swap queues
        while (!Q1.isEmpty()) {
            Q.offer(Q1.poll());
        }

        return top;
    }

    public boolean empty() {
        if (Q.isEmpty() && Q1.isEmpty())
            return true;
        return false;
    }
}
