package com.northgatecode.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity index() throws UnknownHostException {
        return ResponseEntity.ok("Hello Spring Boot! From: " + InetAddress.getLocalHost().getHostName());
    }
}
