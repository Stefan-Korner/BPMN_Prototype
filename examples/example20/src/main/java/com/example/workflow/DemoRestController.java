package com.example.workflow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DemoRestController {
  private final Logger LOGGER =
    LoggerFactory.getLogger(DemoRestController.class.getName());

  @RequestMapping("/demo_rest_controller")
  String home() {
    String message = "Hello world!";
    LOGGER.info(message);
    return message;
  }
}
