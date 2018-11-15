package com.chekernel.capeopen.databank.attributes;

public final class PhaseProperties {

    private double compressibility,
            compressibilityDtemperature,
            compressibilityDpressure,
            compressibilityDmoles,
            compressibilityDmolFraction,
            compressibilityFactor,
            compressibilityFactorDtemperature,
            compressibilityFactorDpressure,
            compressibilityFactorDmoles,
            compressibilityFactorDmolFraction,
            density,
            densityDtemperature,
            densityDpressure,
            densityDmoles,
            densityDmolFraction,
            enthalpy,
            enthalpyDtemperature,
            enthalpyDpressure,
            enthalpyDmoles,
            enthalpyDmolFraction,
            entropy,
            entropyDtemperature,
            entropyDpressure, entropyDmoles, entropyDmolFraction, fugacity,
            fugacityDtemperature, fugacityDpressure, fugacityDmoles, fugacityDmolFraction, fugacityCoefficient,
            fugacityCoefficientDtemperature, fugacityCoefficientDpressure, fugacityCoefficientDmoles,
            fugacityCoefficientDmolFraction, gibbsEnergy, gibbsEnergyDtemperature, gibbsEnergyDpressure,
            gibbsEnergyDmoles, gibbsEnergyDmolFraction, heatCapacityCp, heatCapacityCpDtemperature,
            heatCapacityCpDpressure, heatCapacityCpDmoles, heatCapacityCpDmolFraction, heatCapacityCv,
            heatCapacityCvDtemperature, heatCapacityCvDpressure, heatCapacityCvDmoles, heatCapacityCvDmolFraction,
            helmholtzEnergy, helmholtzEnergyDtemperature, helmholtzEnergyDpressure, helmholtzEnergyDmoles,
            helmholtzEnergyDmolFraction, internalEnergy, internalEnergyDtemperature, internalEnergyDpressure,
            internalEnergyDmoles, internalEnergyDmolFraction, jouleThomsonCoefficient, jouleThomsonCoefficientDtemperature,
            jouleThomsonCoefficientDpressure, jouleThomsonCoefficientDmoles, jouleThomsonCoefficientDmolFraction,
            logFugacityCoefficient,
            logFugacityCoefficientDtemperature,
            logFugacityCoefficientDpressure,
            logFugacityCoefficientDmoles,
            logFugacityCoefficientDmolFraction,
            speedOfSound,
            speedOfSoundDtemperature,
            speedOfSoundDpressure,
            speedOfSoundDmoles,
            speedOfSoundDmolFraction,
            thermalConductivity,
            thermalConductivityDtemperature,
            thermalConductivityDpressure,
            thermalConductivityDmoles,
            thermalConductivityDmolFraction,
            viscosity,
            viscosityDtemperature,
            viscosityDpressure,
            viscosityDmoles,
            viscosityDmolFraction,
            volume,
            volumeDtemperature,
            volumeDpressure,
            volumeDmoles,
            volumeDmolFraction,
            molecularWeight;

    public PhaseProperties() {
    }

    public PhaseProperties(double molecularWeight) {
        this.molecularWeight = molecularWeight;
    }

    public double getCompressibility() {
        return compressibility;
    }

    public void setCompressibility(double compressibility) {
        this.compressibility = compressibility;
    }

    public double getCompressibilityDtemperature() {
        return compressibilityDtemperature;
    }

    public void setCompressibilityDtemperature(double compressibilityDtemperature) {
        this.compressibilityDtemperature = compressibilityDtemperature;
    }

    public double getCompressibilityDpressure() {
        return compressibilityDpressure;
    }

    public void setCompressibilityDpressure(double compressibilityDpressure) {
        this.compressibilityDpressure = compressibilityDpressure;
    }

    public double getCompressibilityDmoles() {
        return compressibilityDmoles;
    }

    public void setCompressibilityDmoles(double compressibilityDmoles) {
        this.compressibilityDmoles = compressibilityDmoles;
    }

