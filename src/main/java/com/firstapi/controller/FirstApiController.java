package com.firstapi.controller;

import com.firstapi.model.ImpFirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/firstapi")
public class FirstApiController {

  @Autowired ImpFirstService service;

  @GetMapping(
      value = {"/index", "/"},
      produces = MediaType.APPLICATION_JSON_VALUE)
  public String firstGet() {
    return service.GetStringService();
  }
}
