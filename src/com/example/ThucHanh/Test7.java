package com.example.ThucHanh;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test7 {
    final static Logger logger = Logger.getLogger(Test7.class.getName());

    public static void main(String[] args) {
        int a =28150488;
        int b = 10507620;
        Test7 test7 = new Test7();
        logger.log(Level.INFO,test7.gcd(a,b).toString());
    }
    public Integer gcd(int a,int b){
        while (b>0){
            int r = a%b;
            a=b;
            b=r;
        }
        return a;
    }
}
