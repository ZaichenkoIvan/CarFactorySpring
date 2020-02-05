package ua.company.abstractfactory.impl;

import org.springframework.stereotype.Component;
import ua.company.abstractfactory.CarFactory;
import ua.company.abstractfactory.parts.autopilot.AutoPilot;
import ua.company.abstractfactory.parts.autopilot.impl.LambAutoPilot;
import ua.company.abstractfactory.parts.cabin.Cabin;
import ua.company.abstractfactory.parts.cabin.impl.AmazingCabin;
import ua.company.abstractfactory.parts.engine.Engine;
import ua.company.abstractfactory.parts.engine.impl.AvendatorEngine;

@Component
public class LamborghiniFactory implements CarFactory {

    @Override
    public AutoPilot getAutoPilot() {
        return new LambAutoPilot();
    }

    @Override
    public Cabin getCabin() {
        return new AmazingCabin();
    }

    @Override
    public Engine getEngine() {
        return new AvendatorEngine();
    }
}
