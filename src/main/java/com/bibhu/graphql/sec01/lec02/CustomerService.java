package com.bibhu.graphql.sec01.lec02;

import com.bibhu.graphql.sec01.model.AgeRangeFilter;
import com.bibhu.graphql.sec01.model.Customer;
import com.bibhu.graphql.sec01.database.CustomersDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    private final CustomersDatabase customersDatabase;

    @Autowired
    public CustomerService(CustomersDatabase customersDatabase) {
        this.customersDatabase = customersDatabase;
    }

    public List<Customer> getAllCustomers() {
        return customersDatabase.getCustomersListFromDatabase();
    }

    public Customer getCustomerById(int id) {
        return customersDatabase.getCustomersListFromDatabase().stream()
                .filter(c -> c.getId() == id)
                .findFirst().get();
    }

    public List<Customer> getCustomersByName(String name) {
        return customersDatabase.getCustomersListFromDatabase().stream()
                .filter(c -> c.getName().contains(name))
                .collect(Collectors.toList());
    }

    public List<Customer> getCustomersByAgeRangeFilter(AgeRangeFilter ageRangeFilter) {
        return customersDatabase.getCustomersListFromDatabase().stream()
                .filter(c -> c.getAge() >= ageRangeFilter.getMinAge() && c.getAge() <= ageRangeFilter.getMaxAge())
                .collect(Collectors.toList());
    }
}
