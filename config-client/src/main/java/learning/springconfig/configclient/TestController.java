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
    private final TestService2 testService2;

    @GetMapping("test1")
    private String test1() {
        return testService.props();
    }

    @GetMapping("test2")
    private String test2() {
        return testService2.props();
    }

    @GetMapping("test21")
    private String test21() {
        return testService2.props();
    }
}
