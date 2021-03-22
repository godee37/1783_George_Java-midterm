package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {


    /*
     * Demonstrate how to use Queue that includes add, peek, remove & poll elements.
     * Use For-Each loop and While-Loop with Iterator to retrieve data.
     *
     * Store and retrieve data from/to a database table.
     */

    public static void main(String[] args) {
        //Queue is a collection interface and needs to declare concrete class - Linkedlist or PriorityQueue

        Queue<Integer> number = new LinkedList<>();

        //Adding elements to the Queue
        for (int q = 0; q < 10; q++)
            number.add(q);

        // Display output
        System.out.println("Printing add elements to the queue\n" + number);


        //Removing element from the queue
        // insert elements at the end of the list and deleting elements from the start
        System.out.print("Removing the first element of the queue\n");
        int rem = number.remove();
        for (int val : number) {

            System.out.print(val);
        }

//Utilizing Peek
        int head = number.peek();
        System.out.println("\nThis is the head of the queue\n\t\t\t" + head);

        //polling element is the same as polling
        int search = number.poll();

        System.out.println("Polling form the queue\n\t\t\t" + search);

        //demonstrating the size of the queue

        int demo = number.size();
        System.out.println("This is the size of the queue\n\t\t\t" + demo);

        //Using iteration for queue operation
        Iterator sequence = number.iterator();
        while (sequence.hasNext() ){
            System.out.print(sequence.next() + " ");
        }

        }

    }


