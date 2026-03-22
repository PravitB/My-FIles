// 24. Design a stack class. Provide your own stack exceptions namely push exception and pop exception.

class StackFullException extends Exception {
    StackFullException(String message) {
        super(message);
    }
}

class StackEmptyException extends Exception {
    StackEmptyException(String message) {
        super(message);
    }
}

class MyStack {
    private int[] stack;
    private int top;
    private int capacity;

    MyStack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    void push(int value) throws StackFullException {
        if (top == capacity - 1) {
            throw new StackFullException("Stack is full. Cannot push " + value);
        }
        stack[++top] = value;
        System.out.println("Pushed: " + value);
    }

    int pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty. Cannot pop");
        }
        int value = stack[top--];
        System.out.println("Popped: " + value);
        return value;
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

public class StackDemo {
    public static void main(String[] args) {
        MyStack stack = new MyStack(3);

        try {
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40); // This will throw exception
        } catch (StackFullException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        stack.display();

        try {
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop(); // This will throw exception
        } catch (StackEmptyException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