    public double getCompressibilityDmolFraction() {
        return compressibilityDmolFraction;
    }

    public void setCompressibilityDmolFraction(double compressibilityDmolFraction) {
        this.compressibilityDmolFraction = compressibilityDmolFraction;
    }

    public double getCompressibilityFactor() {
        return compressibilityFactor;
    }

    public void setCompressibilityFactor(double compressibilityFactor) {
        this.compressibilityFactor = compressibilityFactor;
    }

    public double getCompressibilityFactorDtemperature() {
        return compressibilityFactorDtemperature;
    }

    public void setCompressibilityFactorDtemperature(double compressibilityFactorDtemperature) {
        this.compressibilityFactorDtemperature = compressibilityFactorDtemperature;
    }

    public double getCompressibilityFactorDpressure() {
        return compressibilityFactorDpressure;
    }

    public void setCompressibilityFactorDpressure(double compressibilityFactorDpressure) {
        this.compressibilityFactorDpressure = compressibilityFactorDpressure;
    }

    public double getCompressibilityFactorDmoles() {
        return compressibilityFactorDmoles;
    }

    public void setCompressibilityFactorDmoles(double compressibilityFactorDmoles) {
        this.compressibilityFactorDmoles = compressibilityFactorDmoles;
    }

    public double getCompressibilityFactorDmolFraction() {
        return compressibilityFactorDmolFraction;
    }

