package com;

public class Text {
    public static void replacel(String text){
        text.replace('j','l');
    }

    public static void main(String[] args){
        String text = new String("java");
        String ko="java";
        Text.replacel(ko);
        System.out.println(ko);


    }
}

