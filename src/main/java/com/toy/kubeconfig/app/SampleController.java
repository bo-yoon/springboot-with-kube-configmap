package com.toy.kubeconfig.app;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleController {
    @Value("${sample.message}")
     String message;

    @Value("${sample.secret-message}")
    String message2;

    @RequestMapping(value = "/sample", method = RequestMethod.GET)
    public String sample() {
        return message + ",\n" + message2;
    }
}
