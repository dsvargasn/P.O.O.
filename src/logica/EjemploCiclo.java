/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Random;
/**
 *
 * @author Estudiantes
 */
public class EjemploCiclo {
    public void operacion () {
        int[] numeros = new int [5];
        Random r = new Random ();
        for (int i=0; i<5; i++) {
            numeros[i] = r.nextInt();
        }
        int x = 1;
        while (x < 5) {
            System.out.println("arreglo en " + x + " = " + numeros[x]);
            x++;
        }
    }
}
