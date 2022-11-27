package com.example.ThucHanh;

import com.example.common.CheckPrime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test9 {
    final static Logger logger = Logger.getLogger(Test9.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scanner.nextInt();
        CheckPrime prime = new CheckPrime();
        List<Integer> result = new ArrayList<Integer>();
        if(n<2){
            logger.log(Level.WARNING,"There is no prime number less than "+n);
        } else {
            for(int i = 2;i<=n;i++){
                boolean check = prime.checkPrime(i);
              if (check){
                  result.add(i);
              }
            }
            logger.log(Level.INFO,result.toString());
        }

    }
}
