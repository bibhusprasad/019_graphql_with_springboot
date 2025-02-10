package com.bibhu.graphql.sec01.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AgeRangeFilter {

    private Integer minAge;
    private Integer maxAge;
}
