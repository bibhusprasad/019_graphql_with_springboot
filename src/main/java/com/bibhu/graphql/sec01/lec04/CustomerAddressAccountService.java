package com.bibhu.graphql.sec01.lec04;

import com.bibhu.graphql.sec01.database.CustomersDatabase;
import com.bibhu.graphql.sec01.database.CustomersOrderDatabase;
import com.bibhu.graphql.sec01.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerAddressAccountService {

    private final CustomersDatabase customersDatabase;
    private final CustomersOrderDatabase customersOrderDatabase;

    @Autowired
    public CustomerAddressAccountService(CustomersDatabase customersDatabase,
                                CustomersOrderDatabase customersOrderDatabase) {
        this.customersDatabase = customersDatabase;
        this.customersOrderDatabase = customersOrderDatabase;
    }

    public List<Customer> getAllCustomers() {
        return customersDatabase.getCustomersListFromDatabase();
    }
}
