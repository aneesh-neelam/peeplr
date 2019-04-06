package me.aneeshneelam.peeplr.service.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/api")
    public String index() {
        return "Hello!";
    }
}
