package org.northernjay.sfgdi.controllers;

import org.northernjay.sfgdi.services.GreetingService;

public class SetterInjectedController {
    GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public SetterInjectedController() {
    }
}
