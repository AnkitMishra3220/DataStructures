package com.ankit.ds.collection;

import java.util.Vector;

public class LearnVector {

    // The Vector class synchronizes each individual operation.
    // This means whenever we want to perform some operation on vectors,
    // the Vector class automatically applies a lock to that operation.
    // Vector are not thread safe.

    //It is because when one thread is accessing a vector,
    // and at the same time another thread tries to access it,
    // an exception called ConcurrentModificationException is generated.
    // Hence, this continuous use of lock for each operation makes vectors less efficient.

    public static void main(String[] args) {
        Vector<String> mammals= new Vector<>();

        // Using the add() method
        mammals.add("Dog");
        mammals.add("Horse");

        // Using index number
        mammals.add(2, "Cat");
        System.out.println("Vector: " + mammals);

        // Using addAll()
        Vector<String> animals = new Vector<>();
        animals.add("Crocodile");

        animals.addAll(mammals);
        System.out.println("New Vector: " + animals);
    }
}
