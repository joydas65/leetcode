class StackElem{
    public int value;
    public int min;
    public StackElem next;
    
    StackElem(int value, int min){
        this.value = value;
        this.min = min;
    }
}

class MinStack {

    /** initialize your data structure here. */
    StackElem top;
    
    public MinStack() {
        top = null;
    }
    
    public void push(int x) {
        if(top == null){
            StackElem s = new StackElem(x, x);
            s.next = null;
            top = s;
        }else{
            StackElem s = new StackElem(x, Math.min(x, top.min));
            s.next = top;
            top = s;
        }
    }
    
    public void pop() {
        if(top == null)
            return;
        StackElem s = top.next;
        top.next = null;
        top = s;
    }
    
    public int top() {
        if(top == null)
            return -1;
        return top.value;
    }
    
    public int getMin() {
        if(top == null)
            return -1;
        return top.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
