package com.bibhu.graphql.sec01.lec04;

import com.bibhu.graphql.sec01.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CustomerAddressAccountController {

    private CustomerAddressAccountService customerAddressAccountService;

    @Autowired
    public CustomerAddressAccountController(CustomerAddressAccountService customerAddressAccountService) {
        this.customerAddressAccountService = customerAddressAccountService;
    }

    @QueryMapping("customersWithAddressAccount")
    public List<Customer> customers() {
        return this.customerAddressAccountService.getAllCustomers();
    }
}
