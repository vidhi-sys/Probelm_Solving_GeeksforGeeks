class twoStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    
    twoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    void push1(int x) {
        stack1.push(x);
    }
    
    void push2(int x) {
        stack2.push(x);
    }
    
    int pop1() {
        return stack1.isEmpty() ? -1 : stack1.pop();
    }
    
    int pop2() {
        return stack2.isEmpty() ? -1 : stack2.pop();
    }
}