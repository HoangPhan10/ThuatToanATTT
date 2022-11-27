package com.example.common;

import java.util.ArrayList;
import java.util.List;

public class ConvertIntToList {
    public List<Integer> convert(int a,int b,int c,int d){
        List<Integer> list = new ArrayList<Integer>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        return list;
    }
    public List<Integer> convert(int a,int b){
        List<Integer> list = new ArrayList<Integer>();
        list.add(a);
        list.add(b);
        return list;
    }
    public List<Integer> convert(int a,int b,int c,int d,int a1,int a2,int a3,int a4){
        List<Integer> list = new ArrayList<Integer>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        return list;
    }
}
