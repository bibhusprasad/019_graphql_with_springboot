package com.bibhu.graphql.sec01.lec04;

import com.bibhu.graphql.sec01.model.Account;
import com.bibhu.graphql.sec01.model.AccountType;
import com.bibhu.graphql.sec01.model.Customer;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

@Controller
public class CustomerAccountController {

    @SchemaMapping(typeName = "Customer")
    public Account account(Customer customer) {

        AccountType accountType = ThreadLocalRandom.current().nextBoolean() ? AccountType.CHECKING : AccountType.SAVING;

        return new Account(UUID.randomUUID(), ThreadLocalRandom.current().nextInt(1, 1000), accountType);
    }
}
