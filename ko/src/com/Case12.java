package com;

public class Case12 {
    public static int a=23;

     int Case1() {
        return 0;
    }


}
 class Teacher extends Case12{
    private static String name="tom";
    public Teacher(){
        super();

        System.out.println("this is a teacher");

    }
    public static void main(String[] args){

        Teacher teacher = new Teacher();
        System.out.println(teacher.name);
}}
