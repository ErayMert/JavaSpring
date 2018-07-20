package com.spring;

/**
 * Created by eraym on 20.07.2018.
 */
public class Runner {

    private Engine electricalEngine;
    private Engine internalCombustionEngine;


    public void setElectricalEngine(Engine electricalEngine) {
        this.electricalEngine = electricalEngine;
    }

    public void setInternalCombustionEngine(Engine internalCombustionEngine) {
        this.internalCombustionEngine = internalCombustionEngine;
    }

    public void electricalEngine(){
        electricalEngine.run();
    }

    public void internalCombustionEngine(){
        internalCombustionEngine.run();
    }
}
