package com.manasapte.sample.protocol;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by manasapte on 7/6/16.
 */
public class NameResponse {
    @NotEmpty
    private String caller;

    @NotEmpty
    private String name;

    public NameResponse(String caller, String name) {
        this.caller = caller;
        this.name = name;
    }

    public NameResponse() {
    }

    @JsonProperty
    public String getCaller() {
        return caller;
    }

    @JsonProperty
    public String getName() {
        return name;
    }
}
