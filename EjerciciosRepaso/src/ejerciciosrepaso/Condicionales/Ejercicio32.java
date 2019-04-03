/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrepaso.Condicionales;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Ejercicio32 {
    public void operacion () {
      Scanner entrada=new Scanner(System.in);
      System.out.println("Ingrese horas: ");
      int hr=entrada.nextInt();
      System.out.println("Ingrese minutos: ");
      int mn=entrada.nextInt();
      System.out.println("Ingrese segundos: ");
      int sg=entrada.nextInt();
      int hrs=hr;
      int mns=mn;
      int sgs=sg;
      if (sg<59) {
          sgs++;
      }
      else {
          if (sgs==60) {
              mns++;
          }
          else {
              if (mns==60) {
                  hrs++;
              }
              if (hr>12) {
              hrs=1;
              }
          }
      }
      
        System.out.println("La hora +1 seg. es= " + hrs + ":" + mns + ":" + sgs);
    }
}
