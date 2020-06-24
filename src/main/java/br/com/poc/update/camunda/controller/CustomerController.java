package br.com.poc.update.camunda.controller;

import br.com.poc.update.camunda.controller.request.CustomerRequest;
import org.camunda.bpm.engine.RuntimeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CustomerController {

    private RuntimeService runtimeService;

    public CustomerController(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    @PostMapping("/customers")
    @ResponseBody
    public void create(CustomerRequest customerRequest) {
        Map<String, Object> variables = new HashMap<>();

        variables.put("name", customerRequest.getName());
        variables.put("age", customerRequest.getAge());

        runtimeService.startProcessInstanceByKey("CUSTOMER_TASK", variables);
    }
}
