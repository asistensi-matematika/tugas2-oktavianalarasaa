/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistensialpro;
import java.util.Scanner;

/**
 *
 * @author oktaviana larasati
 */
public class Nmor5Asis {
    public static void main (String[]args) {
        // a dan x diantara -1 dan 1
        Scanner input = new Scanner (System.in);
        System.out.print("Input nilai a :");
        double a = input.nextDouble();
        System.out.print("Input nilai n :");
        int n = input.nextInt();
        System.out.print ("Input nilai x :");
        double x = input.nextDouble();
        double[] f = new double[100001];
        f[0] = a/(1-a);
        double F = 0 ;
        double ab= 0.5 * Math.pow(10, 2-n);
        for (int i=1; i<=100000; i++){
            f[i]=f[i-1]+deret(x, a, i);
            double ac = ((f[i]-f[i-1])/f[i])*100;
            if(Math.abs(ab)<ac){
                F += f[i];
                System.out.println(i);
                break;
                
            }
            
        }
         System.out.println("Nilai f(x) di x = " +x+ " adalah "+Math.floor(F*100000)/100000);
    }
    public static double deret (double x, double a, int suku) {
        double hasil = 1;
        for ( int i=1; i<=suku; i++){
            hasil *=(x-a)/(1-a);
            
        }
        return hasil;
        
    }
    
}
