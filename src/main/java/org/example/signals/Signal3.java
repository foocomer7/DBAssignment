package org.example.signals;

import org.example.immutable.Algo;

public class Signal3 implements Signal {

    private String signalType = "Signal3";
    @Override
    public void executeSignal() {
        Algo algo = new Algo();
        algo.setAlgoParam(1,90);
        algo.setAlgoParam(2,15);
        algo.performCalc();
        algo.submitToMarket();
        algo.doAlgo();
    }

    @Override
    public String getSignalType() {
        return signalType;
    }
}
