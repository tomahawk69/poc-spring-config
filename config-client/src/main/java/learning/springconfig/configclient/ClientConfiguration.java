package learning.springconfig.configclient;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "client.properties")
@Component
@Data
public class ClientConfiguration {

    private String prop1;

    private String prop2;

}
