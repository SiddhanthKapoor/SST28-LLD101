package com.example.metrics;

import java.util.Map;

public class App {

    public static void main(String[] args) throws Exception {
        String propsPath = "metrics.properties";

        try {
            MetricsLoader loader = new MetricsLoader();
            MetricsRegistry loaded = loader.loadFromFile(propsPath);
            System.out.println("Loaded registry instance  : " + System.identityHashCode(loaded));
        } catch (Exception e) {
            System.out.println("Could not load from properties, ignoring");
        }

        MetricsRegistry global = MetricsRegistry.getInstance();

        System.out.println("Global registry instance  : " + System.identityHashCode(global));

        global.increment("REQUESTS_TOTAL");
        System.out.println("\nREQUESTS_TOTAL = " + global.getCount("REQUESTS_TOTAL"));

        System.out.println("\nAll counters:");
        for (Map.Entry<String, Long> e : global.getAll().entrySet()) {
            System.out.println("  " + e.getKey() + " = " + e.getValue());
        }

        System.out.println("\nTIP: Run ConcurrencyCheck / ReflectionAttack / SerializationCheck for validations.");
    }
}
