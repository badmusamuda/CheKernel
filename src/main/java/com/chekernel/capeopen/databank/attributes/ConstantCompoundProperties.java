package com.chekernel.capeopen.databank.attributes;

import java.util.Objects;

public final class ConstantCompoundProperties {

    private int casRegistryNumber;

    private String chemicalFormula
            ,acentricFactor
            ,charge;

    private double criticalDensity
            ,criticalPressure
            ,criticalTemperature
            ,criticalVolume
            ,dipoleMoment
            ,molecularWeight
            ,normalBoilingPoint;

    public ConstantCompoundProperties() {

    }

    public ConstantCompoundProperties(String chemicalFormula) {
        this.chemicalFormula = chemicalFormula;
    }

    public int getCasRegistryNumber() {
        return casRegistryNumber;
    }

    public void setCasRegistryNumber(int casRegistryNumber) {
        this.casRegistryNumber = casRegistryNumber;
    }

    public String getChemicalFormula() {
        return chemicalFormula;
    }

    public void setChemicalFormula(String chemicalFormula) {
        this.chemicalFormula = chemicalFormula;
    }

    public String getAcentricFactor() {
        return acentricFactor;
    }

    public void setAcentricFactor(String acentricFactor) {
        this.acentricFactor = acentricFactor;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public double getCriticalDensity() {
        return criticalDensity;
    }

    public void setCriticalDensity(double criticalDensity) {
        this.criticalDensity = criticalDensity;
    }

    public double getCriticalPressure() {
        return criticalPressure;
    }

    public void setCriticalPressure(double criticalPressure) {
        this.criticalPressure = criticalPressure;
    }

    public double getCriticalTemperature() {
        return criticalTemperature;
    }

    public void setCriticalTemperature(double criticalTemperature) {
        this.criticalTemperature = criticalTemperature;
    }

    public double getCriticalVolume() {
        return criticalVolume;
    }

    public void setCriticalVolume(double criticalVolume) {
        this.criticalVolume = criticalVolume;
    }

    public double getDipoleMoment() {
        return dipoleMoment;
    }

    public void setDipoleMoment(double dipoleMoment) {
        this.dipoleMoment = dipoleMoment;
    }

    public double getMolecularWeight() {
        return molecularWeight;
    }

    public void setMolecularWeight(double molecularWeight) {
        this.molecularWeight = molecularWeight;
    }

    public double getNormalBoilingPoint() {
        return normalBoilingPoint;
    }

    public void setNormalBoilingPoint(double normalBoilingPoint) {
        this.normalBoilingPoint = normalBoilingPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConstantCompoundProperties)) return false;
        ConstantCompoundProperties that = (ConstantCompoundProperties) o;
        return getCasRegistryNumber() == that.getCasRegistryNumber() &&
                Double.compare(that.getCriticalDensity(), getCriticalDensity()) == 0 &&
                Double.compare(that.getCriticalPressure(), getCriticalPressure()) == 0 &&
                Double.compare(that.getCriticalTemperature(), getCriticalTemperature()) == 0 &&
                Double.compare(that.getCriticalVolume(), getCriticalVolume()) == 0 &&
                Double.compare(that.getDipoleMoment(), getDipoleMoment()) == 0 &&
                Double.compare(that.getMolecularWeight(), getMolecularWeight()) == 0 &&
                Double.compare(that.getNormalBoilingPoint(), getNormalBoilingPoint()) == 0 &&
                Objects.equals(getChemicalFormula(), that.getChemicalFormula()) &&
                Objects.equals(getAcentricFactor(), that.getAcentricFactor()) &&
                Objects.equals(getCharge(), that.getCharge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCasRegistryNumber(), getChemicalFormula(), getAcentricFactor(), getCharge(), getCriticalDensity(), getCriticalPressure(), getCriticalTemperature(), getCriticalVolume(), getDipoleMoment(), getMolecularWeight(), getNormalBoilingPoint());
    }


    @Override
    public String toString() {
        return "ConstantCompoundProperties{" +
                "casRegistryNumber=" + casRegistryNumber +
                ", chemicalFormula='" + chemicalFormula + '\'' +
                ", acentricFactor='" + acentricFactor + '\'' +
                ", charge='" + charge + '\'' +
                ", criticalDensity=" + criticalDensity +
                ", criticalPressure=" + criticalPressure +
                ", criticalTemperature=" + criticalTemperature +
                ", criticalVolume=" + criticalVolume +
                ", dipoleMoment=" + dipoleMoment +
                ", molecularWeight=" + molecularWeight +
                ", normalBoilingPoint=" + normalBoilingPoint +
                '}';
    }
}
