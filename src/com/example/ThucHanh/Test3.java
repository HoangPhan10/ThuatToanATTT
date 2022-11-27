package com.example.ThucHanh;

import com.example.common.ConvertIntToList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test3 {
    final static int w =8;
    final static int t =4;
    final static Logger logger = Logger.getLogger(Test3.class.getName());
    public static void main(String[] args) {
        ConvertIntToList convertIntToList =new ConvertIntToList();
        final List<Integer> A = convertIntToList.convert(2,79,120,1);
        final List<Integer> B = convertIntToList.convert(64,0,119,172);
        Test3 test3 = new Test3();
        test3.subtraction(A,B);
    }
    public List<Integer> subtraction(List<Integer> A,List<Integer> B){
        List<Integer> result = new ArrayList<Integer>();
        int epsilon =0;
        float e= (float) Math.pow(2,8);
        for(int i=t-1;i>=0;i--){
            int s = A.get(i)-B.get(i)-epsilon;

            if(s<0){
                s+=e;
                epsilon=1;
            }else epsilon = 0;
            int x = (int) (s%e);
            result.add(x);
        }
        Collections.reverse(result);
//        logger.log(Level.INFO,"( "+epsilon+" , "+result+" )");
        result.add(epsilon);
        return result;
    }

}
