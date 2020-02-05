package ua.company.abstractfactory.impl;

import org.springframework.stereotype.Component;
import ua.company.abstractfactory.CarFactory;
import ua.company.abstractfactory.parts.autopilot.AutoPilot;
import ua.company.abstractfactory.parts.autopilot.impl.SiemensAutoPilot;
import ua.company.abstractfactory.parts.cabin.Cabin;
import ua.company.abstractfactory.parts.cabin.impl.LeatherCabin;
import ua.company.abstractfactory.parts.engine.Engine;
import ua.company.abstractfactory.parts.engine.impl.MustangV8Engine;

@Component
public class MustangFactory implements CarFactory {

    @Override
    public AutoPilot getAutoPilot() {
        return new SiemensAutoPilot();
    }

    @Override
    public Cabin getCabin() {
        return new LeatherCabin();
    }

    @Override
    public Engine getEngine() {
        return new MustangV8Engine();
    }
}
