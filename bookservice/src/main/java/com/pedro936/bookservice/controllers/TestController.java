package com.pedro936.bookservice.controllers;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("book-service/test")
public class TestController {

    @GetMapping
    //@Retry(name="default")
    //@Retry(name="test",fallbackMethod = "fallback")
    //@CircuitBreaker(name="default",fallbackMethod = "fallback")
    //@RateLimiter(name="default")
    @Bulkhead(name="default")
    public ResponseEntity<?> get(){
        return ResponseEntity.accepted().build();
    }


    public String fallback(Exception exception){
        return "FallBack way";
    }
}
