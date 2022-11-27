package com.example.common;

public class CheckPrime {
    public Boolean checkPrime(int n){
        for(int j =2;j<=Math.sqrt(n);j++){
            if (n%j==0&j!=n){
                return false;
            }
        }
        return true;
    }
}
