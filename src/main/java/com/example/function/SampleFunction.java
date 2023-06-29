package com.example.function;

import java.util.function.Function;

public class SampleFunction implements Function<String, String> {

    @Override
    public String apply(String input) {
        return "Hello world! " + input;
    }
}
