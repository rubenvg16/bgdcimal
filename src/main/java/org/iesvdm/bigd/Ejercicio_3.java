package org.iesvdm.bigd;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Ejercicio_3 {
    public static void main(String[] args) {
        BigDecimal p = new BigDecimal("200000");
        BigDecimal tasa_anual = new BigDecimal("0.05");
        BigDecimal saldo = p;
        int anios = 30;
        int contador = 1;

        //Cálculo tasa de interes mensual
        BigDecimal r = tasa_anual.divide(BigDecimal.valueOf(12), 10, RoundingMode.HALF_UP);

        //Calculo del número de pagos
        int num_pagos = anios*12;

        //Cálculo del pago mensual
        BigDecimal divisor = p.multiply(r);
        BigDecimal dividendo = r.add(BigDecimal.ONE);
        dividendo = dividendo.pow(num_pagos);
        dividendo = BigDecimal.ONE.divide(dividendo, 10, RoundingMode.HALF_UP);
        dividendo = BigDecimal.ONE.subtract(dividendo);
        BigDecimal ptm = divisor.divide(dividendo, 10, RoundingMode.HALF_UP);

        while (saldo.compareTo(BigDecimal.ZERO) >= 0){
            //Cálculo pago de intereses
            BigDecimal interes = saldo.multiply(r, MathContext.DECIMAL32);

            //Cálculo pago principal
            BigDecimal pago_principal= ptm.subtract(interes);

            saldo = saldo.subtract(pago_principal);

            System.out.println(contador + "    " + ptm + "    " + pago_principal + "    " + interes + "    " + saldo);


            contador++;
        }

    }
}
