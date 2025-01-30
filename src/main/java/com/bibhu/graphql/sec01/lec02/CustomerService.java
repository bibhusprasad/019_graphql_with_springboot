package com.bibhu.graphql.sec01.lec02;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    private static final List<Customer> customerList = new ArrayList<>();

    static {
        Customer customer1 = new Customer(1, "Sam", 45, "Bangalore");
        Customer customer2 = new Customer(2, "Mike", 15, "Paris");
        Customer customer3 = new Customer(3, "Jake", 23, "Miami");
        Customer customer4 = new Customer(4, "John", 9, "Houston");
        Customer customer5 = new Customer(5, "Rose", 36, "UK");
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);
    }

    public List<Customer> getAllCustomers() {
        return customerList;
    }

    public Customer getCustomerById(int id) {
        return customerList.stream()
                .filter(c -> c.getId() == id)
                .findFirst().get();
    }

    public List<Customer> getCustomersByName(String name) {
        return customerList.stream()
                .filter(c -> c.getName().contains(name))
                .collect(Collectors.toList());
    }

    public List<Customer> getCustomersByAgeRangeFilter(AgeRangeFilter ageRangeFilter) {
        return customerList.stream()
                .filter(c -> c.getAge() >= ageRangeFilter.getMinAge() && c.getAge() <= ageRangeFilter.getMaxAge())
                .collect(Collectors.toList());
    }
}
