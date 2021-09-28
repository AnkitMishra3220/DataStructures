package com.ankit.ds.collection;

import java.util.*;

public class LearnSet {

    public static void main(String[] args) {


        //Insert/Delete: O(1) amortized - HashSet
       // Re-size/hash: O(n) - HashSet
       //  Contains: O(1) - HashSet
        // TreeSet - Log(n)

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Anuj", 2));
        studentSet.add(new Student("Ramesh", 4));
        studentSet.add(new Student("Shivam", 3));

        studentSet.add(new Student("Rohit", 2));

        Student s1 = new Student("Anuj", 2);
        Student s2 = new Student("Rohit", 2);

        System.out.println(s1.equals(s2));
        System.out.println(studentSet);

//        Set<Integer> set = new HashSet<>();
        Set<Integer> linkedHashset = new LinkedHashSet<>(); // Maintain insertion order
        linkedHashset.add(32);
        linkedHashset.add(56);
        linkedHashset.add(99);
        System.out.println("Linked Hash Set : " +linkedHashset);

        Set<Integer> treeSet = new TreeSet<>(); // Sorting Order ascending by default

        treeSet.add(32);
        treeSet.add(2);
        treeSet.add(54);
        treeSet.add(21);
        treeSet.add(65);



        System.out.println("TreeSet :" +treeSet);

        Set<Integer> treeSetDesc = new TreeSet<>(Comparator.reverseOrder());

        treeSetDesc.add(32);
        treeSetDesc.add(2);
        treeSetDesc.add(54);
        treeSetDesc.add(21);
        treeSetDesc.add(65);

        System.out.println("TreeSet Desc:" +treeSetDesc);


//
//        set.remove(54);
//
//        System.out.println(set);
//
//        System.out.println(set.contains(21));
//
//        System.out.println(set.isEmpty());
//
//        System.out.println(set.size());
//
//        set.clear();
//
//        System.out.println(set);
    }

}
