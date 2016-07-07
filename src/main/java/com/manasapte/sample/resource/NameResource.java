package com.manasapte.sample.resource;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;
import com.manasapte.sample.protocol.NameResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Created by manasapte on 7/6/16.
 */
@Path("/name")
@Produces(MediaType.APPLICATION_JSON)
public class NameResource {
    private final String name;

    public NameResource(String name) {
        this.name = name;
    }

    @GET
    @Timed
    public NameResponse sayHello(@QueryParam("caller") Optional<String> caller) {
        final String finalCaller = caller.or("caller");
        return new NameResponse(finalCaller, name);
    }

}
