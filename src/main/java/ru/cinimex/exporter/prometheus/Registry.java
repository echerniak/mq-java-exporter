package ru.cinimex.exporter.prometheus;


import io.prometheus.client.CollectorRegistry;

/**
 * Class stores the only instance of CollectorRegistry.
 */
public class Registry {
    private static CollectorRegistry registry = CollectorRegistry.defaultRegistry;

    public static CollectorRegistry getRegistry() {
        return registry;
    }


}