package uk.co.danielbryant.djshopping.productcatalogue.healthchecks;

import com.codahale.metrics.health.HealthCheck;

public class BasicHealthCheck extends HealthCheck {

    private final String version;

    public BasicHealthCheck(String version) {
        this.version = version;
    }

    @Override
    protected Result check() throws Exception {
        return Result.healthy("Ok with version: " + version);
        
livenessProbe:
initialDelaySeconds: 2
periodSeconds: 5
httpGet:
path: /health
port: 9876
    }
}
