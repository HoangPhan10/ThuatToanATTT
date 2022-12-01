package com.example.PhanI;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test5 {
    final static Logger logger = Logger.getLogger(Test5.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a = ");
        int a = scanner.nextInt();
        System.out.print("Enter b = ");
        int b = scanner.nextInt();
        Test5 test5 = new Test5();
        System.out.println(test5.sumListPrimeAtoB(a,b));
    }

    public long sumListPrimeAtoB(int a,int b){
        Test4 test4 = new Test4();
        List<Integer> result = test4.getListPrimeAtoB(a,b);
        long kq = 0;
        for(Integer num : result){
            kq+=num;
        }
        return kq;
    }

}
