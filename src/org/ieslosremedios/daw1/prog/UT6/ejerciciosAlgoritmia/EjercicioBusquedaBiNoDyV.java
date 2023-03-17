package org.ieslosremedios.daw1.prog.UT6.ejerciciosAlgoritmia;

import java.util.Arrays;

public class EjercicioBusquedaBiNoDyV {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int parametro=6;
        int pos=dyv(a,parametro);
        System.out.println("El elemento "+parametro+" se encuentra en la posición "+pos);

    }
    private static int dyv(int[] a, int parametro){
        int laMitad=a.length/2;
        if(a[laMitad]==parametro){
            return laMitad;
        } else if (parametro<a[laMitad]){
            return dyv(Arrays.copyOfRange(a,0,laMitad-1),parametro);
        } else
            return dyv(Arrays.copyOfRange(a,laMitad+1,a.length),parametro);


    }

}
