package react.redux.jwt.auth.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/test")
public class TestController {

    @GetMapping("ping")
    public String ping() {
        return "Pong!";
    }
    
}
