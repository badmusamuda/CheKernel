package com.chekernel.capeopen.databank.util;

public enum RESPONSE {

    NOT_SPECIFIED("INPUT_NOT_SPECIFIED"),
    NOT_FOUND("INPUT NOT_FOUND"),
    FOUND("INPUT_FOUND");

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    RESPONSE(final String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "RESPONSE{" +
                "value='" + value + '\'' +
                '}';
    }
}
