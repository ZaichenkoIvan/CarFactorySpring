package ua.company.abstractfactory.impl;

import org.springframework.stereotype.Component;
import ua.company.abstractfactory.CarFactory;
import ua.company.abstractfactory.parts.autopilot.AutoPilot;
import ua.company.abstractfactory.parts.autopilot.impl.TeslaAutoPilot;
import ua.company.abstractfactory.parts.cabin.Cabin;
import ua.company.abstractfactory.parts.cabin.impl.ComfortableCabin;
import ua.company.abstractfactory.parts.engine.Engine;
import ua.company.abstractfactory.parts.engine.impl.TeslaModelS6Engine;

@Component
public class TeslaFactory implements CarFactory {
    @Override
    public AutoPilot getAutoPilot() {
        return new TeslaAutoPilot();
    }

    @Override
    public Cabin getCabin() {
        return new ComfortableCabin();
    }

    @Override
    public Engine getEngine() {
        return new TeslaModelS6Engine();
    }
}
