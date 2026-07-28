import java.util.*;


public class Main3 {
    public static void main(String[] args) {
        
        Queue<Double> queue = new PriorityQueue<Double>();

        queue.offer(4.0);
        queue.offer(3.0);
        queue.offer(2.0);
        queue.offer(1.0);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    
        
    }
}
// Priority Queue Data Structure
//ensures that the element with the highest priority is removed first
// A priority queue is a data structure that follows the FIFO principle. It is a collection of elements with two main operations: