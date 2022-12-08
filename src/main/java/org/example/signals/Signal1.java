package org.example.signals;

import org.example.immutable.Algo;

public class Signal1 implements Signal {

    private String signalType = "Signal1";
    @Override
    public void executeSignal() {
        Algo algo = new Algo();
        algo.setUp();
        algo.setAlgoParam(1,60);
        algo.performCalc();
        algo.submitToMarket();
        algo.doAlgo();
    }

    @Override
    public String getSignalType() {
        return signalType;
    }
}
