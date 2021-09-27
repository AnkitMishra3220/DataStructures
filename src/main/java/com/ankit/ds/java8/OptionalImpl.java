package com.ankit.ds.java8;

import java.util.Optional;

public class OptionalImpl {

    public static void main(String[] args) {

        Employee employee = new Employee(101,"Ankit",20000,null);

        Optional<String> optionalEmployee = Optional.ofNullable(employee.getAddress());

        if(optionalEmployee.isPresent()) {
            System.out.println("address :" +optionalEmployee.get());
        }

        System.out.println("address -> " +optionalEmployee.orElse("Address Not Present"));

        System.out.println("address ---> " + optionalEmployee.orElseGet(() -> "Default Address"));

        optionalEmployee.orElseThrow(() -> new IllegalArgumentException("Invalid Address"));


    }
}
