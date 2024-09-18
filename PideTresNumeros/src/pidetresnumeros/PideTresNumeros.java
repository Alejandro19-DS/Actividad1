/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pidetresnumeros;

/**
 *
 * @author Alex
 */
import java.util.Scanner;
import java.util.Arrays;

public class PideTresNumeros {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        
        System.out.println("Introduce el primer número:");
        nums[0] = sc.nextInt();
        
        System.out.println("Introduce el segundo número:");
        nums[1] = sc.nextInt();
        
        System.out.println("Introduce el tercer número:");
        nums[2] = sc.nextInt();
        
        Arrays.sort(nums);
        
        System.out.println("Números ordenados de mayor a menor:");
        for (int i = 2; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
    }
}

