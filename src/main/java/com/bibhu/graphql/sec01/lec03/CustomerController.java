package com.bibhu.graphql.sec01.lec03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CustomerController {

    private CustomerService customerService;

    private CustomerOrderService customerOrderService;

    @Autowired
    public CustomerController(CustomerService customerService, CustomerOrderService customerOrderService) {
        this.customerService = customerService;
        this.customerOrderService = customerOrderService;
    }

    @QueryMapping("customers")
    public List<Customer> customers() {
        return this.customerService.getAllCustomers();
    }

    @SchemaMapping(
            typeName = "Customer"
    )
    public List<CustomerOrder> orders(Customer customer) {
        return this.customerOrderService.ordersByCustomerName(customer.getName());
    }
}
