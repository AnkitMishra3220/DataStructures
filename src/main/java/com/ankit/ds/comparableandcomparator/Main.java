package com.ankit.ds.comparableandcomparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Vipul",60));
        studentList.add(new Student("Atul",30));
        studentList.add(new Student("Arun",100));
        studentList.add(new Student("Vikas",80));
        studentList.add(new Student("Tarun",90));
        studentList.add(new Student("Amit",6));


        Student st1 = new Student("Ankit",70);
        Student st2 = new Student("Zaid",80);

        System.out.println(st1.compareTo(st2));

        Collections.sort(studentList);

        studentList.stream().forEach(System.out::println);

    }
}
