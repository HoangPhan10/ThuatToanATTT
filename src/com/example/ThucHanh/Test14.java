package com.example.ThucHanh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test14 {
    final static Logger logger = Logger.getLogger(Test14.class.getName());

    public static void main(String[] args) {
        Test13 test13 = new Test13();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        List<Integer> result = new ArrayList<Integer>();
        for(int i =1;i<=n;i++){
            if(test13.checkCamichael(i)){
                result.add(i);
            }
        }
        logger.log(Level.INFO,result.toString());
    }
}
