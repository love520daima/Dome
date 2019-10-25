package com;

public class  Demo01{
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    private static Demo01 demo02=new Demo01();
    private  Demo01(){

    }
    public static Demo01 getInstance(){
    return demo02;
}}
