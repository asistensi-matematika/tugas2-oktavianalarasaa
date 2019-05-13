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
public class Nomor3asis {
    public static void main (String[]args){
        // a dan x diantara -1 dan 1
        Scanner input = new Scanner(System.in);
        System.out.print("Input a =");
        double a = input.nextDouble();
        System.out.print("Input n =");
        int n = input.nextInt();
        System.out.print("Input x =");
        double x = input.nextDouble();
        double[] f = new double [100001];
        f[0]= (Math.exp(6*a)+Math.exp(-6*a))/2;
        double F=0;
        double ab = 0.5* Math.pow(10, 2-n);
        for(int i=1; i<=100000; i++){
        f[i]=f[i-1] + ((Math.exp(6*a) + Math.exp(-6*a))*(Math.pow(6,i)*Math.pow(x-a,i)))/(2*(faktorial(i)));
        double ac= ((f[i]-f[i-1])/f[i])*100;
        if(Math.abs(ac)<ab){
            if(Math.abs(ac)<ab){
                if (a==0){
                    f[i]/=2;
                    
                }
                F += f[i];
                System.out.println(i);
                break;
                
            }
        }
        System.out.println("Nilai f(x) di x = "+x+ " adalah "+Math.floor (F*100000)/100000);
        }
      
        public static double faktorial (double nilai ){
            if(nilai==1 ||  nilai==0){
                return 1;
            }else{
                return nilai*faktorial(nilai-1);
                
            }
        }
        
    }
                
        
    
