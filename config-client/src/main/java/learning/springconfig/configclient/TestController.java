package learning.springconfig.configclient;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("test")
    private String test() {
        return testService.props();
    }
}
