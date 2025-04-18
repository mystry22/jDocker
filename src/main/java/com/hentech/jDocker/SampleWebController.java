package com.hentech.jDocker;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/docker")
public class SampleWebController {

    @GetMapping("/home")
    public ResponseEntity<?> returnResponse(){
        return new ResponseEntity<>("Hello docker", HttpStatus.OK);
    }
}
