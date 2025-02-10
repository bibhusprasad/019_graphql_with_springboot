package com.bibhu.graphql.sec01.lec03;

import com.bibhu.graphql.sec01.model.Customer;
import com.bibhu.graphql.sec01.model.CustomerOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CustomerOrderController {

    private CustomerOrderService customerService;

    private CustomerOrderService customerOrderService;

    @Autowired
    public CustomerOrderController(CustomerOrderService customerService, CustomerOrderService customerOrderService) {
        this.customerService = customerService;
        this.customerOrderService = customerOrderService;
    }

    @QueryMapping("customersWithOrders")
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
