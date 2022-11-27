package com.example.ThucHanh;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test1 {
    final static int p = 2147483647;
    final static int w = 8;
    final static Logger logger = Logger.getLogger(Test1.class.getName());

    public static void main(String[] args) {
        int a = 524647;
        Test1 test1 = new Test1();
        List<Integer> result = test1.revertNumbertoArray(a);
        logger.log(Level.INFO,result.toString());
    }

    public List<Integer> revertNumbertoArray(int a) {
        List<Integer> result = new ArrayList<Integer>();
        float log2 = (float) (Math.log(p) / Math.log(2));
        float m = Math.round(log2);
        int t = (int) Math.round(m / w);
        for (int i = 1; i <= t; i++) {
            int powMath = (int) Math.pow(2, (t - i) * w);
            int a2 = a / powMath;
            result.add(a2);
            a -= a2 * powMath;
        }
        return result;
    }
}
