/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonanci;
import java.util.Scanner;

/**
 *
 *KEBALIK NIH
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
        int jum=0;
        for (int i = 1; i < fibocount; i++) {
            a=a+b;
            b=a-b;
            jum=jum+a;
        }
        System.out.println("Jumlah : "+jum);
    }
    
}
