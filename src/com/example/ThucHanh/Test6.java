package com.example.ThucHanh;

import com.example.common.ConvertIntToList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test6 {
    final static int p=2147483647, W=8, a=524647, b= 32549;
    final static Logger logger = Logger.getLogger(Test6.class.getName());

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        float m = (float) (Math.log(p)/Math.log(2));
        int t = Math.round(m/W);
        ConvertIntToList convertIntToList = new ConvertIntToList();
        final List<Integer> A = test1.revertNumbertoArray(524647);
        final List<Integer> B = test1.revertNumbertoArray(32549);
        List<Integer> result = convertIntToList.convert(0,0,0,0,0,0,0,0);
        Collections.reverse(A);
        Collections.reverse(B);
        for(int i =0;i<t;i++){
            int U =0;
            for(int j =0;j<t;j++){
                int UV = result.get(j+i)+A.get(i)*B.get(j)+U;
                U =UV/256;
                result.set(j+i,UV%256);
            }
        }
        Collections.reverse(result);
        logger.log(Level.INFO,result.toString());
    }

}
