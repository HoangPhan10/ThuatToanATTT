package com.example.ThucHanh;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Test16 {
    final static Logger logger = Logger.getLogger(Test18.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter T: ");
        String t = scanner.nextLine();
        System.out.print("Enter P: ");
        String p = scanner.nextLine();
        String[] arrT = t.split("");
        List<String> list = new ArrayList<String>();
        for (String str:arrT){
            list.add(str);
        }
        List<String> distinct = list.stream().distinct().collect(Collectors.toList());
        HashMap<String,Integer> L = new HashMap<String,Integer>();
        for(int i =0;i<distinct.size();i++){
            L.put(distinct.get(i),0);
        }
        String[] arrP = p.split("");
        for (int i =0;i< distinct.size();i++){
           L.put(distinct.get(i),searchElement(arrP,distinct.get(i)));
        }

        int i = arrP.length-1;
        int j = arrP.length-1;
        int numberOfIterations =0;
       while (j>=0){
           if(i>=arrT.length){
               logger.log(Level.INFO,"Not found");
               break;
           }
           numberOfIterations++;
           if(arrT[i].equals(arrP[j])){
               i=i-1;
               j=j-1;
           }else{
               i = i+arrP.length - Math.min(j,1+L.get(arrT[i]));
               j = arrP.length-1;
           }
       }
        System.out.println(numberOfIterations);

    }
    static int searchElement(String[] arr, String x) {
        for(int i = arr.length-1;i>=0;i--) {
            if (arr[i].equals(x))
                return i;
        }
        return -1;
    }
}
