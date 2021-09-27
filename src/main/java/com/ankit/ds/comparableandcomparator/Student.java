package com.ankit.ds.comparableandcomparator;

public class Student implements Comparable{
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        // Decreasing order
        if(this.marks>student.marks){
            return -1;
        }else if(this.marks<student.marks){
            return +1;
        }else {
            return 0;
        }

    }
}
