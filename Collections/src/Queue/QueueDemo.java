package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("e");
        System.out.println(queue);

        var front = queue.peek();
        System.out.println(front);

        var rmFront = queue.remove(); // if empty throw exception
        System.out.println(rmFront);

        var element = queue.poll();
    }
}
