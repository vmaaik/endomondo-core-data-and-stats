package uk.no.idea.core;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class PipelineTestController {

    @GetMapping
    public String hello() {
        return "Develop deployed!";
    }
}
