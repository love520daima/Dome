package com;

import java.io.*;

public class SerializeDemo01 {
    public static void main(String [] args)
    {
        Domain domain=new Domain();
        domain.setI(2);
        domain.setName("ko");

        System.out.println(domain);
        try
        {
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("d://employee.ser"));
            objectOutputStream.writeObject(domain);
            objectOutputStream.close();
            ObjectInputStream ko= new ObjectInputStream(new FileInputStream("d://employee.ser") );
            Object o = (Domain)ko.readObject();
            System.out.println(o);

            ko.close();
        }catch(IOException | ClassNotFoundException i)
        {
            i.printStackTrace();
        }
    }
}
