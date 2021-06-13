package com.ivan.polovyi.singleton.enumtype;

/**
 * (Ref. Google I/O 2k8 Joshua Bloch)
 * Since Java 1.5 using enum we can create a singleton. It handles serialization using java's in-built
 * mechanism and still ensure single instance
 */
public enum RegistryEnum {
    INSTANCE("Initial class info");

    private String info;

    private RegistryEnum(String info) {
        this.info = info;
    }

    public RegistryEnum getInstance() {
        return INSTANCE;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}