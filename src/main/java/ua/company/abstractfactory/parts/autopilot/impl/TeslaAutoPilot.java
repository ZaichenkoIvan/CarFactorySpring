package ua.company.abstractfactory.parts.autopilot.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ua.company.abstractfactory.parts.autopilot.AutoPilot;

@Component
@Scope("prototype")
public class TeslaAutoPilot implements AutoPilot {
    @Override
    public void drive() {
        System.out.println("Lets go drive with Tesla AutoPilot");
    }
}
