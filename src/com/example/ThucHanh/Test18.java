package com.example.ThucHanh;

import java.util.Scanner;
import java.util.logging.Logger;

public class Test18 {
    final static Logger logger = Logger.getLogger(Test18.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter T: ");
        String t = scanner.nextLine();
        System.out.print("Enter P: ");
        String p = scanner.nextLine();
        String[] arrT = t.split("");
        String[] arrP = p.split("");
       for(int i =0;i<arrT.length;i++){
           if(arrT[i].equals(arrP[0])){
               int count =1;
               for(int j =1;j<arrP.length;j++){
                   if(i+j== arrT.length){
                       System.out.println("Not Found");
                       return;
                   }
                   if(arrT[i+j].equals(arrP[j])){
                       ++count;
                   }
               }
               if(count==arrP.length){
                   System.out.println("Number of iterations: "+(i+1));
                   return;
               }
           }
       }
        System.out.println("Not Found");
    }
}
