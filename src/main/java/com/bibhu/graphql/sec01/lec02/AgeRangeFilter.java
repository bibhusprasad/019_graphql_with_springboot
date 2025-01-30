package com.bibhu.graphql.sec01.lec02;

public class AgeRangeFilter {

    private Integer minAge;
    private Integer maxAge;

    public AgeRangeFilter() {
    }

    public AgeRangeFilter(Integer minAge, Integer maxAge) {
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }

    public Integer getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }
}
