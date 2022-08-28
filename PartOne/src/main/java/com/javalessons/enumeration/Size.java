package com.javalessons.enumeration;

public enum Size {
    BIG("L"), AVERAGE("M"), SMALL("S"), UNDEFINED("");

    public String getAbbriviation() {
        return abbriviation;
    }

    Size(String abbriviation) {
        this.abbriviation = abbriviation;
    }

    private String abbriviation;
}
