package com.chekernel.capeopen.databank;

import com.chekernel.capeopen.databank.util.DISPLAY_OPTION;
import com.chekernel.capeopen.databank.util.RESPONSE;
import com.chekernel.capeopen.databank.attributes.*;

import java.util.ArrayList;
import java.util.List;

import static com.chekernel.capeopen.databank.util.DISPLAY_OPTION.*;
import static java.lang.System.*;

public final class Chemical {

    private String name;
    private List<String> result = new ArrayList<>();
    private DISPLAY_OPTION displayOption = DISPLAY_OPTION.INVALID;

    public Chemical(){
    }

    private Chemical(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getResult() {
        return result;
    }

    public void setResult(List<String> result) {
        this.result = result;
    }

    public DISPLAY_OPTION getDisplayOption() {
        return displayOption;
    }

    public void setDisplayOption(DISPLAY_OPTION displayOption) {
        this.displayOption = displayOption;
    }

    public static final class Kernel{

        private String _name;
        private DISPLAY_OPTION _displayOption = DISPLAY_OPTION.INVALID;

        public Kernel(final String chemicalNameOrFormula){
            this._name = chemicalNameOrFormula;
        }

        public Kernel show(DISPLAY_OPTION input){

            this._displayOption = input;
            return this;
        }

        public Chemical build(){
            return new Chemical(this);
        }
    }

    public Chemical(final Kernel Kernel){

        final int DEF_SZIE = 3;

        if(name == null || name.length() <= DEF_SZIE) {
            this.name = RESPONSE.NOT_SPECIFIED.getValue();
            this.result.clear();
            this.result.add(DISPLAY_OPTION.INVALID.getKey());
        }
        this.result = response(Kernel._displayOption);
        this.name = Kernel._name+"\n"+this.result;
    }

    private static List<String> response(DISPLAY_OPTION OPTION){

        List<String> result = new ArrayList<>();

        //for(DISPLAY_OPTION displayOption : OPTION){

            switch (OPTION){

                case ALL_INFORMATION: {
                    result.clear();
                    result.add(new BasicInfo().toString()+"\n");
                    result.add(new ConstantCompoundProperties().toString()+"\n");
                    result.add(new PhaseEquilibriumProperties().toString()+"\n");
                    result.add(new PhasePairProperties().toString()+"\n");
                    result.add(new PhaseProperties().toString()+"\n");
                    result.add(new TemperatureDependentCompoundProperties().toString());
                }break;
                case BASIC_INFORMATION: {
                    result.clear();
                    result.add(new BasicInfo().toString());
                }break;
                case CONSTANT_COMPOUND_PROPERTIES: {
                    result.clear();
                    result.add(new ConstantCompoundProperties().toString());
                }break;
                case PHASE_EQUILIBRIUM_PROPERTIES: {
                    result.clear();
                    result.add(new PhaseEquilibriumProperties().toString());
                }break;
                case PHASE_PAIR_PROPERTIES: {
                    result.clear();
                    result.add(new PhasePairProperties().toString());
                }break;
                case PHASE_PROPERTIES: {
                    result.clear();
                    result.add(new PhaseProperties().toString());
                }break;
                case TEMPERATURE_DEPENDENT_COMPOUND_PROPERTIES: {
                    result.clear();
                    result.add(new TemperatureDependentCompoundProperties().toString());
                }break;
                case INVALID: {
                    result.clear();
                    result.add(RESPONSE.NOT_SPECIFIED.getValue());
                }break;

            }
        //}
        return result;
    }

    @Override
    public String toString() {
        return "Chemical{" +
                "name='" + name + '\''+
                '}';
    }
}
