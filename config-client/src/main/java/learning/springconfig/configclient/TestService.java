package learning.springconfig.configclient;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Log
@RefreshScope
public class TestService {

    @Value("${client.properties.prop1}")
    private String prop1;

    @Value("${client.properties.prop2}")
    private String prop2;

    @PostConstruct
    private void postMe() {
        log.info("----");
        log.info("App started as " + prop1);
        log.info("App feels as " + prop2);
    }

    public String props() {
        return prop1 + ":" + prop2;
    }
}
