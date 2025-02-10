package com.bibhu.graphql.sec01.lec03;

import com.bibhu.graphql.sec01.model.Customer;
import com.bibhu.graphql.sec01.database.CustomersDatabase;
import com.bibhu.graphql.sec01.database.CustomersOrderDatabase;
import com.bibhu.graphql.sec01.model.CustomerOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerOrderService {

    private final CustomersDatabase customersDatabase;
    private final CustomersOrderDatabase customersOrderDatabase;

    @Autowired
    public CustomerOrderService(CustomersDatabase customersDatabase,
                                CustomersOrderDatabase customersOrderDatabase) {
        this.customersDatabase = customersDatabase;
        this.customersOrderDatabase = customersOrderDatabase;
    }

    public List<Customer> getAllCustomers() {
        return customersDatabase.getCustomersListFromDatabase();
    }

    public List<CustomerOrder> ordersByCustomerName(String name) {
        return customersOrderDatabase.getCustomersOrdersListFromDatabase().getOrDefault(name, new ArrayList<>());
    }

}
