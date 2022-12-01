package com.example.PhanI;

import com.example.ThucHanh.Test11;
import com.example.common.CheckPrime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Test3 {
    final static Logger logger = Logger.getLogger(Test3.class.getName());

    public static void main(String[] args) {
        System.out.print("Enter n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> kAndQ = findKandQ(n);
        Test3 test3 = new Test3();
        List<Integer> pAndS = test3.findPandS(n);
        int k = kAndQ.get(0);
        int q = kAndQ.get(1);
        int s = pAndS.get(0);
        int p = pAndS.get(1);
        int result = n+p+s-q-k;
        System.out.println(result);
    }

    public static List<Integer> findKandQ(int n){
        CheckPrime prime = new CheckPrime();
        List<Integer> coSo= new ArrayList<Integer>();
        List<Integer> result= new ArrayList<Integer>();
        while (n!=1){
            for(int i =2;i<=n;i++){
                if(prime.checkPrime(i)){
                    if(n%i==0){
                        coSo.add(i);
                        n=n/i;
                        break;
                    }
                }
            }
        }
        List<Integer> resultCoSo = coSo.stream().distinct().collect(Collectors.toList());
        int q = 0;
        for(Integer num :resultCoSo){
            q+=num;
        }
        result.add(resultCoSo.size());
        result.add(q);
        return result;
    }

    public List<Integer> findPandS(int n) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        for(int i =1;i*i<=n;i++){
            if(n%i==0){
                int j = n/i;
                list.add(j);
                if(i!=j){
                    list.add(i);
                }
            }
        }
        int p = 0;
        for(Integer num :list){
            p+=num;
        }
        result.add(list.size());
        result.add(p);
        return result;
    }
}
