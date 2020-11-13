package org.northernjay.sfgdi.controllers;

import org.northernjay.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

    public PropertyInjectedController() {
    }
}
