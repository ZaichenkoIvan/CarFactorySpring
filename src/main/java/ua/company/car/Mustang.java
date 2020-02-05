package ua.company.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ua.company.abstractfactory.CarFactory;
import ua.company.abstractfactory.parts.autopilot.AutoPilot;
import ua.company.abstractfactory.parts.cabin.Cabin;
import ua.company.abstractfactory.parts.engine.Engine;

@Component
@Scope("prototype")
public class Mustang implements Car {
    private AutoPilot autoPilot;
    private Cabin cabin;
    private Engine engine;

    @Autowired
    public Mustang(@Qualifier("mustangFactory") CarFactory carFactory) {

        this.autoPilot = carFactory.getAutoPilot();
        this.cabin = carFactory.getCabin();
        this.engine = carFactory.getEngine();
    }

    public void turnOnAutoPilot() {
        autoPilot.drive();
    }

    public void showCabinInfo() {
        cabin.getInfo();
    }

    public void go() {
        engine.turnOn();
    }

    @Override
    public String toString() {
        return "This is Mustang";
    }
}
