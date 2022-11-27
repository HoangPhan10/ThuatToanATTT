package com.example.ThucHanh;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test10 {
    final static Logger logger = Logger.getLogger(Test10.class.getName());
    final static Test7 test7 = new Test7();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n : ");
        long n = scanner.nextLong();
        long a = 2;
        long b = 2;
        for(int i =1;;i++){
            a = (long) (Math.pow(a,2)+1)%n;
            b = (long) (Math.pow(b,2)+1)%n;
            b = (long) (Math.pow(b,2)+1)%n;
            int d = test7.gcd((int) Math.abs(b-a),(int) n);
            if(d>1&d<n){
                logger.log(Level.INFO,"d = "+d);
                return;
            }
            if (d==n){
                logger.log(Level.WARNING,"Not found");
                return;
            }
        }
    }

}
