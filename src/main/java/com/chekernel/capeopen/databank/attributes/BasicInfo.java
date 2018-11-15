package com.chekernel.capeopen.databank.attributes;

import java.util.Objects;

public final class BasicInfo {

    private String name;
    private String molecularFormular;
    private String state;

    private double molecularWeight;

    public BasicInfo() {
    }
    public BasicInfo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMolecularFormular() {
        return molecularFormular;
    }

    public void setMolecularFormular(String molecularFormular) {
        this.molecularFormular = molecularFormular;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getMolecularWeight() {
        return molecularWeight;
    }

    public void setMolecularWeight(double molecularWeight) {
        this.molecularWeight = molecularWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BasicInfo)) return false;
        BasicInfo name1 = (BasicInfo) o;
        return Double.compare(name1.getMolecularWeight(), getMolecularWeight()) == 0 &&
                Objects.equals(getName(), name1.getName()) &&
                Objects.equals(getMolecularFormular(), name1.getMolecularFormular()) &&
                Objects.equals(getState(), name1.getState());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMolecularFormular(), getState(), getMolecularWeight());
    }

    @Override
    public String toString() {
        return "Compound{" +
                "Basic.Information='" + name + '\'' +
                ", molecularFormular='" + molecularFormular + '\'' +
                ", state='" + state + '\'' +
                ", molecularWeight=" + molecularWeight +
                '}';
    }
}
