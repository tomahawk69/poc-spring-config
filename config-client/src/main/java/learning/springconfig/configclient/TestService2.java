package learning.springconfig.configclient;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@RefreshScope
@Log
public class TestService2 {

    @Value("${client.properties.prop3}")
    private String prop3;

    @PostConstruct
    private void postMe() {
        log.info("----");
        log.info("App started as " + prop3);
    }

    public String props() {
        return prop3;
    }

}
