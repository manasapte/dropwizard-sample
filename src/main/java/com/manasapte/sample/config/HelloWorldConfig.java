package com.manasapte.sample.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by manasapte on 7/6/16.
 */
public class HelloWorldConfig extends Configuration {
    @NotEmpty
    private String name;

    @JsonProperty
    public String getName() {
        return name;
    }
}
