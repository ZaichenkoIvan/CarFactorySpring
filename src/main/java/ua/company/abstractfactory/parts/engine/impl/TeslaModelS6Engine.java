package ua.company.abstractfactory.parts.engine.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ua.company.abstractfactory.parts.engine.Engine;

@Component
@Scope("prototype")
public class TeslaModelS6Engine implements Engine {
    @Override
    public void turnOn() {
        System.out.println("Turn on S6 model. Its nice...");
    }
}
