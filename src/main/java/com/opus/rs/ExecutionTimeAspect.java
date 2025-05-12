package com.opus.rs;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class ExecutionTimeAspect {

    @Around("@annotation(LogExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - startTime;

        //Get intercepted method details
        var methodSignature = joinPoint.getSignature();
        var className = methodSignature.getDeclaringType().getSimpleName();
        var methodName = methodSignature.getName();
        log.info("{}.{} executed in {} ms", className, methodName, executionTime);
        return proceed;
    }

}
