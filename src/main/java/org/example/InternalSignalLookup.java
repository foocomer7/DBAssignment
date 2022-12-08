package org.example;

import org.example.signals.*;

public class InternalSignalLookup {

    public Signal lookupSignal(Integer signal) {
        switch (signal) {
            case 1: return new Signal1();
            case 2: return new Signal2();
            case 3: return new Signal3();
            default: return new DefaultSignal();
        }
    }
}
