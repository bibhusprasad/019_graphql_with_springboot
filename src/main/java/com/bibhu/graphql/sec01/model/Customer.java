package com.bibhu.graphql.sec01.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private Integer id;
    private String name;
    private Integer age;
    private String city;
}
