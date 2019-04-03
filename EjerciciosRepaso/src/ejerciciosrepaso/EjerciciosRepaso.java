/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrepaso;
import ejerciciosrepaso.EjerciciosSimples.*;
import ejerciciosrepaso.Condicionales.*;
import java.util.Scanner;
/**
 *
 * @author Estudiantes
 */
public class EjerciciosRepaso {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el ejercicio: ");
        int numero=entrada.nextInt();
        switch(numero) {
            case 2:
                System.out.println("Ejercicio 02.");
                Ejercicio02 ej02 = new Ejercicio02();
                ej02.operacion ();
            break;
            case 8:
                System.out.println("Ejercicio 08.");
                Ejercicio08 ej08 = new Ejercicio08();
                ej08.operacion ();
            break; 
            case 14:
                System.out.println("Ejercicio 14.");
                Ejercicio14 ej14 = new Ejercicio14();
                ej14.operacion ();
            break;
            case 20:
                System.out.println("Ejercicio 20.");
                Ejercicio20 ej20 = new Ejercicio20();
                ej20.operacion ();
            break;
            case 26:
                System.out.println("Ejercicio 26.");
                Ejercicio26 ej26 = new Ejercicio26();
                ej26.operacion ();
            break;
            case 32:
                System.out.println("Ejercicio 32.");
                Ejercicio32 ej32 = new Ejercicio32();
                ej32.operacion ();
            break;
        }
    }
}
