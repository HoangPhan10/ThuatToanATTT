package com.example.PhanI;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Test6 {
    final static Logger logger = Logger.getLogger(Test6.class.getName());

    public static void main(String[] args) {
        System.out.print("Enter n = ");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for(int i = 220;i<=n;i++){
            Test3 test3 = new Test3();
            List<Integer> result = test3.findPandS(i);
            int b = result.get(1)-i;
            List<Integer> result2 = test3.findPandS(b);
            int c = result2.get(1)-b;
            if(c==i&&i!=b){
                System.out.println(result2.get(1)-b+ " "+i);
                System.out.println(i + " "+ b);
            }
        }
    }
}
