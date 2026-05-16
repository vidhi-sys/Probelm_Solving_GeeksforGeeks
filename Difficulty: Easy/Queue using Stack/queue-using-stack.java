import java.util.Stack;
import java.util.Scanner;
 
class myQueue {
    private Stack<Integer> input;   // Stack for enqueue operations
    private Stack<Integer> output;  // Stack for dequeue operations
 
    // Constructor - Initialize your data members
    myQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }
 
    // Implement enqueue operation
    void enqueue(int x) {
        input.push(x);
    }
 
    // Implement dequeue operation
    void dequeue() {
        if (size() == 0) {
            return;
        }
        
        // If output stack is empty, transfer all elements from input to output
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        
        // Remove from output stack
        if (!output.isEmpty()) {
            output.pop();
        }
    }
 
    // Implement front operation
    int front() {
        if (size() == 0) {
            return -1;
        }
        
        // If output stack is empty, transfer all elements from input to output
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        
        // Return top of output stack (front of queue)
        if (!output.isEmpty()) {
            return output.peek();
        }
        return -1;
    }
 
    // Implement size operation
    int size() {
        return input.size() + output.size();
    }
}