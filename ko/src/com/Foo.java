package com;

public class Foo implements Runnable {

    @Override
    public void run() {
        System.out.println("三十多岁");
    }

    public static void main(String[] args) {
        new Thread(new Foo()).start();
    }
}
