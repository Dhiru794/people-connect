package com.peopleconnectapp.exception;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Slf4j
@Aspect
@Component
public class ExceptionHandlingAspect {

    @AfterThrowing(pointcut = "@annotation(com.peopleconnectapp.exception.CatchException)",throwing = "exception")
    public void handleException(PeopleConnectException exception) {
        // Handle the exception here
        log.info("Exception handled: - {}", exception.getMessage());
    }
}

