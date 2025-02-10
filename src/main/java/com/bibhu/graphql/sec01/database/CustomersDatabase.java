package com.bibhu.graphql.sec01.database;

import com.bibhu.graphql.sec01.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CustomersDatabase {

    public List<Customer> getCustomersListFromDatabase() {
        Customer customer1 = new Customer(1, "Sam", 45, "Bangalore");
        Customer customer2 = new Customer(2, "Mike", 15, "Paris");
        Customer customer3 = new Customer(3, "Jake", 23, "Miami");
        Customer customer4 = new Customer(4, "John", 9, "Houston");
        Customer customer5 = new Customer(5, "Rose", 36, "UK");
        return Arrays.asList(customer1, customer2, customer3, customer4, customer5);
    }

}
