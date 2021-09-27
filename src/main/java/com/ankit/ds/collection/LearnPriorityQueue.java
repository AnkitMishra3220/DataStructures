package com.ankit.ds.collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {

   // Find Min/Find Max: O(1)
   // Insert: O(log n)
   // Delete Min/Delete Max: O(log n)
   // Extract Min/Extract Max: O(log n)
   //  Lookup, Delete (if at all provided): O(n),
    //  we will have to scan all the elements as they are not ordered like BST

    public static void main(String[] args) {

        Queue<Integer> numbers = new PriorityQueue<>(); // Default Min Heap

        // offer elements to the Queue
        numbers.offer(5);
        numbers.offer(1);
        numbers.offer(2);
        System.out.println("Queue: " + numbers);

        // Access elements of the Queue
        int accessedNumber = numbers.peek();
        System.out.println("Accessed Element: " + accessedNumber);

        // Remove elements from the Queue
        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);

        System.out.println("Updated Queue: " + numbers);

        Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.offer(10);
        maxHeap.offer(100);
        maxHeap.offer(1000);
        System.out.println("Max Heap: " +maxHeap);

        // Access elements of the Queue
        int accessedNumberMaxHeap = maxHeap.peek();
        System.out.println("Max Heap Accessed Element: " + accessedNumberMaxHeap);

        // Remove elements from the Queue
        int removedNumberMaxHeap = maxHeap.poll();
        System.out.println("Max Heap Removed Element: " + removedNumberMaxHeap);

        // Access elements of the Queue
        int accessedNumberMaxHeap2 = maxHeap.peek();
        System.out.println("Max Heap Accessed Element 2: " + accessedNumberMaxHeap2);

    }
}
