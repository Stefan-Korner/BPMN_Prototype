package com.example.workflow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class DemoTaskDelegate implements JavaDelegate {
  private final Logger LOGGER =
    LoggerFactory.getLogger(DemoTaskDelegate.class.getName());

  public void execute(DelegateExecution execution) throws Exception {
    LOGGER.info("execute");
  }
}
