package ua.company.abstractfactory.parts.cabin.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ua.company.abstractfactory.parts.cabin.Cabin;

@Component
@Scope("prototype")
public class ComfortableCabin implements Cabin {
    @Override
    public void getInfo() {
        System.out.println("This is comfortable cabin...");
    }
}
