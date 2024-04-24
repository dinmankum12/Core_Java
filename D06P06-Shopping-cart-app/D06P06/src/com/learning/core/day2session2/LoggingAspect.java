package com.learning.core.day2session2;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
 
@Aspect
@Component
public class LoggingAspect {
 
    @Pointcut("execution(* com.mphasis.ShoppingCart.getItems())")
    public void getItemsPointcut() {}
 
    @Pointcut("execution(* com.mphasis.ShoppingCart.addItem(..))")
    public void addItemPointcut() {}
 
    @Pointcut("execution(* com.mphasis.ShoppingCart.removeItem(..))")
    public void removeItemPointcut() {}
 
    @Pointcut("execution(* com.mphasis.ShoppingCart.updateItem(..))")
    public void updateItemPointcut() {}
 
    @Before("getItemsPointcut() || addItemPointcut() || removeItemPointcut() || updateItemPointcut()")
    public void logBefore() {
        System.out.println("Logging before method execution...");
    }
 
    @AfterReturning(pointcut = "getItemsPointcut() || addItemPointcut() || removeItemPointcut() || updateItemPointcut()",
                    returning = "result")
    public void logAfterReturning(Object result) {
        System.out.println("Logging after method returning...");
    }
 
    @AfterThrowing(pointcut = "getItemsPointcut() || addItemPointcut() || removeItemPointcut() || updateItemPointcut()",
                    throwing = "exception")
    public void logAfterThrowing(Exception exception) {
        System.out.println("Logging after method throwing exception: " + exception.getMessage());
    }
}
