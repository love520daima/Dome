package com;

/**
 *
 */
public class Case04 {
    private static int x=100;

    public static void main(String[] args) {
        Case04 case04=new Case04();
        case04.x++;//101

        Case04 case041=new Case04();
        case041.x++;//102

        case04=new Case04();
        case04.x++;//103
        Case04.x--;//102
        System.out.println(x);

    }

}
