package learning.springconfig.configserver;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Log
public class TestService {

    @Value("${server.properties.prop1}")
    private String prop1;

    @PostConstruct
    private void init() {
        log.info("--- App started as " + prop1);
    }

}
