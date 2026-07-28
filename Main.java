import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        // System.out.println(stack.empty());
        stack.push("Hello");
        stack.push("World");

        System.out.println(stack);
    }
}

//Stack Data Structure
//A stack is a data structure that follows the LIFO principle. It is a collection of elements with two main operations:
//push: add an element to the collection
//pop: remove the most recently added element that was not yet removed
//The order of the elements in the collection is the order in which they were added to the collection.
//The LIFO principle means that the last element added to the collection will be the first one to be removed.
//The stack is a Last In First Out (LIFO) data structure.
//The stack is a data structure that follows the LIFO principle. It is a collection of elements with two main operations: