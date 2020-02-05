package ua.company.abstractfactory.parts.engine.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ua.company.abstractfactory.parts.engine.Engine;

@Component
@Scope("prototype")
public class AvendatorEngine implements Engine {
    @Override
    public void turnOn() {
        System.out.println("Turn on Avendator Engine. Its amazing...");
    }
}
