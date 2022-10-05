package com.example.springaop.com.resource.impl;

import com.example.springaop.com.resource.NaturalResource;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Water implements NaturalResource {

    @Override
    public void provide() {
        System.out.println("Overridden Provided::Water");
    }

    @Before("execution(*  com.example.springaop.com.plannet.impl.Earth.revolve(..))")
    public void provide(JoinPoint joinPoint) {
        System.out.println("Provided::Water :: " + joinPoint.getSignature().getName());
    }
}
