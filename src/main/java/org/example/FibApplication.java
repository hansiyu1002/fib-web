package org.example;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.bundles.webjars.WebJarBundle;
import org.example.core.FibCal;
import org.example.resources.FibResource;

public class FibApplication extends Application<FibConfiguration> {

    public static void main(final String[] args) throws Exception {
        new FibApplication().run(args);
    }

    @Override
    public String getName() {
        return "fib-web";
    }

    @Override
    public void initialize(final Bootstrap<FibConfiguration> bootstrap) {
        bootstrap.addBundle(new WebJarBundle("org.webjars.npm"));
        bootstrap.addBundle(new AssetsBundle("/assets", "/", "index.html"));
    }

    @Override
    public void run(final FibConfiguration configuration,
                    final Environment environment) {
        environment.jersey().register(new FibResource(new FibCal()));
    }

}
