package com.example.function;

import com.microsoft.azure.functions.*;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;

import java.util.Optional;

public class SampleHandler {
    private SampleFunction sasUrlGenerateFunction;

    public SampleHandler(SampleFunction sasUrlGenerateFunction) {
        this.sasUrlGenerateFunction = sasUrlGenerateFunction;
    }

    @FunctionName("sample")
    public HttpResponseMessage run(
            @HttpTrigger(
                    name = "sample",
                    methods = HttpMethod.GET,
                    authLevel = AuthorizationLevel.ANONYMOUS)
            HttpRequestMessage<Optional<String>> request,
            final ExecutionContext context) {
        context.getLogger().info("Handler invoked");

        return request
                .createResponseBuilder(HttpStatus.OK)
                .body(sasUrlGenerateFunction.apply("Some function input"))
                .build();
    }
}
