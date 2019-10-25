package com;

public class Case {
    public static void main(String[] args) {
        Demo01 instance = Demo01.getInstance();
        instance.setA(13);
        System.out.println(instance.getA());

    }
}
