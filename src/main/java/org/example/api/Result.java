package org.example.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Result {
    private String[] fibonacci;
    private String[] sorted;

    public Result() {
        // Jackson deserialization
    }

    public Result(String[] fibonacci, String[] sorted) {
        this.fibonacci = fibonacci;
        this.sorted = sorted;
    }

    @JsonProperty
    public String[] getFibonacci() {
        return fibonacci;
    }

    @JsonProperty
    public String[] getSorted() {
        return sorted;
    }
}
