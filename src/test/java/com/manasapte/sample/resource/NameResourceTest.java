package com.manasapte.sample.resource;

import com.manasapte.sample.protocol.NameResponse;
import io.dropwizard.testing.junit.ResourceTestRule;
import org.junit.ClassRule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by manasapte on 7/6/16.
 */
public class NameResourceTest {

    @ClassRule
    public static final ResourceTestRule resources = ResourceTestRule.builder()
            .addResource(new NameResource("testString"))
            .build();

    private final NameResponse msg = new NameResponse("caller", "testString");


    @Test
    public void testGetMsg() {
        NameResponse response = resources.client().target("/name").request().get(NameResponse.class);
        assertEquals(response.getCaller(), "caller");
        assertEquals(response.getName(), "testString");
    }
}
