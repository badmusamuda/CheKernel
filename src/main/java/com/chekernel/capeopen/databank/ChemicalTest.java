package com.chekernel.capeopen.databank;

import static com.chekernel.capeopen.databank.util.DISPLAY_OPTION.PHASE_PROPERTIES;
import static java.lang.System.out;

public class ChemicalTest {

    public static void main(String[] args) {

        Chemical chemical = new Chemical.Kernel("Ethane")
                .show(PHASE_PROPERTIES)
                .build();

        out.println(chemical);

    }

}
