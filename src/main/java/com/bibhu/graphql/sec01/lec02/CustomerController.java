package com.bibhu.graphql.sec01.lec02;

import com.bibhu.graphql.sec01.model.AgeRangeFilter;
import com.bibhu.graphql.sec01.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class  CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @QueryMapping("customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @QueryMapping("customerById")
    public Customer getCustomerById(@Argument Integer id) {
        return customerService.getCustomerById(id);
    }

    @QueryMapping("customersNameContains")
    public List<Customer> getCustomersByName(@Argument String name) {
        return customerService.getCustomersByName(name);
    }

    @QueryMapping("customersByAgeRange")
    public List<Customer> getCustomersByAgeRangeFilter(@Argument AgeRangeFilter filter) {
        return customerService.getCustomersByAgeRangeFilter(filter);
    }
}
