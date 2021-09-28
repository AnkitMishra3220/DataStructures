package com.ankit.ds.collection;

import java.util.Stack;

 // Push: O(1)
 // Pop: O(1)
//  Top: O(1)
//  Search : O(n)

public class LearnStack {

    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack:" +animals);

        System.out.println("Top Element :" +animals.peek()); // Cat last element

        String element = animals.pop();

        System.out.println("Poped Element :" +element);

        System.out.println("Stack after POP :" +animals);

        System.out.println("Search Element :" +animals.search("Dog")); //It returns the position of the element from the top of the stack






    }
}
