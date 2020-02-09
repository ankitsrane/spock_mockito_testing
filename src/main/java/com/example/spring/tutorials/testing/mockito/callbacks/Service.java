package com.example.spring.tutorials.testing.mockito.callbacks;

public interface Service {

    void doAction(String request, Callback<Response> callback);

}
