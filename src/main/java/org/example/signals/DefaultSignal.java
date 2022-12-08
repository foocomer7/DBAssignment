package org.example.signals;

import org.example.immutable.Algo;

public class DefaultSignal implements Signal {

    private String signalType = "DefaultSignal";
    @Override
    public void executeSignal() {
        Algo algo = new Algo();
        algo.cancelTrades();
        algo.doAlgo();
    }

    @Override
    public String getSignalType() {
        return signalType;
    }
}
