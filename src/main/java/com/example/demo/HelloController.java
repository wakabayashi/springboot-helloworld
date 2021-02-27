package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @Autowired
  private HelloService service;

  @GetMapping("/hello")
  public String hello(@RequestParam(name = "lang", defaultValue = "en") String lang) {
    return service.getMessage(lang);
  }

}
