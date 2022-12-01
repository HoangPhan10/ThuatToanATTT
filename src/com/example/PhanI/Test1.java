package com.example.PhanI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test1  {
    final static Logger logger = Logger.getLogger(Test1.class.getName());

    public static void main(String[] args) {
        System.out.print("Enter n = ");
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        List<Long> result = new ArrayList<Long>();
        for(long i = 1;i<=n;i++){
            if(checkQPrime(i)){
                result.add(i);
            }
        }
        logger.log(Level.INFO,result.toString());
    }
    public static boolean checkQPrime(long n){
        int count = 0;
        for(int i =2;i<n-1;i++){
            if(n%i==0){
                count++;
            }

            if(count>2){
                return false;
            }
        }
        if(count==2){
            return true;
        }
        return false;
    }

}
