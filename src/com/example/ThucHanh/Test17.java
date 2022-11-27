package com.example.ThucHanh;

import java.util.*;
import java.util.logging.Logger;

public class Test17 {
    final static Logger logger = Logger.getLogger(Test17.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter T: ");
        String t = scanner.nextLine();
        System.out.print("Enter P: ");
        String p = scanner.nextLine();
        String[] arrT = t.split("");
        String[] arrP = p.split("");
        Test17 test17 = new Test17();
        HashMap<Integer,Integer> F = new HashMap<Integer,Integer>();
        F.put(0,-1);
        for (int i = 1; i < arrP.length; i++) {
            List<String> prefix = test17.prefix(p, i);
            List<String> suffixes = test17.suffixes(p, i);
            int hash = test17.intersection(prefix,suffixes);
            F.put(i,hash);
        }
        System.out.println(F);
        int i =0;
        int j=0;
        int count =0;
        while(i<arrT.length-1){
            if(arrT[i+j].equals(arrP[j])){
                j++;
            }else{
                i = i+j - F.get(j);
                if(F.get(j)==-1){
                    j=0;
                }else{
                    j = F.get(j);
                }
            }
            count++;
            System.out.println(i);
            if(j>arrP.length-1){
                System.out.println(count);
                return;
            }
        }
        System.out.println("Not found "+count);
    }

    public List<String> prefix(String str, int j) {
        String strSlice = str.substring(0, j);
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < strSlice.length(); i++) {
            String slice = strSlice.substring(0, i + 1);
            list.add(slice);
        }
        return list;
    }

    public List<String> suffixes(String str, int j) {
        String strSlice = str.substring(1, j);
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < strSlice.length(); i++) {
            String slice = strSlice.substring(i, strSlice.length());
            list.add(slice);
        }
        return list;
    }

    public int intersection(List<String> a,List<String> b){
        for (int i = a.size()-1; i >=0; i--) {
            for (int j = 0; j < b.size(); j++) {
                if (a.get(i).equals(b.get(j)))
                    return a.get(i).length();
            }
        }
        return 0;
    }
}
