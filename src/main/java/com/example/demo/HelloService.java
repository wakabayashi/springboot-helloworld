package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

  @Autowired
  private HelloMapper mapper;

  public String getMessage(String lang) {
    return mapper.findByLang(lang);
  }

}
