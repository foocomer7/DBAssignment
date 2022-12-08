package org.example;

import org.example.immutable.SignalHandler;
import org.example.signals.Signal;

/**
 * This is your team’s code and should be changed as you see fit.
 */
class Application implements SignalHandler {
    private InternalSignalLookup lookup = new InternalSignalLookup();

    public void handleSignal(int signal) {
        Signal sig = lookup.lookupSignal(signal);
        sig.executeSignal();
    }
}
