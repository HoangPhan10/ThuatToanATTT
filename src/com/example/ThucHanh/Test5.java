package com.example.ThucHanh;

import com.example.common.ConvertIntToList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test5 {
    public static final int p = 2147483647;
    public static final int a = 38762497;
    public static final int b = 568424364;
    public static final int W = 8;
    final static Logger logger = Logger.getLogger(Test5.class.getName());

    public static void main(String[] args) {
        ConvertIntToList convertIntToList = new ConvertIntToList();
        Test1 test1 = new Test1();
        Test2 test2 = new Test2();
        Test3 test3 = new Test3();
        final List<Integer> A = test1.revertNumbertoArray(a);
        final List<Integer> B = test1.revertNumbertoArray(b);
        List<Integer> subtraction = test3.subtraction(A, B);
        List<Integer> cloneArr = new ArrayList<Integer>(subtraction);
        cloneArr.remove(cloneArr.size() - 1);
        List<Integer> result = new ArrayList<Integer>();
        List<Integer> revertPToArray = test1.revertNumbertoArray(p);
        if (subtraction.get(subtraction.size() - 1) == 1) {
            result = test2.addition(cloneArr, revertPToArray);
        } else {
            result = cloneArr;
        }
        result.remove(result.size()-1);
        logger.log(Level.INFO,result.toString());
    }
}
