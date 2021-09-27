package com.ankit.ds.java8;

import java.util.*;

public class Sorting {

    public static void main(String[] args) {

        Employee emp1 = new Employee(101,"Ankit",20000,"Pune");
        Employee emp2 = new Employee(102,"Atul",25000,"Pune");
        Employee emp3 = new Employee(103,"Mukul",28000,"Pune");
        Employee emp4 = new Employee(104,"Amit",21000,"Pune");
        Employee emp5 = new Employee(105,"Raj",30000,"Pune");
        Employee emp6 = new Employee(106,"Deepak",35000,"Pune");
        Employee emp7 = new Employee(107,"Ayushi",50000,"Pune");

        List<Employee> employeeList = Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6,emp7);

        employeeList.stream().sorted((o1,o2) -> o1.getSalary() - o2.getSalary()).forEach(System.out::println);
        System.out.println("***");
        employeeList.stream().sorted((o1,o2) -> o1.getEmpName().compareTo(o2.getEmpName())).forEach(System.out::println);
        // Amazing
        employeeList.stream().sorted(Comparator.comparing(employee -> employee.address)).forEach(System.out::println);

        employeeList.stream().sorted(Comparator.comparing(Employee::getAddress)).forEach(System.out::println);


        Map<String,Integer> map = new HashMap<>();

        map.put("eigth",8);
        map.put("two",2);
        map.put("three",3);
        map.put("ten",10);
        map.put("four",4);

        List<Map.Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());

        System.out.println("**********************************");

        for (Map.Entry<String,Integer> entry:entries) {
            System.out.println("Key : " +entry.getKey() + "-->" +entry.getValue());
        }

        System.out.println("**********************************");

        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        Collections.sort(entries,((o1, o2) -> o1.getKey().compareTo(o2.getKey())));

        for (Map.Entry<String,Integer> entry:entries) {
            System.out.println("Key : " +entry.getKey() + "-->" +entry.getValue());
        }
        System.out.println("++++++++++++++++++++++++++++");

        Map<String,Integer> map1 = new HashMap<>();

        map1.put("eigth",8);
        map1.put("two",2);
        map1.put("three",3);
        map1.put("ten",10);
        map1.put("four",4);

        Map<String,Integer> map2 = new HashMap<>();

        map1.entrySet().stream().forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++");
        map1.entrySet().stream().sorted((o1, o2) -> o1.getKey().compareTo(o2.getKey())).forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++");
      //  map1.entrySet().stream().forEach(System.out::println);
        map1.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(x -> {
            map2.put(x.getKey(), x.getValue());
        });
        System.out.println("--------------------------------");
        map2.entrySet().stream().forEach(System.out::println);


        // Sorting on Object key attribute

        Map<Employee,Integer> mapOfEmp = new TreeMap<>(((o1, o2) -> o1.getEmpId()-o2.getSalary()));

        mapOfEmp.put(new Employee(123,"Ankit",20000,"Pune"),31);
        mapOfEmp.put(new Employee(111,"Ayushi",50000,"Pune"),31);
        mapOfEmp.put(new Employee(190,"Yogi",30000,"Noida"),31);
        mapOfEmp.put(new Employee(100,"Vikas",28000,"Noida"),31);
        mapOfEmp.put(new Employee(99,"Atul",26000,"Sitapur"),31);

        mapOfEmp.entrySet().forEach(System.out::println);

        System.out.println("***********************");

        mapOfEmp.entrySet().stream().
                sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getEmpName).reversed())).
                forEach(System.out::println);





    }
}
