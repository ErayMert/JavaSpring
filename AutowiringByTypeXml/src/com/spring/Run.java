package com.spring;

/**
 * Created by eraym on 20.07.2018.
 */
public class Run {

    private ElectricalEngine electricalEngine;
    private InternalCombustionEngine combustionEngine;

    public void setElectricalEngine(ElectricalEngine electricalEngine) {
        this.electricalEngine = electricalEngine;
    }

    public void setCombustionEngine(InternalCombustionEngine combustionEngine) {
        this.combustionEngine = combustionEngine;
    }

    public void internalCEngine(){
        combustionEngine.run();
    }

    public void electricalEngine(){
        electricalEngine.run();
    }
}
