package com.example.spring.tutorials.testing.spring_testing.testexecutionlisteners;

import org.springframework.stereotype.Service;

@Service
public class AdditionService {
    public int add(int a, int b) {
        return a + b;
    }
}
