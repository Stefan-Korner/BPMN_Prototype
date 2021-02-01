package com.example.workflow;

import org.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.client.RestTemplate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class DemoTaskDelegate implements JavaDelegate {
  private final Logger LOGGER =
    LoggerFactory.getLogger(DemoTaskDelegate.class.getName());

  public void execute(DelegateExecution execution) throws Exception {
    LOGGER.info("execute");
    RestTemplate restTemplate = new RestTemplate();
    String result =
      restTemplate.getForObject(
        "https://petstore.swagger.io/v2/pet/findByStatus?status=available",
        String.class);
    JSONArray jsonArray = new JSONArray(result);
    String prettyJson = jsonArray.toString(2);
    System.out.println(prettyJson);
  }
}
