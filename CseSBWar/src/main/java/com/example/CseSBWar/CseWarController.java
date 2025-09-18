package com.example.CseSBWar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseWarController {
  @GetMapping("/rocks")
  public String cserocks() {
	  return"welcome to spring boot war file";
  }
}
