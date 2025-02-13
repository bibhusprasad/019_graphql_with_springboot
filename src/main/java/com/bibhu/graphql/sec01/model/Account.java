package com.bibhu.graphql.sec01.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    private UUID id;
    private Integer amount;
    private AccountType accountType;
}
