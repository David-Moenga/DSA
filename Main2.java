import java.util.Queue;
import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();
        queue.offer("Hello");
        queue.offer("World");
        
        System.out.println(queue);
        
    }
}
//Queue Data Structure
//A queue is a data structure that follows the FIFO principle. It is a collection of elements with two main operations:
//enqueue: add an element to the collection
//dequeue: remove the most recently added element that was not yet removed
//The order of the elements in the collection is the order in which they were added to the collection.
//The FIFO principle means that the first element added to the collection will be the first one to be removed.
//Queues are useful when you need to process elements in the order they were added to the collection.