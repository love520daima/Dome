package com;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Case03 {
    private int i = getJ();
    private int j = 0;

    public int getJ() {
        j = 10;
        System.out.println("主" + i);
        return j;
    }

    public static void main(String[] args) {
        Case03 demo = new Case03();

        System.out.println(demo.getJ());
    }
    }


