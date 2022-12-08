package org.example.signals;

import org.example.immutable.Algo;

public class Signal2 implements Signal {

    private String signalType = "Signal2";
    @Override
    public void executeSignal() {
        Algo algo = new Algo();
        algo.reverse();
        algo.setAlgoParam(1,80);
        algo.submitToMarket();
        algo.doAlgo();
    }

    @Override
    public String getSignalType() {
        return signalType;
    }
}
