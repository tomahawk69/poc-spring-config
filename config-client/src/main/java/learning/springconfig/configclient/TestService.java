package learning.springconfig.configclient;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Log
@RequiredArgsConstructor
public class TestService {

    private final ClientConfiguration clientConfiguration;

    @PostConstruct
    private void postMe() {
        log.info("----");
        log.info("App started as " + clientConfiguration.getProp1());
        log.info("App feels as " + clientConfiguration.getProp2());
    }

    public String props() {
        return clientConfiguration.getProp1() + ":" + clientConfiguration.getProp2();
    }
}
