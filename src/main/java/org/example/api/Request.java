package org.example.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Request {
    private int elements;

    public Request() {
        // Jackson deserialization
    }

    public Request(int elements) {
        this.elements = elements;
    }

    public int getElements() {
        return elements;
    }

    @JsonProperty
    public void setElements(int elements) {
        this.elements = elements;
    }
}
