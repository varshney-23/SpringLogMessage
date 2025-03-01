package com.springlog.springlogmessage.components;

import org.springframework.stereotype.Component;

@Component
public class DemoBean {
    public String getMessage() {
        return "DemoBean is successfully retrieved from the ApplicationContext!";
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
