package ua.company.abstractfactory;

import ua.company.abstractfactory.parts.autopilot.AutoPilot;
import ua.company.abstractfactory.parts.cabin.Cabin;
import ua.company.abstractfactory.parts.engine.Engine;

public interface CarFactory {
    AutoPilot getAutoPilot();

    Cabin getCabin();

    Engine getEngine();
}
