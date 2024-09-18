/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diamesañofecha;

/**
 *
 * @author Alex
 */
import java.util.Scanner;

public class DiaMesAñoFecha {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el día:");
        int dia = sc.nextInt();
        
        System.out.println("Introduce el mes:");
        int mes = sc.nextInt();
        
        System.out.println("Introduce el año:");
        int año = sc.nextInt();
        
        boolean fechaCorrecta = true;
        
        if (mes < 1 || mes > 12) {
            fechaCorrecta = false;
        } else if (dia < 1 || dia > 31) {
            fechaCorrecta = false;
        } else if (mes == 2 && dia > 28) {
            fechaCorrecta = false;
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            fechaCorrecta = false;
        }
        
        if (fechaCorrecta) {
            System.out.println("La fecha es correcta.");
        } else {
            System.out.println("La fecha es incorrecta.");
        }
    }
}
