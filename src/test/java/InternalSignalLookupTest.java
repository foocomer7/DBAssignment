import org.example.InternalSignalLookup;
import org.example.signals.DefaultSignal;
import org.example.signals.Signal;
import org.example.signals.Signal1;
import org.testng.annotations.Test;

import java.util.HashMap;

public class InternalSignalLookupTest {

    private final InternalSignalLookup lookup = new InternalSignalLookup();

    private HashMap<Integer, String> signalMap = new HashMap<>();

    private void init() {
        signalMap.put(1, "Signal1");
        signalMap.put(2, "Signal2");
        signalMap.put(3, "Signal3");
    }
    @Test
    public void testSignalLookup() {

        init();
        for (int i = 0; i < 5; i++) {
            Signal sig = lookup.lookupSignal(1);
            assert sig.getSignalType().equals(signalMap.getOrDefault(i, "DefaultSignal"));
        }
    }
}