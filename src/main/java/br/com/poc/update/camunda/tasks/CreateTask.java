package br.com.poc.update.camunda.tasks;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class CreateTask implements JavaDelegate {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void execute(DelegateExecution delegateExecution) {
        logger.info("boa");
        throw new RuntimeException();
    }
}
