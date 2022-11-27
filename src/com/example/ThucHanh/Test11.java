package com.example.ThucHanh;

import com.example.common.CheckPrime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Test11 {
    final static Logger logger = Logger.getLogger(Test11.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scanner.nextInt();
        Test11 test11 = new Test11();
        test11.camichael(n);
    }
    public HashMap<String,List<Integer>> camichael(int n){
        HashMap<String,List<Integer>> hashMap = new HashMap<String,List<Integer>>();
        CheckPrime prime = new CheckPrime();
        List<Integer> soMu = new ArrayList<Integer>();
        List<Integer> coSo = new ArrayList<Integer>();
        coSo.add(0);
        while (n != 1) {
            for (int i = 2; i <= n; i++) {
                if (prime.checkPrime(i)) {
                    int a = n / i;
                    if (a * i == n) {
                        if (i == coSo.get(coSo.size() - 1)) {
                            int lastSoMu = soMu.get(soMu.size() - 1);
                            soMu.set(soMu.size() - 1, ++lastSoMu);
                        } else {
                            soMu.add(1);
                        }
                        coSo.add(i);
                        n = a;
                        break;
                    }

                }
            }
        }
        List<Integer> resultCoSo = coSo.stream().filter(e -> e != 0).distinct().collect(Collectors.toList());
//        logger.log(Level.INFO, "Co So : " + resultCoSo);
//        logger.log(Level.INFO, "So Mu : " + soMu);
        hashMap.put("coSo",resultCoSo);
        hashMap.put("soMu",soMu);
        return hashMap;
    }


}
