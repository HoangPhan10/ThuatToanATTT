package com.example.ThucHanh;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Test13 {
    final static Logger logger = Logger.getLogger(Test13.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        Test13 test13 = new Test13();
        if(test13.checkCamichael(n)){
            logger.log(Level.INFO,n + " is a number camichael");
        }else{
            logger.log(Level.WARNING,n + " is not a number camichael");
        }
    }
    public boolean checkCamichael(int n){
        Test11 test11 = new Test11();
        HashMap<String, List<Integer>> check = test11.camichael(n);
        List<Integer> checkSoMu = check.get("soMu").stream().filter(e->e>1).collect(Collectors.toList());

        if(checkSoMu.size()==0&check.get("coSo").size()>=3){
            for(int x :check.get("coSo")){
               int s = (n-1)/(x-1);
               if(s*(x-1)!=n-1){
                   return false;
               }
            }
            return true;
        }
        return false;
    }

}
