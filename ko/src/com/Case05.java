package com;

public interface Case05 {
    int frood=42;

}
class  Test implements Case05{
    private static int frood;



    public static void main(String[] args) {
        Test r=new Test();
        frood=r.frood;

        System.out.println(frood);
    }
}
