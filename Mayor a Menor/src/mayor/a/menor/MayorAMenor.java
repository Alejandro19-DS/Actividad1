/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayor.a.menor;

/**
 *
 * @author Alex
 */
import java.util.Scanner;

public class MayorAMenor {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int num1 = sc.nextInt();
        
        System.out.println("Introduce el segundo número:");
        int num2 = sc.nextInt();
        
        if (num1 > num2) {
            System.out.println(num1 + " " + num2);
        } else {
            System.out.println(num2 + " " + num1);
        }
    }
}
    

