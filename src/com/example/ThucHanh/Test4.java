package com.example.ThucHanh;

import com.example.common.ConvertIntToList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test4 {
    public static final int p = 2147483647;
    final static Logger logger = Logger.getLogger(Test4.class.getName());
    public static final int W = 8;
    public static void main(String[] args) {
        ConvertIntToList convertIntToList =new ConvertIntToList();
        final List<Integer> A = convertIntToList.convert(127,255,255,254);
        final List<Integer> B = convertIntToList.convert(127,255,255,251);
        Test1 test1 = new Test1();
        Test2 test2 = new Test2();
        Test3 test3 = new Test3();
        List<Integer> addition = test2.addition(A,B);
        List<Integer> cloneArr = new ArrayList<Integer>(addition);
        cloneArr.remove(cloneArr.size()-1);
        List<Integer> result = new ArrayList<Integer>();
        List<Integer> revertPToArray = test1.revertNumbertoArray(p);
        if(addition.get(addition.size()-1)==1){
            result = test3.subtraction(cloneArr,revertPToArray);
        }else {
            result = test3.subtraction(revertPToArray,cloneArr);
        }
        logger.log(Level.INFO,result.toString());
    }
}
