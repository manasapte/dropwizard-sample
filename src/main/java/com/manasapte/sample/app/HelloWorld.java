package com.manasapte.sample.app;

import com.manasapte.sample.config.HelloWorldConfig;
import com.manasapte.sample.resource.NameResource;
import io.dropwizard.Application;
import io.dropwizard.configuration.ResourceConfigurationSourceProvider;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by manasapte on 7/6/16.
 */
public class HelloWorld extends Application<HelloWorldConfig> {
    @Override
    public void initialize(Bootstrap<HelloWorldConfig> bootstrap) {
        super.initialize(bootstrap);
        bootstrap.setConfigurationSourceProvider(new ResourceConfigurationSourceProvider());
    }

    @Override
    public void run(HelloWorldConfig helloWorldConfig, Environment environment) throws Exception {
        environment.jersey().register(new NameResource(helloWorldConfig.getName()));
    }

    public static void main(String[] args) throws Exception {
        new HelloWorld().run(args);
    }
}
