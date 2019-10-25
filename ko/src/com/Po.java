package com;

public class Po extends Person  {

    public void Person(){
        super.Person();
        System.out.println("不是");
        System.out.println("底");
    }
    public String grade;
    public static void main(String[] args){
        Person person = new Person();
        person.Person();

        Po po1 = new Po();
        po1.Person();




    }}
