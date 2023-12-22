package com.springboot.logging.demo.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LoggerController {

  @RequestMapping("/log")
  public String log() {
    log.debug("This is a DEBUG message");
    log.info("This is an INFO message");
    log.warn("This is a WARN message");
    log.error("This is an ERROR message");
    return "Checkout logs to see the output";
  }
}
