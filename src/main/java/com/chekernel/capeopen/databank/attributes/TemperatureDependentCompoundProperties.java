package com.chekernel.capeopen.databank.attributes;

import java.util.Objects;

public final class TemperatureDependentCompoundProperties {

    private double vaporPressure
            ,fugacityCoefficientOfVapor
            ,heatCapacityOfLiquid
            ,heatOfVaporization
            ,surfaceTensionSatLiquid
            ,thermalConductivityOfLiquid
            ,thermalConductivityOfVapor
            ,virialCoefficient
            ,idealGasEnthalpy
            ,idealGasEntropy
            ,idealGasHeatCapacity
            ,viscosityOfLiquid
            ,viscosityOfVapor
            ,volumeChangeUponVaporization
            ,volumeOfLiquid;

    public TemperatureDependentCompoundProperties() {
    }

    public double getVaporPressure() {
        return vaporPressure;
    }

    public void setVaporPressure(double vaporPressure) {
        this.vaporPressure = vaporPressure;
    }

    public double getFugacityCoefficientOfVapor() {
        return fugacityCoefficientOfVapor;
    }

    public void setFugacityCoefficientOfVapor(double fugacityCoefficientOfVapor) {
        this.fugacityCoefficientOfVapor = fugacityCoefficientOfVapor;
    }

    public double getHeatCapacityOfLiquid() {
        return heatCapacityOfLiquid;
    }

    public void setHeatCapacityOfLiquid(double heatCapacityOfLiquid) {
        this.heatCapacityOfLiquid = heatCapacityOfLiquid;
    }

    public double getHeatOfVaporization() {
        return heatOfVaporization;
    }

    public void setHeatOfVaporization(double heatOfVaporization) {
        this.heatOfVaporization = heatOfVaporization;
    }

    public double getSurfaceTensionSatLiquid() {
        return surfaceTensionSatLiquid;
    }

    public void setSurfaceTensionSatLiquid(double surfaceTensionSatLiquid) {
        this.surfaceTensionSatLiquid = surfaceTensionSatLiquid;
    }

    public double getThermalConductivityOfLiquid() {
        return thermalConductivityOfLiquid;
    }

    public void setThermalConductivityOfLiquid(double thermalConductivityOfLiquid) {
        this.thermalConductivityOfLiquid = thermalConductivityOfLiquid;
    }

    public double getThermalConductivityOfVapor() {
        return thermalConductivityOfVapor;
    }

    public void setThermalConductivityOfVapor(double thermalConductivityOfVapor) {
        this.thermalConductivityOfVapor = thermalConductivityOfVapor;
    }

    public double getVirialCoefficient() {
        return virialCoefficient;
    }

    public void setVirialCoefficient(double virialCoefficient) {
        this.virialCoefficient = virialCoefficient;
    }

    public double getIdealGasEnthalpy() {
        return idealGasEnthalpy;
    }

    public void setIdealGasEnthalpy(double idealGasEnthalpy) {
        this.idealGasEnthalpy = idealGasEnthalpy;
    }

    public double getIdealGasEntropy() {
        return idealGasEntropy;
    }

    public void setIdealGasEntropy(double idealGasEntropy) {
        this.idealGasEntropy = idealGasEntropy;
    }

    public double getIdealGasHeatCapacity() {
        return idealGasHeatCapacity;
    }

    public void setIdealGasHeatCapacity(double idealGasHeatCapacity) {
        this.idealGasHeatCapacity = idealGasHeatCapacity;
    }

    public double getViscosityOfLiquid() {
        return viscosityOfLiquid;
    }

    public void setViscosityOfLiquid(double viscosityOfLiquid) {
        this.viscosityOfLiquid = viscosityOfLiquid;
    }

    public double getViscosityOfVapor() {
        return viscosityOfVapor;
    }

    public void setViscosityOfVapor(double viscosityOfVapor) {
        this.viscosityOfVapor = viscosityOfVapor;
    }

