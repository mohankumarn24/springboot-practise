package net.projectsync.practise.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping({"/", "/welcome", "/hello"})
    public ResponseEntity<String> welcome() {
        return new ResponseEntity<>("hello, world", HttpStatus.OK);
    }
}
