package com.bibhu.graphql.sec01.database;

import com.bibhu.graphql.sec01.model.CustomerOrder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class CustomersOrderDatabase {

    public Map<String, List<CustomerOrder>> getCustomersOrdersListFromDatabase() {
        return Map.of(
                "Sam", List.of(
                        new CustomerOrder(1, "TV", 54000f),
                        new CustomerOrder(7, "Table", 18500f)
                ),
                "Mike", List.of(
                        new CustomerOrder(2, "Mobile", 141000f)
                ),
                "Jake", List.of(
                        new CustomerOrder(3, "Laptop", 78000f)
                ),
                "John", List.of(
                        new CustomerOrder(4, "Cycle", 9000f)
                ),
                "Rose", List.of(
                        new CustomerOrder(5, "Book", 3400f),
                        new CustomerOrder(6, "Toys", 1200f)
                )
        );
    }
}
