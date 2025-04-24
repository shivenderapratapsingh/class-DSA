class twoStacks {
    int[] arr; 
    int size;
    int top1, top2; 
    twoStacks() {
        this(200); // Default size if not specified
    }
    twoStacks(int n) {
        size = n;
        arr = new int[n];
        top1=-1;
        top2=n;
        
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        // code here
        arr[++top1]=x;
        
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        // code here
        arr[--top2]=x;
        
    }

    // Function to remove an element from top of the stack1.
    int pop1() {
        // code here
        if(top1==-1) return -1;
        int a=arr[top1];
        top1--;
        return a;
    }

    // Function to remove an element from top of the stack2.
    int pop2() {
        // code here
        if(top2==size) return -1;
        int b=arr[top2];
        top2++;
        return b;
    }
}
