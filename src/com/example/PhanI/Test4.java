package com.example.PhanI;

import com.example.common.CheckPrime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test4 {
    final static Logger logger = Logger.getLogger(Test3.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a = ");
        int a = scanner.nextInt();
        System.out.print("Enter b = ");
        int b = scanner.nextInt();
        Test4 test4 = new Test4();
        logger.log(Level.INFO,test4.getListPrimeAtoB(a,b).toString());
    }
    public List<Integer> getListPrimeAtoB(int a,int b){
        List<Integer> result = new ArrayList<Integer>();
        CheckPrime prime = new CheckPrime();
        for(int i =a;i<=b;i++){
            if(i<2){
                continue;
            }
            if(i==2||i==3){
                result.add(i);
                continue;
            }
            if((i-1)%6==0||(i+1)%6==0){
                if(prime.checkPrime(i)){
                    result.add(i);
                }
            }
        }
        return result;
    }
}
