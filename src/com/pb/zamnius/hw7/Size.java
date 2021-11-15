package com.pb.zamnius.hw7;

public enum Size {

    XXS("XXS"),
    XS("XS"),
    S("S"),
    M("M"),
    L("L");



    private String name;

    Size(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
