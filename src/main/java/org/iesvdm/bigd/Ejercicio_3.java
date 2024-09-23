package org.iesvdm.bigd;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Ejercicio_3 {
    public static void main(String[] args) {
        BigDecimal p = new BigDecimal("200000");
        BigDecimal tasa_anual = new BigDecimal("0.05");
        BigDecimal anios = new BigDecimal("30");
        BigDecimal saldo = p;
        Integer contador = 1;

        //Cálculo tasa de interes mensual
        BigDecimal r = tasa_anual.divide(BigDecimal.valueOf(12), 10, RoundingMode.HALF_UP);

        //Calculo del número de pagos
        BigDecimal num_pagos = anios.multiply(BigDecimal.valueOf(12));

        //Cálculo del pago mensual
        BigDecimal divisor = p.multiply(r);
        System.out.println(divisor);
        BigDecimal dividendo = r.add(BigDecimal.ONE);
        dividendo = dividendo.multiply(BigDecimal.ONE.divide(anios, 2, RoundingMode.HALF_UP));

        System.out.println(dividendo);
        BigDecimal ptm = divisor.divide(dividendo, 2, RoundingMode.HALF_UP);
        System.out.println(ptm);

        //Cálculo pago de intereses
        BigDecimal interes = saldo.multiply(r);

        //Cálculo pago principal
        BigDecimal pago_principal= ptm.subtract(interes);

        //Cálculo nuevo saldo
        BigDecimal nuevo_saldo = saldo.subtract(pago_principal);


        /*while (saldo.compareTo(BigDecimal.ZERO) != 0){
            System.out.println(contador + "    " + ptm + "    " + pago_principal + "    " + interes + "    " + nuevo_saldo);
            saldo = saldo.subtract(pago_principal);
            contador++;
        }*/

    }
}
