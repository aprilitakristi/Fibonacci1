/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonanci;
import java.util.Scanner;

/**
 *
 * @author Praktikum
 */
public class Fibonanci {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.println("Input Jumlah: ");
        Scanner scn=new Scanner(System.in);
        int fibocount=scn.nextInt();
        int a=0;
        int b=1;
        for (int i = 1; i < fibocount; i++) {
            System.out.println("Deret Fibo: "+a);
            a=a+b;
            b=a-b;
        }
    }
    
}
