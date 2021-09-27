package com.ankit.ds.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class MapReduceFilter {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,4,6,7,8);

        int sum1 = integerList.stream().mapToInt(x -> x).sum();

        System.out.println("sum 1:" +sum1);
       // integerList.stream().mapToInt(Integer::intValue).sum();

        int sum2 = integerList.stream().reduce(0,(a,b)->a+b);
        System.out.println("sum 2:" +sum2);

        int sum3 = integerList.stream().reduce(0,Integer::sum);

        System.out.println("sum 3 :" +sum3);

        Employee emp1 = new Employee(101,"Ankit",20000,"Pune");
        Employee emp2 = new Employee(102,"Atul",25000,"Pune");
        Employee emp3 = new Employee(103,"Mukul",28000,"Pune");
        Employee emp4 = new Employee(104,"Amit",21000,"Pune");
        Employee emp5 = new Employee(105,"Raj",30000,"Pune");
        Employee emp6 = new Employee(106,"Deepak",35000,"Pune");
        Employee emp7 = new Employee(107,"Ayushi",50000,"Pune");

        List<Employee> employeeList = Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6,emp7);

        double avgSal = employeeList.stream()
                .filter(x -> x.getAddress().equalsIgnoreCase("pune"))
                .map(x -> x.getSalary())
                .mapToDouble(i -> i).average().getAsDouble();

        System.out.println("avgSal :" +avgSal);

    }
}
