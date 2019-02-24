package hackerrank.xylemraj.mmt.hackerrank;

import java.util.PriorityQueue;

public class Priorities {

    public static void main(String[] args){

        PriorityQueue toDo = new PriorityQueue();
        toDo.add("dishes");
        toDo.add("laundry");
        toDo.add("bills");
        toDo.offer("bills");
        System.out.print(toDo.size() + " " + toDo.poll());
        System.out.print( " "+ toDo.peek() + " " + toDo.poll());
        System.out.print( " "+ toDo.poll() + " " + toDo.poll());
    }
}