    public void setCompressibilityFactorDmolFraction(double compressibilityFactorDmolFraction) {
        this.compressibilityFactorDmolFraction = compressibilityFactorDmolFraction;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getDensityDtemperature() {
        return densityDtemperature;
    }

    public void setDensityDtemperature(double densityDtemperature) {
        this.densityDtemperature = densityDtemperature;
    }

    public double getDensityDpressure() {
        return densityDpressure;
    }

    public void setDensityDpressure(double densityDpressure) {
        this.densityDpressure = densityDpressure;
    }

    public double getDensityDmoles() {
        return densityDmoles;
    }

    public void setDensityDmoles(double densityDmoles) {
        this.densityDmoles = densityDmoles;
    }

    public double getDensityDmolFraction() {
        return densityDmolFraction;
    }

    public void setDensityDmolFraction(double densityDmolFraction) {
        this.densityDmolFraction = densityDmolFraction;
    }

    public double getEnthalpy() {
        return enthalpy;
    }

    public void setEnthalpy(double enthalpy) {
        this.enthalpy = enthalpy;
    }

    public double getEnthalpyDtemperature() {
        return enthalpyDtemperature;
    }

    public void setEnthalpyDtemperature(double enthalpyDtemperature) {
        this.enthalpyDtemperature = enthalpyDtemperature;
    }

    public double getEnthalpyDpressure() {
        return enthalpyDpressure;
    }

    public void setEnthalpyDpressure(double enthalpyDpressure) {
        this.enthalpyDpressure = enthalpyDpressure;
    }

    public double getEnthalpyDmoles() {
        return enthalpyDmoles;
    }

    public void setEnthalpyDmoles(double enthalpyDmoles) {
        this.enthalpyDmoles = enthalpyDmoles;
    }

    public double getEnthalpyDmolFraction() {
        return enthalpyDmolFraction;
    }

    public void setEnthalpyDmolFraction(double enthalpyDmolFraction) {
        this.enthalpyDmolFraction = enthalpyDmolFraction;
    }

    public double getEntropy() {
        return entropy;
    }

    public void setEntropy(double entropy) {
        this.entropy = entropy;
    }

    public double getEntropyDtemperature() {
        return entropyDtemperature;
    }

    public void setEntropyDtemperature(double entropyDtemperature) {
        this.entropyDtemperature = entropyDtemperature;
    }

    public double getEntropyDpressure() {
        return entropyDpressure;
    }

    public void setEntropyDpressure(double entropyDpressure) {
        this.entropyDpressure = entropyDpressure;
    }

    public double getEntropyDmoles() {
        return entropyDmoles;
    }

    public void setEntropyDmoles(double entropyDmoles) {
        this.entropyDmoles = entropyDmoles;
    }

    public double getEntropyDmolFraction() {
        return entropyDmolFraction;
    }

    public void setEntropyDmolFraction(double entropyDmolFraction) {
        this.entropyDmolFraction = entropyDmolFraction;
    }

    public double getFugacity() {
        return fugacity;
    }

    public void setFugacity(double fugacity) {
        this.fugacity = fugacity;
    }

    public double getFugacityDtemperature() {
        return fugacityDtemperature;
    }

    public void setFugacityDtemperature(double fugacityDtemperature) {
        this.fugacityDtemperature = fugacityDtemperature;
    }

    public double getFugacityDpressure() {
        return fugacityDpressure;
    }

    public void setFugacityDpressure(double fugacityDpressure) {
        this.fugacityDpressure = fugacityDpressure;
    }

    public double getFugacityDmoles() {
        return fugacityDmoles;
    }

    public void setFugacityDmoles(double fugacityDmoles) {
        this.fugacityDmoles = fugacityDmoles;
    }

    public double getFugacityDmolFraction() {
        return fugacityDmolFraction;
    }

    public void setFugacityDmolFraction(double fugacityDmolFraction) {
        this.fugacityDmolFraction = fugacityDmolFraction;
    }

    public double getFugacityCoefficient() {
        return fugacityCoefficient;
    }

    public void setFugacityCoefficient(double fugacityCoefficient) {
        this.fugacityCoefficient = fugacityCoefficient;
    }

    public double getFugacityCoefficientDtemperature() {
        return fugacityCoefficientDtemperature;
    }

    public void setFugacityCoefficientDtemperature(double fugacityCoefficientDtemperature) {
        this.fugacityCoefficientDtemperature = fugacityCoefficientDtemperature;
    }

    public double getFugacityCoefficientDpressure() {
        return fugacityCoefficientDpressure;
    }

    public void setFugacityCoefficientDpressure(double fugacityCoefficientDpressure) {
        this.fugacityCoefficientDpressure = fugacityCoefficientDpressure;
    }

    public double getFugacityCoefficientDmoles() {
        return fugacityCoefficientDmoles;
    }

    public void setFugacityCoefficientDmoles(double fugacityCoefficientDmoles) {
        this.fugacityCoefficientDmoles = fugacityCoefficientDmoles;
    }

    public double getFugacityCoefficientDmolFraction() {
        return fugacityCoefficientDmolFraction;
    }

    public void setFugacityCoefficientDmolFraction(double fugacityCoefficientDmolFraction) {
        this.fugacityCoefficientDmolFraction = fugacityCoefficientDmolFraction;
    }

    public double getGibbsEnergy() {
        return gibbsEnergy;
    }

    public void setGibbsEnergy(double gibbsEnergy) {
        this.gibbsEnergy = gibbsEnergy;
    }

    public double getGibbsEnergyDtemperature() {
        return gibbsEnergyDtemperature;
    }

    public void setGibbsEnergyDtemperature(double gibbsEnergyDtemperature) {
        this.gibbsEnergyDtemperature = gibbsEnergyDtemperature;
    }

    public double getGibbsEnergyDpressure() {
        return gibbsEnergyDpressure;
    }

    public void setGibbsEnergyDpressure(double gibbsEnergyDpressure) {
        this.gibbsEnergyDpressure = gibbsEnergyDpressure;
    }

    public double getGibbsEnergyDmoles() {
        return gibbsEnergyDmoles;
    }

    public void setGibbsEnergyDmoles(double gibbsEnergyDmoles) {
        this.gibbsEnergyDmoles = gibbsEnergyDmoles;
    }

    public double getGibbsEnergyDmolFraction() {
        return gibbsEnergyDmolFraction;
    }

    public void setGibbsEnergyDmolFraction(double gibbsEnergyDmolFraction) {
        this.gibbsEnergyDmolFraction = gibbsEnergyDmolFraction;
    }

    public double getHeatCapacityCp() {
        return heatCapacityCp;
    }

    public void setHeatCapacityCp(double heatCapacityCp) {
        this.heatCapacityCp = heatCapacityCp;
    }

    public double getHeatCapacityCpDtemperature() {
        return heatCapacityCpDtemperature;
    }

    public void setHeatCapacityCpDtemperature(double heatCapacityCpDtemperature) {
        this.heatCapacityCpDtemperature = heatCapacityCpDtemperature;
    }

    public double getHeatCapacityCpDpressure() {
        return heatCapacityCpDpressure;
    }

    public void setHeatCapacityCpDpressure(double heatCapacityCpDpressure) {
        this.heatCapacityCpDpressure = heatCapacityCpDpressure;
    }

    public double getHeatCapacityCpDmoles() {
        return heatCapacityCpDmoles;
    }

    public void setHeatCapacityCpDmoles(double heatCapacityCpDmoles) {
        this.heatCapacityCpDmoles = heatCapacityCpDmoles;
    }

    public double getHeatCapacityCpDmolFraction() {
        return heatCapacityCpDmolFraction;
    }

    public void setHeatCapacityCpDmolFraction(double heatCapacityCpDmolFraction) {
        this.heatCapacityCpDmolFraction = heatCapacityCpDmolFraction;
    }

    public double getHeatCapacityCv() {
        return heatCapacityCv;
    }

    public void setHeatCapacityCv(double heatCapacityCv) {
        this.heatCapacityCv = heatCapacityCv;
    }

    public double getHeatCapacityCvDtemperature() {
        return heatCapacityCvDtemperature;
    }

    public void setHeatCapacityCvDtemperature(double heatCapacityCvDtemperature) {
        this.heatCapacityCvDtemperature = heatCapacityCvDtemperature;
    }

    public double getHeatCapacityCvDpressure() {
        return heatCapacityCvDpressure;
    }

    public void setHeatCapacityCvDpressure(double heatCapacityCvDpressure) {
        this.heatCapacityCvDpressure = heatCapacityCvDpressure;
    }

    public double getHeatCapacityCvDmoles() {
        return heatCapacityCvDmoles;
    }

    public void setHeatCapacityCvDmoles(double heatCapacityCvDmoles) {
        this.heatCapacityCvDmoles = heatCapacityCvDmoles;
    }

    public double getHeatCapacityCvDmolFraction() {
        return heatCapacityCvDmolFraction;
    }

    public void setHeatCapacityCvDmolFraction(double heatCapacityCvDmolFraction) {
        this.heatCapacityCvDmolFraction = heatCapacityCvDmolFraction;
    }

    public double getHelmholtzEnergy() {
        return helmholtzEnergy;
    }

    public void setHelmholtzEnergy(double helmholtzEnergy) {
        this.helmholtzEnergy = helmholtzEnergy;
    }

    public double getHelmholtzEnergyDtemperature() {
        return helmholtzEnergyDtemperature;
    }

    public void setHelmholtzEnergyDtemperature(double helmholtzEnergyDtemperature) {
        this.helmholtzEnergyDtemperature = helmholtzEnergyDtemperature;
    }

    public double getHelmholtzEnergyDpressure() {
        return helmholtzEnergyDpressure;
    }

    public void setHelmholtzEnergyDpressure(double helmholtzEnergyDpressure) {
        this.helmholtzEnergyDpressure = helmholtzEnergyDpressure;
    }

    public double getHelmholtzEnergyDmoles() {
        return helmholtzEnergyDmoles;
    }

    public void setHelmholtzEnergyDmoles(double helmholtzEnergyDmoles) {
        this.helmholtzEnergyDmoles = helmholtzEnergyDmoles;
    }

    public double getHelmholtzEnergyDmolFraction() {
        return helmholtzEnergyDmolFraction;
    }

    public void setHelmholtzEnergyDmolFraction(double helmholtzEnergyDmolFraction) {
        this.helmholtzEnergyDmolFraction = helmholtzEnergyDmolFraction;
    }

    public double getInternalEnergy() {
        return internalEnergy;
    }

    public void setInternalEnergy(double internalEnergy) {
        this.internalEnergy = internalEnergy;
    }

    public double getInternalEnergyDtemperature() {
        return internalEnergyDtemperature;
    }

    public void setInternalEnergyDtemperature(double internalEnergyDtemperature) {
        this.internalEnergyDtemperature = internalEnergyDtemperature;
    }

    public double getInternalEnergyDpressure() {
        return internalEnergyDpressure;
    }

    public void setInternalEnergyDpressure(double internalEnergyDpressure) {
        this.internalEnergyDpressure = internalEnergyDpressure;
    }

    public double getInternalEnergyDmoles() {
        return internalEnergyDmoles;
    }

    public void setInternalEnergyDmoles(double internalEnergyDmoles) {
        this.internalEnergyDmoles = internalEnergyDmoles;
    }

    public double getInternalEnergyDmolFraction() {
        return internalEnergyDmolFraction;
    }

    public void setInternalEnergyDmolFraction(double internalEnergyDmolFraction) {
        this.internalEnergyDmolFraction = internalEnergyDmolFraction;
    }

    public double getJouleThomsonCoefficient() {
        return jouleThomsonCoefficient;
    }

    public void setJouleThomsonCoefficient(double jouleThomsonCoefficient) {
        this.jouleThomsonCoefficient = jouleThomsonCoefficient;
    }

    public double getJouleThomsonCoefficientDtemperature() {
        return jouleThomsonCoefficientDtemperature;
    }

    public void setJouleThomsonCoefficientDtemperature(double jouleThomsonCoefficientDtemperature) {
        this.jouleThomsonCoefficientDtemperature = jouleThomsonCoefficientDtemperature;
    }

    public double getJouleThomsonCoefficientDpressure() {
        return jouleThomsonCoefficientDpressure;
    }

    public void setJouleThomsonCoefficientDpressure(double jouleThomsonCoefficientDpressure) {
        this.jouleThomsonCoefficientDpressure = jouleThomsonCoefficientDpressure;
    }

    public double getJouleThomsonCoefficientDmoles() {
        return jouleThomsonCoefficientDmoles;
    }

    public void setJouleThomsonCoefficientDmoles(double jouleThomsonCoefficientDmoles) {
        this.jouleThomsonCoefficientDmoles = jouleThomsonCoefficientDmoles;
    }

    public double getJouleThomsonCoefficientDmolFraction() {
        return jouleThomsonCoefficientDmolFraction;
    }

    public void setJouleThomsonCoefficientDmolFraction(double jouleThomsonCoefficientDmolFraction) {
        this.jouleThomsonCoefficientDmolFraction = jouleThomsonCoefficientDmolFraction;
    }

    public double getLogFugacityCoefficient() {
        return logFugacityCoefficient;
    }

    public void setLogFugacityCoefficient(double logFugacityCoefficient) {
        this.logFugacityCoefficient = logFugacityCoefficient;
    }

    public double getLogFugacityCoefficientDtemperature() {
        return logFugacityCoefficientDtemperature;
    }

    public void setLogFugacityCoefficientDtemperature(double logFugacityCoefficientDtemperature) {
        this.logFugacityCoefficientDtemperature = logFugacityCoefficientDtemperature;
    }

    public double getLogFugacityCoefficientDpressure() {
        return logFugacityCoefficientDpressure;
    }

    public void setLogFugacityCoefficientDpressure(double logFugacityCoefficientDpressure) {
        this.logFugacityCoefficientDpressure = logFugacityCoefficientDpressure;
    }

    public double getLogFugacityCoefficientDmoles() {
        return logFugacityCoefficientDmoles;
    }

    public void setLogFugacityCoefficientDmoles(double logFugacityCoefficientDmoles) {
        this.logFugacityCoefficientDmoles = logFugacityCoefficientDmoles;
    }

    public double getLogFugacityCoefficientDmolFraction() {
        return logFugacityCoefficientDmolFraction;
    }

    public void setLogFugacityCoefficientDmolFraction(double logFugacityCoefficientDmolFraction) {
        this.logFugacityCoefficientDmolFraction = logFugacityCoefficientDmolFraction;
    }

    public double getSpeedOfSound() {
        return speedOfSound;
    }

    public void setSpeedOfSound(double speedOfSound) {
        this.speedOfSound = speedOfSound;
    }

    public double getSpeedOfSoundDtemperature() {
        return speedOfSoundDtemperature;
    }

    public void setSpeedOfSoundDtemperature(double speedOfSoundDtemperature) {
        this.speedOfSoundDtemperature = speedOfSoundDtemperature;
    }

    public double getSpeedOfSoundDpressure() {
        return speedOfSoundDpressure;
    }

    public void setSpeedOfSoundDpressure(double speedOfSoundDpressure) {
        this.speedOfSoundDpressure = speedOfSoundDpressure;
    }

    public double getSpeedOfSoundDmoles() {
        return speedOfSoundDmoles;
    }

    public void setSpeedOfSoundDmoles(double speedOfSoundDmoles) {
        this.speedOfSoundDmoles = speedOfSoundDmoles;
    }

    public double getSpeedOfSoundDmolFraction() {
        return speedOfSoundDmolFraction;
    }

    public void setSpeedOfSoundDmolFraction(double speedOfSoundDmolFraction) {
        this.speedOfSoundDmolFraction = speedOfSoundDmolFraction;
    }

    public double getThermalConductivity() {
        return thermalConductivity;
    }

    public void setThermalConductivity(double thermalConductivity) {
        this.thermalConductivity = thermalConductivity;
    }

    public double getThermalConductivityDtemperature() {
        return thermalConductivityDtemperature;
    }

    public void setThermalConductivityDtemperature(double thermalConductivityDtemperature) {
        this.thermalConductivityDtemperature = thermalConductivityDtemperature;
    }

    public double getThermalConductivityDpressure() {
        return thermalConductivityDpressure;
    }

    public void setThermalConductivityDpressure(double thermalConductivityDpressure) {
        this.thermalConductivityDpressure = thermalConductivityDpressure;
    }

    public double getThermalConductivityDmoles() {
        return thermalConductivityDmoles;
    }

    public void setThermalConductivityDmoles(double thermalConductivityDmoles) {
        this.thermalConductivityDmoles = thermalConductivityDmoles;
    }

    public double getThermalConductivityDmolFraction() {
        return thermalConductivityDmolFraction;
    }

    public void setThermalConductivityDmolFraction(double thermalConductivityDmolFraction) {
        this.thermalConductivityDmolFraction = thermalConductivityDmolFraction;
    }

    public double getViscosity() {
        return viscosity;
    }

    public void setViscosity(double viscosity) {
        this.viscosity = viscosity;
    }

    public double getViscosityDtemperature() {
        return viscosityDtemperature;
    }

    public void setViscosityDtemperature(double viscosityDtemperature) {
        this.viscosityDtemperature = viscosityDtemperature;
    }

    public double getViscosityDpressure() {
        return viscosityDpressure;
    }

    public void setViscosityDpressure(double viscosityDpressure) {
        this.viscosityDpressure = viscosityDpressure;
    }

    public double getViscosityDmoles() {
        return viscosityDmoles;
    }

    public void setViscosityDmoles(double viscosityDmoles) {
        this.viscosityDmoles = viscosityDmoles;
    }

    public double getViscosityDmolFraction() {
        return viscosityDmolFraction;
    }

    public void setViscosityDmolFraction(double viscosityDmolFraction) {
        this.viscosityDmolFraction = viscosityDmolFraction;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolumeDtemperature() {
        return volumeDtemperature;
    }

    public void setVolumeDtemperature(double volumeDtemperature) {
        this.volumeDtemperature = volumeDtemperature;
    }

    public double getVolumeDpressure() {
        return volumeDpressure;
    }

    public void setVolumeDpressure(double volumeDpressure) {
        this.volumeDpressure = volumeDpressure;
    }

    public double getVolumeDmoles() {
        return volumeDmoles;
    }

    public void setVolumeDmoles(double volumeDmoles) {
        this.volumeDmoles = volumeDmoles;
    }

    public double getVolumeDmolFraction() {
        return volumeDmolFraction;
    }

    public void setVolumeDmolFraction(double volumeDmolFraction) {
        this.volumeDmolFraction = volumeDmolFraction;
    }

    public double getMolecularWeight() {
        return molecularWeight;
    }

    public void setMolecularWeight(double molecularWeight) {
        this.molecularWeight = molecularWeight;
    }

    @Override
    public String toString() {
        return "PhaseProperties{" +
                "compressibility=" + compressibility +
                ", compressibilityDtemperature=" + compressibilityDtemperature +
                ", compressibilityDpressure=" + compressibilityDpressure +
                ", compressibilityDmoles=" + compressibilityDmoles +
                ", compressibilityDmolFraction=" + compressibilityDmolFraction +
                ", compressibilityFactor=" + compressibilityFactor +
                ", compressibilityFactorDtemperature=" + compressibilityFactorDtemperature +
                ", compressibilityFactorDpressure=" + compressibilityFactorDpressure +
                ", compressibilityFactorDmoles=" + compressibilityFactorDmoles +
                ", compressibilityFactorDmolFraction=" + compressibilityFactorDmolFraction +
                ", density=" + density +
                ", densityDtemperature=" + densityDtemperature +
                ", densityDpressure=" + densityDpressure +
                ", densityDmoles=" + densityDmoles +
                ", densityDmolFraction=" + densityDmolFraction +
                ", enthalpy=" + enthalpy +
                ", enthalpyDtemperature=" + enthalpyDtemperature +
                ", enthalpyDpressure=" + enthalpyDpressure +
                ", enthalpyDmoles=" + enthalpyDmoles +
                ", enthalpyDmolFraction=" + enthalpyDmolFraction +
                ", entropy=" + entropy +
                ", entropyDtemperature=" + entropyDtemperature +
                ", entropyDpressure=" + entropyDpressure +
                ", entropyDmoles=" + entropyDmoles +
                ", entropyDmolFraction=" + entropyDmolFraction +
                ", fugacity=" + fugacity +
                ", fugacityDtemperature=" + fugacityDtemperature +
                ", fugacityDpressure=" + fugacityDpressure +
                ", fugacityDmoles=" + fugacityDmoles +
                ", fugacityDmolFraction=" + fugacityDmolFraction +
                ", fugacityCoefficient=" + fugacityCoefficient +
                ", fugacityCoefficientDtemperature=" + fugacityCoefficientDtemperature +
                ", fugacityCoefficientDpressure=" + fugacityCoefficientDpressure +
                ", fugacityCoefficientDmoles=" + fugacityCoefficientDmoles +
                ", fugacityCoefficientDmolFraction=" + fugacityCoefficientDmolFraction +
                ", gibbsEnergy=" + gibbsEnergy +
                ", gibbsEnergyDtemperature=" + gibbsEnergyDtemperature +
                ", gibbsEnergyDpressure=" + gibbsEnergyDpressure +
                ", gibbsEnergyDmoles=" + gibbsEnergyDmoles +
                ", gibbsEnergyDmolFraction=" + gibbsEnergyDmolFraction +
                ", heatCapacityCp=" + heatCapacityCp +
                ", heatCapacityCpDtemperature=" + heatCapacityCpDtemperature +
                ", heatCapacityCpDpressure=" + heatCapacityCpDpressure +
                ", heatCapacityCpDmoles=" + heatCapacityCpDmoles +
                ", heatCapacityCpDmolFraction=" + heatCapacityCpDmolFraction +
                ", heatCapacityCv=" + heatCapacityCv +
                ", heatCapacityCvDtemperature=" + heatCapacityCvDtemperature +
                ", heatCapacityCvDpressure=" + heatCapacityCvDpressure +
                ", heatCapacityCvDmoles=" + heatCapacityCvDmoles +
                ", heatCapacityCvDmolFraction=" + heatCapacityCvDmolFraction +
                ", helmholtzEnergy=" + helmholtzEnergy +
                ", helmholtzEnergyDtemperature=" + helmholtzEnergyDtemperature +
                ", helmholtzEnergyDpressure=" + helmholtzEnergyDpressure +
                ", helmholtzEnergyDmoles=" + helmholtzEnergyDmoles +
                ", helmholtzEnergyDmolFraction=" + helmholtzEnergyDmolFraction +
                ", internalEnergy=" + internalEnergy +
                ", internalEnergyDtemperature=" + internalEnergyDtemperature +
                ", internalEnergyDpressure=" + internalEnergyDpressure +
                ", internalEnergyDmoles=" + internalEnergyDmoles +
                ", internalEnergyDmolFraction=" + internalEnergyDmolFraction +
                ", jouleThomsonCoefficient=" + jouleThomsonCoefficient +
                ", jouleThomsonCoefficientDtemperature=" + jouleThomsonCoefficientDtemperature +
                ", jouleThomsonCoefficientDpressure=" + jouleThomsonCoefficientDpressure +
                ", jouleThomsonCoefficientDmoles=" + jouleThomsonCoefficientDmoles +
                ", jouleThomsonCoefficientDmolFraction=" + jouleThomsonCoefficientDmolFraction +
                ", logFugacityCoefficient=" + logFugacityCoefficient +
                ", logFugacityCoefficientDtemperature=" + logFugacityCoefficientDtemperature +
                ", logFugacityCoefficientDpressure=" + logFugacityCoefficientDpressure +
                ", logFugacityCoefficientDmoles=" + logFugacityCoefficientDmoles +
                ", logFugacityCoefficientDmolFraction=" + logFugacityCoefficientDmolFraction +
                ", speedOfSound=" + speedOfSound +
                ", speedOfSoundDtemperature=" + speedOfSoundDtemperature +
                ", speedOfSoundDpressure=" + speedOfSoundDpressure +
                ", speedOfSoundDmoles=" + speedOfSoundDmoles +
                ", speedOfSoundDmolFraction=" + speedOfSoundDmolFraction +
                ", thermalConductivity=" + thermalConductivity +
                ", thermalConductivityDtemperature=" + thermalConductivityDtemperature +
                ", thermalConductivityDpressure=" + thermalConductivityDpressure +
                ", thermalConductivityDmoles=" + thermalConductivityDmoles +
                ", thermalConductivityDmolFraction=" + thermalConductivityDmolFraction +
                ", viscosity=" + viscosity +
                ", viscosityDtemperature=" + viscosityDtemperature +
                ", viscosityDpressure=" + viscosityDpressure +
                ", viscosityDmoles=" + viscosityDmoles +
                ", viscosityDmolFraction=" + viscosityDmolFraction +
                ", volume=" + volume +
                ", volumeDtemperature=" + volumeDtemperature +
                ", volumeDpressure=" + volumeDpressure +
                ", volumeDmoles=" + volumeDmoles +
                ", volumeDmolFraction=" + volumeDmolFraction +
                ", molecularWeight=" + molecularWeight +
                '}';
    }
}
