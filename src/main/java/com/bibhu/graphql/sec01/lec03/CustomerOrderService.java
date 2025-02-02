package com.bibhu.graphql.sec01.lec03;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class CustomerOrderService {

    private final Map<String, List<CustomerOrder>> customerOrdersMap = Map.of(
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

    public List<CustomerOrder> ordersByCustomerName(String name) {
        return customerOrdersMap.getOrDefault(name, new ArrayList<>());
    }

}
