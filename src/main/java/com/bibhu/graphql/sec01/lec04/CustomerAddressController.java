package com.bibhu.graphql.sec01.lec04;

import com.bibhu.graphql.sec01.model.Address;
import com.bibhu.graphql.sec01.model.Customer;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CustomerAddressController {

    @SchemaMapping(typeName = "Customer")
    public Address address(Customer customer) {
        return new Address(customer.getName() + " street", customer.getName() + " city");
    }
}