    public double getVolumeChangeUponVaporization() {
        return volumeChangeUponVaporization;
    }

    public void setVolumeChangeUponVaporization(double volumeChangeUponVaporization) {
        this.volumeChangeUponVaporization = volumeChangeUponVaporization;
    }

    public double getVolumeOfLiquid() {
        return volumeOfLiquid;
    }

    public void setVolumeOfLiquid(double volumeOfLiquid) {
        this.volumeOfLiquid = volumeOfLiquid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TemperatureDependentCompoundProperties)) return false;
        TemperatureDependentCompoundProperties that = (TemperatureDependentCompoundProperties) o;
        return Double.compare(that.getVaporPressure(), getVaporPressure()) == 0 &&
                Double.compare(that.getFugacityCoefficientOfVapor(), getFugacityCoefficientOfVapor()) == 0 &&
                Double.compare(that.getHeatCapacityOfLiquid(), getHeatCapacityOfLiquid()) == 0 &&
                Double.compare(that.getHeatOfVaporization(), getHeatOfVaporization()) == 0 &&
                Double.compare(that.getSurfaceTensionSatLiquid(), getSurfaceTensionSatLiquid()) == 0 &&
                Double.compare(that.getThermalConductivityOfLiquid(), getThermalConductivityOfLiquid()) == 0 &&
                Double.compare(that.getThermalConductivityOfVapor(), getThermalConductivityOfVapor()) == 0 &&
                Double.compare(that.getVirialCoefficient(), getVirialCoefficient()) == 0 &&
                Double.compare(that.getIdealGasEnthalpy(), getIdealGasEnthalpy()) == 0 &&
                Double.compare(that.getIdealGasEntropy(), getIdealGasEntropy()) == 0 &&
                Double.compare(that.getIdealGasHeatCapacity(), getIdealGasHeatCapacity()) == 0 &&
                Double.compare(that.getViscosityOfLiquid(), getViscosityOfLiquid()) == 0 &&
                Double.compare(that.getViscosityOfVapor(), getViscosityOfVapor()) == 0 &&
                Double.compare(that.getVolumeChangeUponVaporization(), getVolumeChangeUponVaporization()) == 0 &&
                Double.compare(that.getVolumeOfLiquid(), getVolumeOfLiquid()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVaporPressure(), getFugacityCoefficientOfVapor(), getHeatCapacityOfLiquid(), getHeatOfVaporization(), getSurfaceTensionSatLiquid(), getThermalConductivityOfLiquid(), getThermalConductivityOfVapor(), getVirialCoefficient(), getIdealGasEnthalpy(), getIdealGasEntropy(), getIdealGasHeatCapacity(), getViscosityOfLiquid(), getViscosityOfVapor(), getVolumeChangeUponVaporization(), getVolumeOfLiquid());
    }

    @Override
    public String toString() {
        return "TemperatureDependentCompoundProperties{" +
                "vaporPressure=" + vaporPressure +
                ", fugacityCoefficientOfVapor=" + fugacityCoefficientOfVapor +
                ", heatCapacityOfLiquid=" + heatCapacityOfLiquid +
                ", heatOfVaporization=" + heatOfVaporization +
                ", surfaceTensionSatLiquid=" + surfaceTensionSatLiquid +
                ", thermalConductivityOfLiquid=" + thermalConductivityOfLiquid +
                ", thermalConductivityOfVapor=" + thermalConductivityOfVapor +
                ", virialCoefficient=" + virialCoefficient +
                ", idealGasEnthalpy=" + idealGasEnthalpy +
                ", idealGasEntropy=" + idealGasEntropy +
                ", idealGasHeatCapacity=" + idealGasHeatCapacity +
                ", viscosityOfLiquid=" + viscosityOfLiquid +
                ", viscosityOfVapor=" + viscosityOfVapor +
                ", volumeChangeUponVaporization=" + volumeChangeUponVaporization +
                ", volumeOfLiquid=" + volumeOfLiquid +
                '}';
    }
}
