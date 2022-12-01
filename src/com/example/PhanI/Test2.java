package com.example.PhanI;

import com.example.common.CheckPrime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test2 {
    final static Logger logger = Logger.getLogger(Test1.class.getName());

    public static void main(String[] args) {
        System.out.print("Enter n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> result = new ArrayList<Integer>();
        CheckPrime checkPrime = new CheckPrime();
        for(int i = (int) Math.pow(10,n-1)+1;i<Math.pow(10,n);i++){
            if((i-1)%6==0||(i+1)%6==0){
                if(checkPrime.checkPrime(i)){
                    result.add(i);
                }
            }
        }
        logger.log(Level.INFO,result.toString()+result.size());
    }
}
