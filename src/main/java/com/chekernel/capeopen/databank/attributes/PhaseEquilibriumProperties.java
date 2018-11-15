package com.chekernel.capeopen.databank.attributes;

public class PhaseEquilibriumProperties {

    private double temperature, pressure, vaporFraction, enthalpy, entropyF, volume;


    public PhaseEquilibriumProperties() {
    }
    public PhaseEquilibriumProperties(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getVaporFraction() {
        return vaporFraction;
    }

    public void setVaporFraction(double vaporFraction) {
        this.vaporFraction = vaporFraction;
    }

    public double getEnthalpy() {
        return enthalpy;
    }

    public void setEnthalpy(double enthalpy) {
        this.enthalpy = enthalpy;
    }

    public double getEntropyF() {
        return entropyF;
    }

    public void setEntropyF(double entropyF) {
        this.entropyF = entropyF;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "PhaseEquilibriumProperties{" +
                "temperature=" + temperature +
                ", pressure=" + pressure +
                ", vaporFraction=" + vaporFraction +
                ", enthalpy=" + enthalpy +
                ", entropyF=" + entropyF +
                ", volume=" + volume +
                '}';
    }
}
