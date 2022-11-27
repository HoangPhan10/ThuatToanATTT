package com.example.ThucHanh;

import com.example.common.ConvertIntToList;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test8 {
    final static Logger logger = Logger.getLogger(Test1.class.getName());

    public static void main(String[] args) {
        int p = 489573857;
        int a =45682375;
        int p1 = 489573857;
        int a1 =45682375;
        int r = 0;
        ConvertIntToList convertIntToList = new ConvertIntToList();
        List<Integer> result =convertIntToList.convert(1,0);
        while (r != 1) {
            r = a % p;
            int q = a / p;
            a = p;
            p = r;
            int x1 = result.get(result.size()-2);
            int x2 = result.get(result.size()-1);
            int x3 = x1-x2*q;
            result.add(x3);
        }
        logger.log(Level.INFO,String.format("%d ^-1 mod %d = %d",a1,p1,result.get(result.size()-1)));
    }
}
