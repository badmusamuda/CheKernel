package com.chekernel.capeopen.databank.util;

import java.util.EnumSet;

public enum  DISPLAY_OPTION {

    ALL_INFORMATION("all_information"),
    BASIC_INFORMATION("name"),
    PHASE_EQUILIBRIUM_PROPERTIES("phase_equilibrium_properties"),
    PHASE_PAIR_PROPERTIES("phase_pair_properties"),
    PHASE_PROPERTIES("phase_properties"),
    CONSTANT_COMPOUND_PROPERTIES("constand_compound_properties"),
    TEMPERATURE_DEPENDENT_COMPOUND_PROPERTIES("temperature_dependent_compound_properties"),
    INVALID("no_display_option_specified");

    private String key;

    DISPLAY_OPTION(final String input){
        this.key = input;
    }
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public static DISPLAY_OPTION filter(final DISPLAY_OPTION displayOption){

        DISPLAY_OPTION output = DISPLAY_OPTION.INVALID;

        for(DISPLAY_OPTION display_option : EnumSet.range(ALL_INFORMATION,TEMPERATURE_DEPENDENT_COMPOUND_PROPERTIES)){

            if( displayOption.equals(display_option) )
                output = display_option;
        }

        return output;
    }

    @Override
    public String toString() {
        return "DISPLAY_OPTION{" +
                "key='" + key + '\'' +
                '}';
    }

    public static void main(String[] args) {

        System.out.print( filter(ALL_INFORMATION) );

    }
}
